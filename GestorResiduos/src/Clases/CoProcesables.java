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
public class CoProcesables extends Reciclable {
    private String procesoReciclaje;

    public CoProcesables() {
    }

    public CoProcesables(String procesoReciclaje, int codigo, String nombre, String descripcion, boolean biodegradable, String categoria, String icono) {
        super(codigo, nombre, descripcion, biodegradable, categoria, icono);
        this.procesoReciclaje = procesoReciclaje;
    }


    public String getProcesoReciclaje() {
        return procesoReciclaje;
    }

    public void setProcesoReciclaje(String procesoReciclaje) {
        this.procesoReciclaje = procesoReciclaje;
    }

    @Override
    public String toString() {
        return "CoProcesables{" + super.toString() + "\n" +
               "procesoReciclaje=" + procesoReciclaje + '}';
    }
}
