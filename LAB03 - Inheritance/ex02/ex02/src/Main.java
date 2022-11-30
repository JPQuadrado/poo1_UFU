public class Main {
    public static void main(String[] args) {
        Figurinhas f1 =  new Figurinhas("Ronaldinho Gaúcho\n", "1975-03-21", 1.82F, 80F, "Atacante", "Brazil");
        FigurinhasExtra fl =  new FigurinhasExtra("Ronaldo Fenomeno", "1976-11-19", 1.83F, 98, "Atacante", "Brazil", "Ouro", "Rookie");
        f1.mostrarFigurinhas();
        fl.mostrarFigurinhas();
    }
}