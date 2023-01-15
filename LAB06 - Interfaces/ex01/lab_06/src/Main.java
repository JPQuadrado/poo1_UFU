import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produto[] prod = new Produto[3];
        Cliente[] clie = new Cliente[3];
        Servico[] serv = new Servico[3];

        Scanner input = new Scanner(System.in);

        for(int i=0; i<3; i++){
            System.out.println("Escreva o ID do Produto n°" + (i+1));
            int a = input.nextInt();
            prod[i] = new Produto(a);
            input.nextLine();
            System.out.println("Escreva o NOME do Cliente n°" + (i+1));
            String b = input.nextLine();
            clie[i] = new Cliente(b);
            System.out.println("Escreva o PRECO do Servico n°" + (i+1));
            float c = input.nextFloat();
            serv[i] = new Servico(c);
        }
        Classificador.ordena(prod);
        Classificador.ordena(clie);
        Classificador.ordena(serv);


        for(int i=0; i<3; i++){
            System.out.println("\nPRODUTOS:");
            System.out.println(prod[i].getCodigo() + "\n");
        }

        for(int i=0; i<3; i++){
            System.out.println("\nCLIENTES:");
            System.out.println(clie[i].getName() + "\n");
        }

        for(int i=0; i<3; i++){
            System.out.println("\nSERVICO:");
            System.out.println(serv[i].getPreco() + "\n");
        }




    }
}