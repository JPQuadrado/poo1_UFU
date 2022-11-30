import java.sql.Date;

public class Figurinhas {
    protected String name;
    protected Date birthdate;
    protected float height;
    protected float weight;
    protected String pos;
    protected String country;

    public Figurinhas(){};

    public Figurinhas(String name, String birthdate, float height, float weight, String pos, String country) {
        this.name = name;
        this.birthdate = Date.valueOf(birthdate);
        this.height = height;
        this.weight = weight;
        this.pos = pos;
        this.country = country;
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

    public void mostrarFigurinhas(){
        System.out.println();
        System.out.println("Nome: " + this.name);
        System.out.println("Data de nascimento: " + this.birthdate);
        System.out.println("Altura: " + this.height);
        System.out.println("Peso: " + this.weight);
        System.out.println("Posicao: " + this.pos);
        System.out.println("Pais: " + this.country);
    }
}