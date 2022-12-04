package ex05;

public class Horista extends Funcionario {

	private double horas;

	public Horista() {
		
	}
	
    public Horista(String nome, String dataNascimento, double salario, double horas) {
		super(nome, dataNascimento, salario);
		this.horas = horas;
		
	}

    @Override
    public double salarioPadrao(double salario) {
    	   	
		return (salario * this.horas);
    	
    }

	public void setHoras(double horas) {
		this.horas = horas;
		
	}

	

}