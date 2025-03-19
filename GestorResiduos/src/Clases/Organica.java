/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author JOSUE
 */
public class Organica extends NoReciclable {
    private boolean compostable;

    public Organica() {
    }

    public Organica(boolean compostable, int codigo, String nombre, String descripcion, boolean biodegradable, String categoria, String icono) {
        super(codigo, nombre, descripcion, biodegradable, categoria, icono);
        this.compostable = compostable;
    }

    public boolean isCompostable() {
        return compostable;
    }

    public void setCompostable(boolean compostable) {
        this.compostable = compostable;
    }

    @Override
    public String toString() {
        return "Organica{" + super.toString() + "\n" +
               "compostable=" + compostable + '}';
    }
}
