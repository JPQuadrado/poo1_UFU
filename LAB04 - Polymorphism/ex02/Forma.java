public class Forma {
    protected String nome;
    protected String tipo;



    Forma(){};

    Forma(String nome, String tipo){
        this.nome = nome;
        this.tipo = tipo;
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarDesc(){
        System.out.println("NOME: " + getNome());
        System.out.println("TIPO: " + getTipo());
    }
}


