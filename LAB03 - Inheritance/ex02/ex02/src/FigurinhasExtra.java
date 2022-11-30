import java.sql.Date;

public class FigurinhasExtra extends Figurinhas {
    private String color;
    private String type;

    FigurinhasExtra(String name, String birthdate, float height, float weight, String pos, String country, String color, String type){
        super(name, birthdate, height, weight, pos, country);
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
    public void mostrarFigurinhas(){
        System.out.println();
        System.out.println("Nome: " + this.name);
        System.out.println("Data de nascimento: " + this.birthdate);
        System.out.println("Altura: " + this.height);
        System.out.println("Peso: " + this.weight);
        System.out.println("Posicao: " + this.pos);
        System.out.println("Pais: " + this.country);
        System.out.println("Cor: " + this.color);
        System.out.println("Categoria: " + this.type);
    }
}
