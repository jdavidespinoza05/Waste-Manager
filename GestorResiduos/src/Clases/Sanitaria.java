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
public class Sanitaria extends NoReciclable {
    private String tipoDesecho;

    public Sanitaria() {
    }

    public Sanitaria(String tipoDesecho, int codigo, String nombre, String descripcion, boolean biodegradable, String categoria, String icono) {
        super(codigo, nombre, descripcion, biodegradable, categoria, icono);
        this.tipoDesecho = tipoDesecho;
    }

    public String getTipoDesecho() {
        return tipoDesecho;
    }

    public void setTipoDesecho(String tipoDesecho) {
        this.tipoDesecho = tipoDesecho;
    }

    @Override
    public String toString() {
        return "Sanitaria{" + super.toString() + "\n" +
               "tipoDesecho=" + tipoDesecho + '}';
    }
}
