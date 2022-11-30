public class C1 {
    public String name;
    private int i;
    protected float d;

    C1(){
        System.out.println("Classe C1: chamada do construtor padrao, sem parametros");
    }

    C1(String name, int i, float d){
        this.name = name;
        this.i = i;
        this.d = d;
        System.out.println("Classe C1: chamada do construtor com parametros");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public float getD() {
        return d;
    }

    public void setD(float d) {
        this.d = d;
    }

    public void mostrarAtributos(){
        System.out.println("Atributos c1");
        System.out.println("name: " + this.name);
        System.out.println("idade: " + this.i);
        System.out.println("dinheiro: " + this.d);
        System.out.println();
    }

}
