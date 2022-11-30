public class C3 extends C2 {
    public String c3name;
    private int c3i;
    protected float c3d;

    C3(){
        System.out.println("Classe C3: chamada do construtor padrao, sem parametros");
    }

    C3(String name, int i, float d){
        super(name, i, d);
        System.out.println("Classe C3: chamada do construtor com parametros");

    }

    public String getC3name() {
        return c3name;
    }

    public void setC3name(String c3name) {
        this.c3name = c3name;
    }

    public int getC3i() {
        return c3i;
    }

    public void setC3i(int c3i) {
        this.c3i = c3i;
    }

    public float getC3d() {
        return c3d;
    }

    public void setC3d(float c3d) {
        this.c3d = c3d;
    }

    public void mostrarAtributos(){
        System.out.println("Atributos c3");
        System.out.println("name: " + this.c3name);
        System.out.println("idade: " + this.c3i);
        System.out.println("dinheiro: " + this.c3d);
        System.out.println();
    }

    public void mostrarAtributoSuper(){
        System.out.println("Atributos super c3");
        System.out.println("name: " + super.name);
        System.out.println("idade: " + super.getI());
        System.out.println("dinheiro: " + super.d);
        System.out.println();
    }
}
