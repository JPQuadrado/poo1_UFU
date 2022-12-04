package ex06.src;

public class CamaroteInferior extends Vip {
    private String localizacao;//setor sul ou norte

    public String getLocalizacao(){
        return this.localizacao;
    }

    public void imprimeLocalizao(){
        System.out.printf("%s\n",this.localizacao);
    }
}
