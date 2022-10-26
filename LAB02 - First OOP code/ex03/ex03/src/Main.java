import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        Figurinhas[] jogador = new Figurinhas[3];

        for(int i = 0; i < 3; i++){
            jogador[i] = new Figurinhas();
        }

        //  Jogador 1
        jogador[0].setName("Edmundo Alves de Souza Neto");
        jogador[0].setBirthday(Date.valueOf("1971-04-02"));
        jogador[0].setHeight(1.77F);
        jogador[0].setWeight(85);
        jogador[0].setPosition("Atacante");
        jogador[0].setCountry("Brasil");

        //  Jogador 2
        jogador[1].setName("Lucas Figueiredo dos Santos");
        jogador[1].setBirthday(Date.valueOf("2001-08-14"));
        jogador[1].setHeight(1.78F);
        jogador[1].setWeight(85);
        jogador[1].setPosition("Atacante");
        jogador[1].setCountry("Brasil");

        //  Jogador 3
        jogador[2].setName("Anderson Luiz de Carvalho - Nenê");
        jogador[2].setBirthday(Date.valueOf("1981-07-19"));
        jogador[2].setHeight(1.81F);
        jogador[2].setWeight(86);
        jogador[2].setPosition("Atacante");
        jogador[2].setCountry("Brasil");

        for(int i = 0; i < 3; i++){
            System.out.println(jogador[i].getName());
            System.out.println(jogador[i].getBirthday());
            System.out.println(jogador[i].getHeight());
            System.out.println(jogador[i].getWeight());
            System.out.println(jogador[i].getPosition());
            System.out.println(jogador[i].getCountry());
            System.out.println();
        }
    }
}
