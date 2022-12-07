public class Tetraedro extends FormaTridimensional{

    protected float lado;
    protected float altura;

    Tetraedro(){
        super("Tetraedro NaN","Tridimensional","Tetraedro");
        this.lado = 0;
        this.altura = 0;
    }

    Tetraedro(float lado, float altura){
        super("Tetraedro NaN","Tridimensional","Tetraedro");
        this.lado = lado;
        this.altura = altura;
    }

    Tetraedro(String name, float lado, float altura){
        super(name,"Tridimensional","Tetraedro");
        this.lado = lado;
        this.altura = altura;
    };

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void obterArea(){
        float area = (float) (getLado()*getLado()*Math.sqrt(3));
        super.obterArea(area);
    }

    public void obterVolume(){
        float volume = (float) ((getArea()*getAltura())/3);
        super.obterVolume(volume);
    }

    public void mostrarDesc(){
        super.mostrarDesc();
        System.out.println("LATERAL: " + getLado());
        System.out.println("ALTURA: " + getAltura());
    }

}
