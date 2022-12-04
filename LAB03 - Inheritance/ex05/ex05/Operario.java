package ex05;

public class Operario extends Funcionario {


	private int qtdProd;
	
	public Operario() {
		
	}
    public int getQtdProd() {
		return qtdProd;
	}
	public void setQtdProd(int qtdProd) {
		this.qtdProd = qtdProd;
	}
	public Operario(String nome, String dataNascimento, double salario) {
		super(nome, dataNascimento, salario);
		
	}
    public Operario(String nome, String dataNascimento, double salario,int qtdProd) {
		super(nome, dataNascimento, salario);
		this.qtdProd = qtdProd;
		
	}

    @Override
    public double salarioPadrao(double salario) {
    	
    	return (salario*this.qtdProd);
    }
    
	
}