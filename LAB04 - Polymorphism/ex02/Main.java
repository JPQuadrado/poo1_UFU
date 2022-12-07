import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Forma[] fig = new Forma[6];

        Scanner input = new Scanner(System.in);

        fig[0] = new Circulo("Circulo_R3",3);
        fig[1] = new Triangulo("Triangulo_4X2",4,2);
        fig[2] = new Quadrado("Quadrado_5",5);

        fig[3] = new Esfera("Esfera_R7",7);
        fig[4] = new Cubo("Cubo_10", 10);
        fig[5] = new Tetraedro(6,4);

        for (int i=0; i < 6; i++){
            System.out.println();
            fig[i].mostrarDesc();
            System.out.println();
        }

    }
}
