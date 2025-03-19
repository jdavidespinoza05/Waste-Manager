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
public class Plastico extends Reciclable {
    private String tipoPlastico; // Ejemplo: PET, HDPE, PVC, etc.

    public Plastico() {
    }

    public Plastico(String tipoPlastico, int codigo, String nombre, String descripcion, boolean biodegradable, String categoria, String icono) {
        super(codigo, nombre, descripcion, biodegradable,categoria, icono);
        this.tipoPlastico = tipoPlastico;
    }

    public String getTipoPlastico() {
        return tipoPlastico;
    }

    public void setTipoPlastico(String tipoPlastico) {
        this.tipoPlastico = tipoPlastico;
    }

    @Override
    public String toString() {
        return "Plastico{" + super.toString() + "\n" +
               "tipoPlastico=" + tipoPlastico + '}';
    }
}