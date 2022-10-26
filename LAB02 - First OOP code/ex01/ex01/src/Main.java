import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        Figurinhas jogador1 = new Figurinhas();
        Figurinhas jogador2 = new Figurinhas();
        Figurinhas jogador3 = new Figurinhas();

        //  Jogador 1
        jogador1.name = "Edmundo Alves de Souza Neto";
        jogador1.birthday = Date.valueOf("1971-04-02");
        jogador1.height = 1.77F;
        jogador1.weight = 85;
        jogador1.position = "Atacante";
        jogador1.country = "Brasil";

        //  Jogador 2
        jogador2.name = "Lucas Figueiredo dos Santos";
        jogador2.birthday = Date.valueOf("2001-08-14");
        jogador2.height = 1.78F;
        jogador2.weight = 85;
        jogador2.position = "Atacante";
        jogador2.country = "Brasil";

        //  Jogador 3
        jogador3.name = "Anderson Luiz de Carvalho - Nenê";
        jogador3.birthday = Date.valueOf("1981-07-19");
        jogador3.height = 1.81F;
        jogador3.weight = 86;
        jogador3.position = "Atacante";
        jogador3.country = "Brasil";

        System.out.println(jogador1.name);
        System.out.println(jogador1.birthday);
        System.out.println(jogador1.height);
        System.out.println(jogador1.weight);
        System.out.println(jogador1.position);
        System.out.println(jogador1.country);
        System.out.println("========================================");
        System.out.println(jogador2.name);
        System.out.println(jogador2.birthday);
        System.out.println(jogador2.height);
        System.out.println(jogador2.weight);
        System.out.println(jogador2.position);
        System.out.println(jogador2.country);
        System.out.println("========================================");
        System.out.println(jogador3.name);
        System.out.println(jogador3.birthday);
        System.out.println(jogador3.height);
        System.out.println(jogador3.weight);
        System.out.println(jogador3.position);
        System.out.println(jogador3.country);
    }
}
