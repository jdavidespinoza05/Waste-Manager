/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author jessi
 */
public class MantenimientoException extends Exception {
    
    private ErroresMantenimiento codException;

    public MantenimientoException(ErroresMantenimiento codException) {
        this.codException = codException;
    }
    
    @Override
    public String getMessage(){
        String mensaje="";
        switch (codException){
            case DATO_VACIO : 
                mensaje = "Algunos datos no se colocaron. Se deben completar todos los datos."; 
                break;
            case RESIDUO_EXISTE : 
                mensaje = "Este residuo ya existe."; 
                break;
            case RESIDUO_NO_EXISTE : 
                mensaje = "Este residuo no existe."; 
                break;
            case DATO_ESPECIFICO_VACIO : 
                mensaje = "Este dato no puede quedar vacío."; 
                break;
        }
        return mensaje;
    }
    
}
