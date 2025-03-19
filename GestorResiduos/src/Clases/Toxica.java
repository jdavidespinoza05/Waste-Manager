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
public class Toxica extends NoReciclable {
    private String tipoToxico;

    public Toxica() {
    }

    public Toxica(String tipoToxico, int codigo, String nombre, String descripcion, boolean biodegradable, String categoria, String icono) {
        super(codigo, nombre, descripcion, biodegradable, categoria, icono);
        this.tipoToxico = tipoToxico;
    }

    public String getTipoToxico() {
        return tipoToxico;
    }

    public void setTipoToxico(String tipoToxico) {
        this.tipoToxico = tipoToxico;
    }

    @Override
    public String toString() {
        return "Toxica{" + super.toString() + "\n" +
               "tipoToxico=" + tipoToxico + '}';
    }
}
