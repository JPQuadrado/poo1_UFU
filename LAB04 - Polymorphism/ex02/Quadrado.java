public class Quadrado extends FormaBidimensional  {
    protected float lateral;

    Quadrado(){
        super("Quadrado NaN","Bidmensional","Quadrado");
        this.lateral = 0;
    }

    Quadrado(float lateral){
        super("Quadrado NaN","Bidmensional","Quadrado");
        this.lateral = lateral;
    }

    Quadrado(String name, float lateral){
        super(name,"Bidmensional","Quadrado");
        this.lateral = lateral;
    };

    public float getLateral() {
        return lateral;
    }

    public void setLateral(float lateral) {
        this.lateral = lateral;
    }

    public void obterArea(){
        float area = (float) (getLateral()*getLateral());
        super.setArea(area);
    }

    public void mostrarDesc(){
        super.mostrarDesc();
        System.out.println("LATERAL: " + getLateral());
    }
}
