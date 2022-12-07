public class Triangulo extends FormaBidimensional {

    protected float base;
    protected float altura;

    Triangulo(){
        super("Triangulo NaN","Bidmensional","Triangulo");
        this.base = 0;
        this.altura = 0;
    }

    Triangulo(float base, float altura){
        super("Triangulo NaN","Bidmensional","Triangulo");
        this.base = base;
        this.altura = altura;
    }

    Triangulo(String name, float base, float altura){
        super(name,"Bidmensional","Triangulo");
        this.base = base;
        this.altura = altura;
    };

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void obterArea(){
        float area = (float) ((getBase()*getAltura())/2);
        super.obterArea(area);
    }
    public void mostrarDesc(){
        super.mostrarDesc();
        System.out.println("BASE: " + getBase());
        System.out.println("ALTURA: " + getAltura());
    }
}
