import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        Selecao sel = new Selecao("Brasil", "Tite");

        for (int i=0; i<11; i++){
            sel.setJogador(i, "A", Date.valueOf("1999-08-12"), 1.8F, 90F, "Atacante");
        }

        for (int i=0; i<11; i++){
            System.out.println(sel.getJogadores(i));
            System.out.println();
        }
    }
}