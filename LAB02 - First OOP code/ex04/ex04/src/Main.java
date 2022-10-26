import java.sql.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Selecao selecao = new Selecao();
        Figurinhas[] jogador = new Figurinhas[11];

        for(int i=0; i<2; i++){
            jogador[i] = new Figurinhas();
        }

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        for(int i=0; i<2; i++){
            System.out.printf("\nJOGADOR %d\n",i+1);
            System.out.println("Nome");
            jogador[i].setName(input.nextLine());
            System.out.println("Data");
            jogador[i].setBirthday(Date.valueOf(input.nextLine()));
            System.out.println("Altura");
            jogador[i].setHeight(input.nextFloat());
            System.out.println("Peso");
            jogador[i].setWeight(input.nextFloat());
            System.out.println("Posição");
            jogador[i].setPosition(input.nextLine());
            System.out.println("Pais");
            jogador[i].setCountry(input.nextLine());

        }

    }
}