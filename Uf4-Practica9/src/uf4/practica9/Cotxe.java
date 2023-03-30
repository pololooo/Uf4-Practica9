package uf4.practica9;

public class Cotxe extends Vehicle {

    private int portes;
    private int passatgers;

    public Cotxe(int portes, int passatgers, int velocitat, String color, int autonomia, String fabricant) {
        super(velocitat, color, autonomia, fabricant);
        this.portes = portes;
        this.passatgers = passatgers;
    }

    public Cotxe() {

    }

    public int getPortes() {
        return portes;
    }

    public void setPortes(int portes) {
        this.portes = portes;
    }

    public int getPassatgers() {
        return passatgers;
    }

    public void setPassatgers(int passatgers) {
        this.passatgers = passatgers;
    }

    @Override
    public String toString() {
        return "Cotxe{" + "portes=" + portes + ", passatgers=" + passatgers + super.toString + '}';
    }
}
