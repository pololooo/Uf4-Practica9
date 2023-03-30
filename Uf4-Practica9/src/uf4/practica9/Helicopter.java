package uf4.practica9;

public class Helicopter extends Vehicle {

    private String varietat;
    private int potenciaMotor;

    public Helicopter(String varietat, int potenciaMotor, int velocitat, String color, int autonomia, String fabricant) {
        super(velocitat, color, autonomia, fabricant);
        this.varietat = varietat;
        this.potenciaMotor = potenciaMotor;
    }

    public Helicopter() {

    }

    public String getVarietat() {
        return varietat;
    }

    public void setVarietat(String varietat) {
        this.varietat = varietat;
    }

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    @Override
    public String toString() {
        return "Helicopter{" + "varietat=" + varietat + ", potenciaMotor=" + potenciaMotor + '}';
    }
}
