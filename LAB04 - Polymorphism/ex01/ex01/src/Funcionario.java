import java.sql.Date;

public class Funcionario extends Empresa{
    protected String name;
    protected String nasc; //this.birthdate = java.sql.Date.valueOf(birthdate);
    protected float salario;
    String cargo;

    public Funcionario(String name, String nasc, float salario, String cargo) {
        this.name = name;
        this.nasc = nasc;
        this.salario = salario;
        this.cargo = cargo;
    }

    public void Funcionario(){
        this.name = "NaN";
        this.nasc = "1111-11-11";
        this.salario = 0F;
        this.cargo = "NaN";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getNasc() {
        return nasc;
    }

    public void setNasc(String nasc) {
        this.nasc = nasc;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return this.cargo;
    }
}

