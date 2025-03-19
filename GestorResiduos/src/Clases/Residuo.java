/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.Serializable;

/**
 *
 * @author jessi
 */

public abstract class Residuo implements Serializable {
    
    protected int codigo;
    protected String nombre;
    protected String descripcion;
    protected boolean biodegradable;
    protected String categoria;
    protected String icono;

    public Residuo() {
    }

    public Residuo(int codigo) {
        if (codigo <= 0) {
            throw new IllegalArgumentException("El código debe ser positivo.");
        }
        this.codigo = codigo;
    }

    public Residuo(int codigo, String nombre, String descripcion, boolean biodegradable, String categoria, String icono) {
        if (codigo <= 0) {
            throw new IllegalArgumentException("El código debe ser positivo.");
        }
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.biodegradable = biodegradable;
        this.categoria = categoria;
        this.icono = icono;
    }

    public String getCodigo() {
        return String.valueOf(codigo);
    }

    public void setCodigo(int codigo) {
        if (codigo <= 0) {
            throw new IllegalArgumentException("El código debe ser positivo.");
        }
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isBiodegradable() {
        return biodegradable;
    }

    public void setBiodegradable(boolean biodegradable) {
        this.biodegradable = biodegradable;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }
    
   
    @Override
    public String toString() {
        return "Residuo{" + 
                "codigo=" + codigo + "\n" +
                ", nombre=" + nombre + "\n" +
                ", descripcion=" + descripcion + "\n" +
                ", biodegradable=" + biodegradable + "\n" +
                ", categoria=" + categoria + '}';
    }
}

