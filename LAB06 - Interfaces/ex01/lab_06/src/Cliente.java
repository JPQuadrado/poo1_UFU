public class Cliente implements Classificavel{
    private String name;

    public boolean eMenorQue(Classificavel c){
        Cliente compara = ( Cliente ) c;

        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}