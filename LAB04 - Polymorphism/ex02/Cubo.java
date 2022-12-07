public class Cubo extends FormaTridimensional{
    protected float lado;


    Cubo(){
        super("Cubo NaN","Tridmensional","Cubo");
        this.lado = 0;
    }

    Cubo(float raio){
        super("Cubo NaN","Tridmensional","Cubo");
        this.lado = raio;
    }

    Cubo(String name, float raio){
        super(name,"Tridmensional","Cubo");
        this.lado = raio;
    };

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public void obterArea(){
        float area = (float) (6*getLado()*getLado());
        super.obterArea(area);
    }

    public void obterVolume(){
        float volume = (float) (getLado()*getLado()*getLado());
        super.obterVolume(volume);
    }

    public void mostrarDesc(){
        super.mostrarDesc();
        System.out.println("LATERAL: " + getLado());
    }
}
