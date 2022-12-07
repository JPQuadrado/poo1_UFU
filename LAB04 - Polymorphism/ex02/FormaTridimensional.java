public class FormaTridimensional extends Forma {
    protected String formato;
    protected float area;
    protected float volume;


    public FormaTridimensional(){
        super("NaN", "NaN");
        this.formato = "NaN";
    };
    public FormaTridimensional(String formato) {
        this.formato = formato;
    }

    public FormaTridimensional(String nome, String Tipo, String formato) {
        super(nome, Tipo);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public void obterArea(float area){
        setArea(area);
    }

    public void obterVolume(float volume){
        setVolume(volume);
    }

    public void mostrarDesc(){
        super.mostrarDesc();
        System.out.println("FORMATO: " + getFormato());
        System.out.println("AREA: " + getArea());
        System.out.println("VOLUME: " + getVolume());
    }

}
