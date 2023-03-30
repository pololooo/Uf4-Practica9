package uf4.practica9;

public class Veler extends Vehicle {

    private int manga;
    private int eslora;
    private int veles;

    public Veler(int manga, int eslora, int veles, int velocitat, String color, int autonomia, String fabricant) {
        super(velocitat, color, autonomia, fabricant);
        this.manga = manga;
        this.eslora = eslora;
        this.veles = veles;
    }

    public Veler() {

    }

    public int getManga() {
        return manga;
    }

    public void setManga(int manga) {
        this.manga = manga;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getVeles() {
        return veles;
    }

    public void setVeles(int veles) {
        this.veles = veles;
    }

    @Override
    public String toString() {
        return "Veler{" + "manga=" + manga
                + ", eslora=" + eslora
                + ", veles=" + veles
                + super.toString() + '}';
    }
}
