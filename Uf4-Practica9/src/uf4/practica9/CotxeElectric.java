/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf4.practica9;

/**
 *
 * @author ausias
 */
public class CotxeElectric extends Cotxe {

    public CotxeElectric(int portes, int passatgers, int velocitat, String color, int autonomia, String fabricant) {
        super(portes, passatgers, velocitat, color, autonomia, fabricant);
    }

    public CotxeElectric() {

    }

    @Override
    public String toString() {

        return "CotxeElectric{" + super.toString() + '}';
    }
}
