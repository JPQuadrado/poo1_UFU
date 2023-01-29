public class C_Funcionario {
    public String name;
    private String cpf;
    public float sal;
    private float teto_sal = 40000;



    // Esperado ser passado 0.1, 0.05 -> 10% 5%
    public void aumentaSalario(float a){
        float aumento = 0;
        if (a < 0) {
            throw new IllegalStateException("Erro: Porcentagem negativa, pode gerar valor inválido de salário");
        }else{
            aumento = this.sal * a;
        }

        float newSal = this.sal + aumento;

        if(newSal > this.teto_sal ){
            throw new IllegalStateException("Erro: Valor ultrapassa o teto");
        }else{
            this.setSal(newSal);
        }

    }

    public C_Funcionario() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSal() {
        return sal;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }

    public float getTeto_sal() {
        return teto_sal;
    }

    public void setTeto_sal(float teto_sal) {
        this.teto_sal = teto_sal;
    }
}
