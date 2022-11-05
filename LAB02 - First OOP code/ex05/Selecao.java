import java.util.Date;

public class Selecao {
    private String name;
    private String tecnico;
    private Figurinha[] jogadores = new Figurinha[11];

    public Selecao(String name, String tecnico) {
        this.name = name;
        this.tecnico = tecnico;
        for(int i =0; i<11; i++){
            jogadores[i] = new Figurinha(this.name);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public String getJogadores(int i) {
        return jogadores[i].toString();
    }

    public void setJogador(int i, String nome, Date birthdate, Float altura, Float peso, String pos) {
        this.jogadores[i].setName(nome);
        this.jogadores[i].setBirthday(birthdate);
        this.jogadores[i].setHeight(altura);
        this.jogadores[i].setWeight(peso);
        this.jogadores[i].setPosition(pos);
    }
}
