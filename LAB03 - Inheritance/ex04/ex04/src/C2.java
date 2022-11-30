public class C2 extends C1 {

    public String c2name;
    private int c2i;
    protected float c2d;
    C2(){
        System.out.println("Classe C2: chamada do construtor padrao, sem parametros");
    }

    C2(String name, int i, float d){
        this.c2name = name;
        this.c2i = i;
        this.c2d = d;
        System.out.println("Classe C2: chamada do construtor com parametros");

    }

    public String getC2name() {
        return c2name;
    }

    public void setC2name(String c2name) {
        this.c2name = c2name;
    }

    public int getC2i() {
        return c2i;
    }

    public void setC2i(int c2i) {
        this.c2i = c2i;
    }

    public float getC2d() {
        return c2d;
    }

    public void setC2d(float c2d) {
        this.c2d = c2d;
    }

    public void mostrarAtributos(){
        System.out.println("Atributos c2");
        System.out.println("name: " + this.c2name);
        System.out.println("idade: " + this.c2i);
        System.out.println("dinheiro: " + this.c2d);
        System.out.println();
    }

    public void mostrarAtributoSuper(){
        System.out.println("Atributos super c2");
        System.out.println("name: " + super.name);
        System.out.println("idade: " + super.getI());
        System.out.println("dinheiro: " + super.d);
        System.out.println();
    }
}
