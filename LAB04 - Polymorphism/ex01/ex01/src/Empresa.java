public class Empresa {

    protected String nome;

    public Empresa(String cj_selecta) {
    }

    public Empresa(){
        this.nome = "NaN";
    };

    public void Empresa(String nome){
        this.nome = nome;
    };


    public void folhadePagamento(Funcionario A){
        System.out.println("----------------------------------------------------------");
        System.out.println("Cargo: " + A.getCargo());
        System.out.println("Nome: " + A.getName());
        System.out.println("Data de Nascimento: " + A.getNasc());
        System.out.println("Salario: " + A.getSalario());
        System.out.println("----------------------------------------------------------");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void main(String [] args){

        Empresa cj = new Empresa("Cj Selecta");

        Funcionario[] func = new Funcionario[4];

        func[0] = new Chefe("Roberto","1975-12-25", 15000);
        func[1] = new Vendedores("Maria", "1982-02-26", 350, 10);
        func[2] = new Operario("João Pedro", "1999-08-11", 5000, 0.50F);
        func[3] = new Horista("Fernanda", "1996-05-29",40.8F, 45);

        for(int i=0; i<4; i++){
            cj.folhadePagamento(func[i]);
        }

    }
}
