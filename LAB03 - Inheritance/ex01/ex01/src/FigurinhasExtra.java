import java.sql.Date;

public class FigurinhasExtra {
    private String name;
    private Date birthdate;
    private float height;
    private float weight;
    private String pos;
    private String country;
    private String color;
    private String type;


    public FigurinhasExtra(String name, String birthdate, float height, float weight, String pos, String country, String color, String type) {
        this.name = name;
        this.birthdate = Date.valueOf(birthdate);
        this.height = height;
        this.weight = weight;
        this.pos = pos;
        this.country = country;
        this.color = color;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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
