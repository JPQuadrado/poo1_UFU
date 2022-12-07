public class Esfera extends FormaTridimensional{
    protected float raio;


    Esfera(){
        super("Esfera NaN","Tridmensional","Esfera");
        this.raio = 0;
    }

    Esfera(float raio){
        super("Esfera NaN","Tridmensional","Esfera");
        this.raio = raio;
    }

    Esfera(String name, float raio){
        super(name,"Tridmensional","Esfera");
        this.raio = raio;
    };

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public void obterArea(){
        float area = (float) (4*Math.PI*getRaio()*getRaio());
        super.obterArea(area);
    }

    public void obterVolume(){
        float volume = (float) ((4*Math.PI*getRaio()*getRaio()*getRaio())/3);
        super.obterVolume(volume);
    }

    public void mostrarDesc(){
        super.mostrarDesc();
        System.out.println("RAIO: " + getRaio());
    }
}
