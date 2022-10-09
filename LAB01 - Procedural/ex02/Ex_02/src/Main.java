import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        String[] nome = new String[4];
        float[] preco = new float[4];
        int[] qtd_estoque = new int[4];

        for(int i=0; i<4; i++){
            System.out.println("Informe Nome, Preco e Quantidade em Estoque do Produto n°" + (i+1));
            nome[i] = input.nextLine();
            preco[i] = input.nextFloat(); // Float se passa com , em JAVA
            qtd_estoque[i] = input.nextInt();
            input.nextLine();
        }

        System.out.println("Reduzindo o preco em 5% do produto 2");
        if(altera_preco(preco[1],-5) ==-1){
            System.out.println("Erro: preco nao alterado. Porcentagem invalida\n");
        }

        System.out.println("Alterando o preco do prod. 3");
        if(altera_preco(preco[3],-110) ==-1){
            System.out.println("Erro: preco nao alterado. Porcentagem invalida\n");
        }

        System.out.println("Produtos Cadastrados");
        for (int i=0; i<4; i++){
            System.out.println("Produto: "+nome[i]+" Preco: "+ preco[i] + " Estoque: " + qtd_estoque[i]);
        }

    }

    public static int altera_preco(float valor, float porcentagem){
        float temp;
        if(porcentagem > -100){
            temp = 1 + porcentagem/100;
            valor = valor*temp;
            return 0;
        }else{
            return -1;
        }
    }
}