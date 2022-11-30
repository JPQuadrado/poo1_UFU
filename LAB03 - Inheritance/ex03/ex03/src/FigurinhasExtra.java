import java.sql.Date;

public class FigurinhasExtra extends Figurinhas {
    private String color;
    private String type;

    FigurinhasExtra(Figurinhas f, String color, String type){
        super(f.getName(), f.getBirthdate().toString(), f.getHeight(), f.getWeight(), f.getPos(), f.getCountry());
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void mostrarFigurinhas() {
        super.mostrarFigurinhas();
        System.out.println("Cor: " + this.color);
        System.out.println("Categoria: " + this.type);
    }
}