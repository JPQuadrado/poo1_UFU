import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;

public class principal {
    public static void ex01(){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int[] valores = new int[6];

        System.out.println("<< Listando um vetor >>");
        System.out.println("Entre com o número 1:");
        valores[0] = sc.nextInt();

        System.out.println("Entre com o número 2:");
        valores[1] = sc.nextInt();

        System.out.println("Entre com o número 3:");
        valores[2] = sc.nextInt();

        System.out.println("Entre com o número 4:");
        valores[3] = sc.nextInt();

        System.out.println("Entre com o número 5:");
        valores[4] = sc.nextInt();

        System.out.println("Entre com o número 6:");
        valores[5] = sc.nextInt();

        System.out.println("Os valores lidos são:");
        System.out.printf("%d %d %d %d %d %d ", valores[0], valores[1], valores[2], valores[3], valores[4], valores[5]);
    }

    public static void ex02(){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex03() {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int[] vet = new int[6];
        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 5; i >=0; i--){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex04() {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int[] vet = new int[6];
        int i =0;
        System.out.println("<< Listando um vetor >>");

        while(true){

            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
            if(vet[i] %2 !=0){
                System.out.println("Erro: Valor inválido");
            }
            else{
                i++;
            }
            if(i==6){
                break;
            }

        }

        System.out.println("Os números pares digitados foram: ");
        for (int j = 0; j < 6; j++){
            System.out.printf("%d ",vet[j]);
        }
    }
    public static void ex05() {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int[] vet = new int[5];
        int maior=0,menor=0;
        float media;
        float soma=0;
        for (int i = 0; i < 5; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
            if(i ==0){
                maior = vet[i];
                menor = vet[i];
            }
            if(vet[i] > maior){
                maior = vet[i];

            }
            if(vet[i] < menor){
                menor = vet[i];
            }
            soma += vet[i];

        }
        media = soma / 5;
        System.out.println("Os números digitados são: ");
        for (int i = 0; i <5; i++){
            System.out.printf("%d ",vet[i]);
        }
        System.out.printf("\nO maior valor é: %d\n",maior);
        System.out.printf("O menor valor é: %d\n",menor);
        System.out.printf("A media é: %.1f\n",media);
    }

    public static void ex06() {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int[] vet = new int[5];
        int maior=0,menor=0;
        float media;
        float soma=0;
        int posmaior=0,posmenor=0;
        for (int i = 0; i < 5; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
            if(i ==0){
                maior = vet[i];
                menor = vet[i];
            }
            if(vet[i] > maior){
                maior = vet[i];
                posmaior=i;

            }
            if(vet[i] < menor){
                menor = vet[i];
                posmenor=i;
            }
            soma += vet[i];

        }
        media = soma / 5;
        System.out.println("Os números digitados são: ");
        for (int i = 0; i <5; i++){
            System.out.printf("%d ",vet[i]);
        }
        System.out.printf("\nO maior valor é: %d, localizado na posição %d do vetor\n",maior,posmaior);
        System.out.printf("O menor valor é: %d, localizado na posição %d do vetor\n",menor,posmenor);
        System.out.printf("A media é: %.1f\n",media);
    }
    public static void ex07() {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int[] vet = new int[5];
        float maior=0;
        float proporcao;
        for (int i = 0; i < 5; i++) {
            System.out.printf("Entre com a nota do aluno %d: \n", i + 1);
            vet[i] = sc.nextInt();
            if (i == 0) {
                maior = vet[i];
            }
            if (vet[i] > maior) {
                maior = vet[i];


            }

        }
        proporcao = 100/maior;
        System.out.println("Notas normalizadas");
        for (int i = 0; i <5; i++){
            vet[i] *= proporcao;
            System.out.printf("A nota do aluno %d é %d\n",i+1,vet[i]);
        }

    }
    public static void ex08() {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int[] val = new int[5];
        float sum = 0;

        System.out.println("<< Média e desvio padrão >>");
        for(int i=0; i<5; i++){
            System.out.printf("Digite o valor %d: ",i+1);
            val[i] = input.nextInt();
            sum += val[i];
        }

        double media = sum/5;

        // Desvio padrão amostral, normalizado por n-1
        // s = sqrt(a*SOMATORIO(x - MEDIA)^2)
        // onde a = 1/(n-1)

        double a = 1.0/(5.0-1.0);
        double sumDesvio = 0;

        for(int i =0; i<5; i++){
            sumDesvio += Math.pow((val[i]-media),2);
        }

        double desvio = Math.sqrt(a*sumDesvio);


        System.out.printf("A média é %.0f e o desvio padrão é %f\n", media,desvio);
        //Como fazer aparecer mais casas?
    }

    public static void ex09(){
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        int n;
        float sumMedia = 0.0F;

        System.out.println("<< Média de n alunos. Máximo 100 alunos >>");
        System.out.printf("Entre com o numero de alunos: ");
        n = input.nextInt();
        if(n > 10){
            System.out.println("Erro! O número maximo de alunos permitido é de 100");
        }

        float[] aluno = new float[n];

        for(int i=0; i<n; i++){
            System.out.printf("Digite a nota do aluno %d: ",i+1);
            aluno[i] = input.nextFloat();
            sumMedia += aluno[i];
        }

        float media = sumMedia/n;


        System.out.println("\nRelatorio de Notas");
        for(int i=0; i<n; i++){
            System.out.printf("A nota do aluno %d: %.0f \n",i+1,aluno[i]);
        }

        System.out.printf("A media da turma é:  %.1f", media);

    }

    public static void ex10(){
        Scanner input = new Scanner(System.in);
        System.out.println("<< Subtração de vetores >>");

        int[] a = new int[3];
        int[] b = new int[3];
        int[] c = new int[3];


        for(int j = 0; j<2 ; j++){
            for (int i = 0; i<3 ;i++){
                if(j==0) {
                    System.out.printf("Digite o valor %d de A: ",i+1);
                    a[i] = input.nextInt();
                }else {
                    System.out.printf("Digite o valor %d de B: ", i+1);
                    b[i] = input.nextInt();

                }
            }
            System.out.println();
        }

        for(int i =0; i<3; i++){
            c[i] = a[i] - b[i];
        }

        System.out.printf("O vetor C, definido como C = A-B é (%d,%d,%d)\n", c[0],c[1],c[2]);

    }

    public static void ex11(){
        Scanner input = new Scanner(System.in);
        System.out.println("<< Pares e Ímpares >>");

        // 0 não é par em impar

        int[] v = new int[5];
        int[] par = new int[5];
        int[] impar = new int[5];

        for(int i=0; i<5; i++){
            System.out.printf("Digite o valor %d: ",i+1);
            v[i] = input.nextInt();
        }

        for(int i = 0; i<5; i++){
            if(v[i]%2 == 0 && v[i]!=0){
                par[i] = v[i];
            }else{
                impar[i] = v[i];
            }
        }
        System.out.printf("\nImpares: ");
        for(int j=0; j<5; j++){
            if(impar[j] != 0){
                System.out.printf("%d ",impar[j]);
            }
        }

        System.out.printf("\nPares: ");
        for(int j=0; j<5; j++){
            if(par[j] != 0){
                System.out.printf("%d ",par[j]);
            }
        }
    }

    public static void ex12(){
        Scanner input = new Scanner(System.in);
        System.out.println("<< Probabilidades >>");

        int verde,azul,amarela,vermelha;

        float total;

        System.out.println("Digite a quantidade de bolinhas");
        System.out.printf("Verde: ");
        verde = input.nextInt();
        System.out.printf("Azul: ");
        azul = input.nextInt();
        System.out.printf("Amarela: ");
        amarela = input.nextInt();
        System.out.printf("Vermelha: ");
        vermelha = input.nextInt();


        total = verde+azul+amarela+vermelha;

        float pVerde,pAzul,pAmarela, pVermelha;
        pVerde = verde*100 / total; //0
        pAzul = azul*100 / total; // 1
        pAmarela = amarela*100 / total; //2
        pVermelha = vermelha*100 / total; //3

        float[] prob = new float[4];
        prob[0] = pVerde;
        prob[1] = pAzul;
        prob[2] = pAmarela;
        prob[3] = pVermelha;

        float maior = prob[0];
        int maiorIndex = 0;
        for(int i = 1; i<4; i++){
            if(prob[i] > maior){
                maior = prob[i];
                maiorIndex = i;
            }
        }

        System.out.println("\nProbabilidades:");
        switch (maiorIndex){
            case 0:
                System.out.printf("Verde: %.1f <<< Maior Probabilidade\n", pVerde);
                System.out.printf("Azul: %.1f\n", pAzul);
                System.out.printf("Amarela: %.1f\n", pAmarela);
                System.out.printf("Vermelha: %.1f\n", pVermelha);
                break;
            case 1:
                System.out.printf("Verde: %.1f\n", pVerde);
                System.out.printf("Azul: %.1f <<< Maior Probabilidade\n", pAzul);
                System.out.printf("Amarela: %.1f\n", pAmarela);
                System.out.printf("Vermelha: %.1f\n", pVermelha);
                break;
            case 2:
                System.out.printf("Verde: %.1f\n", pVerde);
                System.out.printf("Azul: %.1f\n", pAzul);
                System.out.printf("Amarela: %.1f <<< Maior Probabilidade\n", pAmarela );
                System.out.printf("Vermelha: %.1f\n", pVermelha);
                break;
            case 3:
                System.out.printf("Verde: %.1f\n", pVerde);
                System.out.printf("Azul: %.1f\n", pAzul);
                System.out.printf("Amarela: %.1f\n", pAmarela );
                System.out.printf("Vermelha: %.1f <<< Maior Probabilidade\n", pVermelha);
                break;
        }

    }

    public static void ex13(){
        Scanner input = new Scanner(System.in);
        System.out.println("<<Zerando negativos>>");

        int[] vet = new int[5];
        for(int i=0; i<5; i++){
            System.out.printf("Entre com o número %d: ",i+1);
            vet[i] = input.nextInt();
            if(vet[i] < 0){
                vet[i] = 0;
            }
        }

        System.out.printf("\nZerando os negativos obtém-se: ");
        for(int i=0; i<5; i++){
            System.out.printf("%d ", vet[i]);
        }
    }

    public static void ex14(){
        Scanner input = new Scanner(System.in);
        System.out.println("<< Universidade X >>");


    }

    public static void main(String[] args) {
        ex14();

    }
}