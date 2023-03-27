package uf4.practica9;

public class Vehicle {

    private int velocitat;
    private String color;
    private int autonomia;
    private String fabricant;

    public Vehicle(int velocitat, String color, int autonomia, String fabricant) {
        this.velocitat = velocitat;
        this.color = color;
        this.autonomia = autonomia;
        this.fabricant = fabricant;
    }
    
    despegar() i aterrar() 

    public int getVelocitat() {
        return velocitat;
    }

    public void setVelocitat(int velocitat) {
        this.velocitat = velocitat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public String getFabricant() {
        return fabricant;
    }

    public void setFabricant(String fabricant) {
        this.fabricant = fabricant;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "velocitat=" + velocitat + ", color=" + color + ", autonomia=" + autonomia + ", fabricant=" + fabricant + '}';
    }
}
