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
public class Electronica extends NoReciclable {
    private String tipoDispositivo;

    public Electronica() {
    }

    public Electronica(String tipoDispositivo, int codigo, String nombre, String descripcion, boolean biodegradable, String categoria, String icono) {
        super(codigo, nombre, descripcion, biodegradable, categoria, icono);
        this.tipoDispositivo = tipoDispositivo;
    }

    public String getTipoDispositivo() {
        return tipoDispositivo;
    }

    public void setTipoDispositivo(String tipoDispositivo) {
        this.tipoDispositivo = tipoDispositivo;
    }

    @Override
    public String toString() {
        return "Electronica{" + super.toString() + "\n" +
               "tipoDispositivo=" + tipoDispositivo + '}';
    }
}
