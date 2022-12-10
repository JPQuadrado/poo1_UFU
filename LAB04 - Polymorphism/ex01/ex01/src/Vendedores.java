public class Vendedores extends Funcionario{

    public Vendedores(String name, String nasc, int vendas, float comissao) {

        super(name, nasc, (float) vendas*comissao ,"Vendedor");

    }

}
