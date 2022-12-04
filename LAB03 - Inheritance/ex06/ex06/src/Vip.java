package ex06.src;

public class Vip extends Ingresso {
    private float adicional = 10;
    public float getValor(){
        return super.escreveValor()+adicional;
    }
}
