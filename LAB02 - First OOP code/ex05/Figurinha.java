import java.util.Date;

public class Figurinha {
    private String name;
    private Date birthday;
    private float height;
    private float weight;
    private String position;
    private String country;

    public Figurinha(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;

    }

    @Override
    public String toString(){
        String fig = this.name + ", " + this.birthday + ", " + this.height + ", "
                + this.weight + ", " + this.position + ", " + this.country;
        return fig;
    }
}