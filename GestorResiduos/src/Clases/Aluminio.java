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
public class Aluminio extends Reciclable {
    private boolean esLata;

    public Aluminio() {
    }

    public Aluminio(boolean esLata, int codigo, String nombre, String descripcion, boolean biodegradable, String categoria, String icono) {
        super(codigo, nombre, descripcion, biodegradable, categoria, icono);
        this.esLata = esLata;
    }

    public boolean isEsLata() {
        return esLata;
    }

    public void setEsLata(boolean esLata) {
        this.esLata = esLata;
    }

    @Override
    public String toString() {
        return "Aluminio{" + super.toString() + "\n" +
               "esLata=" + esLata + '}';
    }
}
