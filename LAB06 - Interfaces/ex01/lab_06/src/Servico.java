public class Servico implements Classificavel{

    private float preco;

    public boolean eMenorQue(Classificavel s){
        Servico compara = ( Servico ) s;

        return (this.preco < compara.preco);
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
