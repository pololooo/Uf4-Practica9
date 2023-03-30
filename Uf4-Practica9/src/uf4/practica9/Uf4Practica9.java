package uf4.practica9;

import java.util.*;

public class Uf4Practica9 {

    static Scanner scan = new Scanner(System.in);

    public static Vehicle v = new Vehicle();
    public static Helicopter h = new Helicopter();
    public static Veler ve = new Veler();
    public static Cotxe c = new Cotxe();
    public static CotxeElectric ce = new CotxeElectric();

    public static void menu() {
        int opc = 1;
        while (opc != 0) {

            System.out.println(" ");
            System.out.println("----- VEHICLES -----");
            System.out.println("1. Afegir Vehicle: ");
            System.out.println("2. Afegir Helicopter: ");
            System.out.println("3. Afegir Veler: ");
            System.out.println("4. Afegir Cotxe: ");
            System.out.println("5. Afegir Cotxe Electric: ");
            System.out.println("6. Mostrar Vehicle: ");
            System.out.println("7. Mostrar Helicopter: ");
            System.out.println("8. Mostrar Veler: ");
            System.out.println("9. Mostrar Cotxe: ");
            System.out.println("10. Mostrar Cotxe Electric: ");
            System.out.println("0. Sortir: ");
            System.out.println("Elegeix una opció: ");
            opc = scan.nextInt();
            switch (opc) {
                case 1:
                    afegirVehicle();
                    break;
                case 2:
                    afegirHelicopter();
                    break;
                case 3:
                    afegirVeler();
                    break;
                case 4:
                    afegirCotxe();
                    break;
                case 5:
                    afegirCotxeE();
                    break;
                case 6:
                    mostrarVehicle();
                    break;
                case 7:
                    mostrarHelicopter();
                    break;
                case 8:
                    mostrarVeler();
                    break;
                case 9:
                    mostrarCotxe();
                    break;
                case 10:
                    mostrarCotxeE();
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }
    }

    public static void afegirVehicle() {
        scan.reset();
        System.out.println("Velocitat: ");
        v.setVelocitat(scan.nextInt());
        System.out.println("Color: ");
        v.setColor(scan.next());
        System.out.println("Autonomia: ");
        v.setAutonomia(scan.nextInt());
        System.out.println("Fabricant: ");
        v.setFabricant(scan.next());
    }

    public static void mostrarVehicle() {
        System.out.println(v.toString());
    }

    public static void afegirHelicopter() {
        scan.reset();
        System.out.println("Varietat: ");
        h.setVarietat(scan.next());
        System.out.println("Potencia del Motor: ");
        h.setPotenciaMotor(scan.nextInt());
        System.out.println("Velocitat: ");
        h.setVelocitat(scan.nextInt());
        System.out.println("Color: ");
        h.setColor(scan.next());
        System.out.println("Autonomia: ");
        h.setAutonomia(scan.nextInt());
        System.out.println("Fabricant: ");
        h.setFabricant(scan.next());
    }

    public static void mostrarHelicopter() {
        System.out.println(h.toString());
    }

    public static void afegirVeler() {
        scan.reset();
        System.out.println("Manga: ");
        ve.setManga(scan.nextInt());
        System.out.println("Eslora: ");
        ve.setEslora(scan.nextInt());
        System.out.println("Veles: ");
        ve.setVeles(scan.nextInt());
        System.out.println("Velocitat: ");
        ve.setVelocitat(scan.nextInt());
        System.out.println("Color: ");
        ve.setColor(scan.next());
        System.out.println("Autonomia: ");
        ve.setAutonomia(scan.nextInt());
        System.out.println("Fabricant: ");
        ve.setFabricant(scan.next());
    }

    public static void mostrarVeler() {
        System.out.println(ve.toString());
    }

    public static void afegirCotxe() {
        scan.reset();
        System.out.println("Portes: ");
        c.setPortes(scan.nextInt());
        System.out.println("Passatgers: ");
        c.setPassatgers(scan.nextInt());
        System.out.println("Velocitat: ");
        c.setVelocitat(scan.nextInt());
        System.out.println("Color: ");
        c.setColor(scan.next());
        System.out.println("Autonomia: ");
        c.setAutonomia(scan.nextInt());
        System.out.println("Fabricant: ");
        c.setFabricant(scan.next());
    }

    public static void mostrarCotxe() {
        System.out.println(c.toString());
    }

    public static void afegirCotxeE() {
        scan.reset();
        System.out.println("Portes: ");
        ce.setPortes(scan.nextInt());
        System.out.println("Passatgers: ");
        ce.setPassatgers(scan.nextInt());
        System.out.println("Velocitat: ");
        ce.setVelocitat(scan.nextInt());
        System.out.println("Color: ");
        ce.setColor(scan.next());
        System.out.println("Autonomia: ");
        ce.setAutonomia(scan.nextInt());
        System.out.println("Fabricant: ");
        ce.setFabricant(scan.next());
    }

    public static void mostrarCotxeE() {
        System.out.println(ce.toString());
    }

    public static void main(String[] args) {
        menu();
    }
}
