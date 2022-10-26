import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        Figurinhas jogador1 = new Figurinhas();
        Figurinhas jogador2 = new Figurinhas();
        Figurinhas jogador3 = new Figurinhas();

        //  Jogador 1
        jogador1.setName("Edmundo Alves de Souza Neto");
        jogador1.setBirthday(Date.valueOf("1971-04-02"));
        jogador1.setHeight(1.77F);
        jogador1.setWeight(85);
        jogador1.setPosition("Atacante");
        jogador1.setCountry("Brasil");

        //  Jogador 2
        jogador2.setName("Lucas Figueiredo dos Santos");
        jogador2.setBirthday(Date.valueOf("2001-08-14"));
        jogador2.setHeight(1.78F);
        jogador2.setWeight(85);
        jogador2.setPosition("Atacante");
        jogador2.setCountry("Brasil");

        //  Jogador 3
        jogador3.setName("Anderson Luiz de Carvalho - Nenê");
        jogador3.setBirthday(Date.valueOf("1981-07-19"));
        jogador3.setHeight(1.81F);
        jogador3.setWeight(86);
        jogador3.setPosition("Atacante");
        jogador3.setCountry("Brasil");

        System.out.println(jogador1.getName());
        System.out.println(jogador1.getBirthday());
        System.out.println(jogador1.getHeight());
        System.out.println(jogador1.getWeight());
        System.out.println(jogador1.getPosition());
        System.out.println(jogador1.getCountry());
        System.out.println();

        System.out.println(jogador2.getName());
        System.out.println(jogador2.getBirthday());
        System.out.println(jogador2.getHeight());
        System.out.println(jogador2.getWeight());
        System.out.println(jogador2.getPosition());
        System.out.println(jogador2.getCountry());

        System.out.println();
        System.out.println(jogador3.getName());
        System.out.println(jogador3.getBirthday());
        System.out.println(jogador3.getHeight());
        System.out.println(jogador3.getWeight());
        System.out.println(jogador3.getPosition());
        System.out.println(jogador3.getCountry());
    }
}
