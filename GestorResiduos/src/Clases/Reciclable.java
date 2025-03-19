/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author jessi
 */

public class Reciclable extends Residuo {

    public Reciclable() {
    }

    public Reciclable(int codigo, String nombre, String descripcion, boolean biodegradable, String categoria, String icono) {
        super(codigo, nombre, descripcion, biodegradable, categoria, icono);
    }

    @Override
    public String toString() {
        return "Reciclable{" + super.toString() + '}';
    }
}
