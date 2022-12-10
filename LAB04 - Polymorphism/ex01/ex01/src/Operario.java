public class Operario extends Funcionario{

    public Operario(String name, String nasc, int qntP, float valorP) {

        super(name, nasc, (float) qntP*valorP ,"Operario");

    }

}