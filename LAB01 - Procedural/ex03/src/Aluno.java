import java.lang.System;

public class Aluno {
    private int iD;
    private String classe;
    private double cRA;

    public Aluno(int id, String cla, double cra){
        this.iD = id;
        this.classe = cla;
        this.cRA = cra;
    }

    public void mostrar() {
        System.out.printf("Número: %d Classe-Social: %s CRA: %2.f\n", iD,classe,cRA);
    }

}
