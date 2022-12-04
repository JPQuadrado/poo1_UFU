package ex06.src;

public class CamaroteSuperior extends Vip {
    private float adicional=10;

    public float getIngresso(){
       return adicional + super.getValor();
    }
}
