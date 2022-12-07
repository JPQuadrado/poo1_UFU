public class FormaBidimensional extends Forma {
    protected String formato;
    protected float area;


    public FormaBidimensional(){
        super("NaN", "NaN");
        this.formato = "NaN";
    };
    public FormaBidimensional(String formato) {
        this.formato = formato;
    }

    public FormaBidimensional(String nome, String Tipo, String formato) {
        super(nome, Tipo);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setFormato(String formato) {
        this.formato = formato;

    }

    public void obterArea(float area){
        setArea(area);
    }

    public void mostrarDesc(){
        super.mostrarDesc();
        System.out.println("FORMATO: " + getFormato());
        System.out.println("AREA: " + getArea());
    }
}

