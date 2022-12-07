public class Circulo extends FormaBidimensional {
    protected float raio;


    Circulo(){
        super("Circulo NaN","Bidmensional","Circulo");
        this.raio = 0;
    }

    Circulo(float raio){
        super("Circulo NaN","Bidmensional","Circulo");
        this.raio = raio;
    }

    Circulo(String name, float raio){
        super(name,"Bidmensional","Circulo");
        this.raio = raio;
    };

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public void obterArea(){
        float area = (float) (Math.PI*getRaio()*getRaio());
        super.obterArea(area);
    }

    public void mostrarDesc(){
        super.mostrarDesc();
        System.out.println("RAIO: " + getRaio());
    }
}
