/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.text.ParseException;
import javax.swing.JOptionPane;
import java.text.Normalizer;
import javax.swing.*;

/**
 *
 * @author jessi
 */
public class Gestor implements IRegistrable {
    private static Gestor instance;
    
    public static ArrayList<Gestor> listaGestor = new ArrayList<>();
    private ArrayList<Residuo> residuos = new ArrayList<>();
    private int cantidadResiduos;

    public Gestor() {
        cantidadResiduos = 1;
    }
    
    
    public static Gestor getInstance() {
        if (instance == null) {
            instance = new Gestor();
        }
        return instance;
    }
    
    
    
   
    public void agregarResiduo(Residuo residuo) {
        residuos.add(residuo);
        escribirArchivo(residuos);
        agregarArchivo();
    }
  
    
    public void insertarResiduo(String nombre, String descripcion, String esBiodegradable, String tipoResiduo, String categoria, 
            String icono, JPanel panel) {
        int codigo = cantidadResiduos;

            try {
                if (nombre == null || nombre.trim().isEmpty()) {
                throw new MantenimientoException(ErroresMantenimiento.DATO_VACIO);
            }
            if (descripcion == null || descripcion.trim().isEmpty()) {
                throw new MantenimientoException(ErroresMantenimiento.DATO_VACIO);
            }
            if (esBiodegradable == null || esBiodegradable.trim().isEmpty()) {
                throw new MantenimientoException(ErroresMantenimiento.DATO_VACIO);
            }
            if (tipoResiduo == null || tipoResiduo.trim().isEmpty()) {
                throw new MantenimientoException(ErroresMantenimiento.DATO_VACIO);
            }
            if (categoria == null || categoria.trim().isEmpty()) {
                throw new MantenimientoException(ErroresMantenimiento.DATO_VACIO);
            }
            
            if (icono == null || icono.trim().isEmpty()) {
                throw new MantenimientoException(ErroresMantenimiento.DATO_VACIO);
            }

            nombre = nombre.trim().toLowerCase();
            nombre = nombre.substring(0, 1).toUpperCase() + nombre.substring(1);

            String nombreBuscar = Normalizer.normalize(nombre, Normalizer.Form.NFD);
            nombreBuscar = nombreBuscar.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");

            if (buscarNombreRepetido(nombreBuscar) != null) {
                throw new MantenimientoException(ErroresMantenimiento.RESIDUO_EXISTE);
            }

            boolean biodegradable = "SI".equals(esBiodegradable);

            if ("Reciclable".equals(tipoResiduo)) {
                Reciclable reciclable = new Reciclable(codigo, nombre, descripcion, biodegradable, categoria, icono);
                agregarResiduo(reciclable);
            } 
            
            else if ("NoReciclable".equals(tipoResiduo)) {
                NoReciclable noReciclable = new NoReciclable(codigo, nombre, descripcion, biodegradable, categoria, icono);
                agregarResiduo(noReciclable);
            }

            JOptionPane.showMessageDialog(panel, "Residuo insertado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            
            cantidadResiduos++;
        } 
        
        catch (MantenimientoException e) {
            JOptionPane.showMessageDialog(panel, "Error al insertar el residuo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
   
    
    
    public void modificarResiduo (String nombre, String descripcion, String esBiodegradable, String tipoResiduo, String categoria, 
            String icono, JPanel panel){
          
        try{
            
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new MantenimientoException(ErroresMantenimiento.DATO_VACIO);
            }
            
            nombre = nombre.trim().toLowerCase();
            nombre = nombre.substring(0, 1).toUpperCase() + nombre.substring(1);

            String nombreBuscar = Normalizer.normalize(nombre, Normalizer.Form.NFD);
            nombreBuscar = nombreBuscar.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");

            Residuo residuo = buscarNombreRepetido(nombreBuscar);
            
            if (residuo == null)
                throw new MantenimientoException(ErroresMantenimiento.RESIDUO_NO_EXISTE);
            
            if (residuo == null)
                throw new MantenimientoException(ErroresMantenimiento.RESIDUO_NO_EXISTE);
            
            if (!esBiodegradable.trim().isEmpty()){
                boolean biodegradable = "SI".equals(esBiodegradable);
                residuo.biodegradable = biodegradable;
            }
            
            if (!categoria.trim().isEmpty()){
                residuo.categoria = categoria;
            }
            
            if (!descripcion.trim().isEmpty()){
                residuo.descripcion = descripcion;
            }
            
            if (!icono.trim().isEmpty()){
                residuo.icono = icono;
            }
            
            if (!tipoResiduo.trim().isEmpty()){
                String codigoStr = residuo.getCodigo();
                int codigo = Integer.parseInt(codigoStr);
                nombre = residuo.getNombre();
                descripcion = residuo.getDescripcion();
                boolean biodegradable = residuo.isBiodegradable();
                categoria = residuo.getCategoria();
                icono = residuo.getIcono();
                
                if ("Reciclable".equals(tipoResiduo) && residuo instanceof NoReciclable) {
                    eliminacionResiduo(codigoStr);
                    Reciclable reciclable = new Reciclable(codigo, nombre, descripcion, biodegradable, categoria, icono);
                    agregarResiduo(reciclable);
                } 
            
                else if ("NoReciclable".equals(tipoResiduo) && residuo instanceof Reciclable) {
                    eliminacionResiduo(codigoStr);
                    NoReciclable noReciclable = new NoReciclable(codigo, nombre, descripcion, biodegradable, categoria, icono);
                    agregarResiduo(noReciclable);
                }
            }
            
            JOptionPane.showMessageDialog(panel, "Residuo modificado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            escribirArchivo(residuos);
            agregarArchivo();
        }
        
        catch (MantenimientoException e){
            JOptionPane.showMessageDialog(panel, "Error al modificar el residuo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    
    
    public void eliminarResiduo (String nombre, JPanel panel){
        
        try{
            
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new MantenimientoException(ErroresMantenimiento.DATO_VACIO);
            }
            
            nombre = nombre.trim().toLowerCase();
            nombre = nombre.substring(0, 1).toUpperCase() + nombre.substring(1);

            String nombreBuscar = Normalizer.normalize(nombre, Normalizer.Form.NFD);
            nombreBuscar = nombreBuscar.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");

            Residuo residuo = buscarNombreRepetido(nombreBuscar);
            
            if (residuo == null)
                throw new MantenimientoException(ErroresMantenimiento.RESIDUO_NO_EXISTE);
            
            int respuesta = JOptionPane.showConfirmDialog(panel, "¿Está seguro de que desea eliminar el residuo?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
                    
            if (respuesta == JOptionPane.YES_OPTION)
                eliminacionResiduo(residuo.getCodigo());

            else if (respuesta == JOptionPane.NO_OPTION)
                return;

            else if (respuesta == JOptionPane.CLOSED_OPTION)
                return;
            
            JOptionPane.showMessageDialog(panel, "Residuo eliminado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        }
        
        catch (MantenimientoException e){
            JOptionPane.showMessageDialog(panel, "Error al eliminar el residuo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public void eliminacionResiduo(String codigo) {
        residuos.removeIf(residuo -> residuo.getCodigo().equals(codigo));
        escribirArchivo(residuos);
        agregarArchivo();
    }
    
    
    public ArrayList<Residuo> listarResiduos() {
        return residuos;
    }
    
    
    
    public Residuo buscarResiduoPorCod(String codigo) {
        for (Residuo residuo : residuos) {
            if (residuo.getCodigo().equals(codigo)) {
                return residuo;
            }
        }
        return null;
    }
    
    
    
    public Residuo buscarNombreRepetido(String nombreResiduo) {
        for (Residuo residuo : residuos) {
            String nombreLista = Normalizer.normalize(residuo.getNombre(), Normalizer.Form.NFD);
            nombreLista = nombreLista.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
            
            if (nombreLista.equals(nombreResiduo)) {
                return residuo;
            }
        }
        return null;
    }
    
    
    
    public ArrayList<Reciclable> filtrarReciclables() {
    ArrayList<Reciclable> reciclables = new ArrayList<>();
    for (Residuo residuo : residuos) {
        if (residuo instanceof Reciclable) {
            reciclables.add((Reciclable) residuo);
        }
    }
    return reciclables;
    }
    
    
    
    public void mostrarResiduos() {
        for (Residuo residuo : residuos) {
            
            System.out.println(residuo.toString() + "\n");
        }
    }
    
    
    
    public void escribirArchivo(ArrayList<Residuo> residuos) {

        FileOutputStream archivoEscritura = null;
        ObjectOutputStream manejadorEscritura = null;
        
        String nombreArchivo = "Residuos.dat";

        try {
            // Apertura del archivo
            manejadorEscritura = new ObjectOutputStream(new FileOutputStream(nombreArchivo));

            // Procesamiento: Escribir cada objeto del ArrayList
            for (Residuo residuo : residuos) {
                manejadorEscritura.writeObject(residuo);
            }

            System.out.println("Datos escritos correctamente.");

        } catch (FileNotFoundException ex) {
            System.out.println("No se pudo crear el archivo " + nombreArchivo);
        } catch (IOException ex) {
            System.out.println("Tengo problemas para escribir el archivo " + nombreArchivo);
        } finally {
            try {
                if (manejadorEscritura != null) {
                    manejadorEscritura.flush(); // Asegurarse de que todos los datos se escriban
                    manejadorEscritura.close();
                    System.out.println("Archivo cerrado correctamente.");
                }
            } catch (IOException ex) {
                System.out.println("Error al cerrar el archivo.");
            }
        }
    }
    

        public ArrayList<Residuo> cargarArchivoResiduos(String nombreArchivo) {
            ObjectInputStream manejadorLectura = null;
            ArrayList<Residuo> lista = new ArrayList<>();

            try {
                manejadorLectura = new ObjectInputStream(new FileInputStream(nombreArchivo));

                while (true) {
                    Object obj = manejadorLectura.readObject();
                    if (obj instanceof Residuo) {
                        lista.add((Residuo) obj);
                    }
                }

            } catch (EOFException ex) {
                System.out.println("Se alcanzó el final del archivo: " + nombreArchivo);
            } catch (ClassNotFoundException ex) {
                System.out.println("No se pudo cargar el registro del archivo: " + nombreArchivo);
                lista = null;
            } catch (FileNotFoundException ex) {
                System.out.println("No se pudo cargar el archivo: " + nombreArchivo);
                lista = null;
            } catch (IOException ex) {
                System.out.println("Error al leer el archivo: " + nombreArchivo);
                lista = null;
            } finally {
                try {
                    if (manejadorLectura != null) {
                        manejadorLectura.close();
                    }
                } catch (IOException ex) {
                    System.out.println("Error al cerrar el archivo.");
                }
            }

            return lista;
        }
        
        
        public String buscarTipo(String codigo){
            String tipo = "";
            for (Residuo residuo : residuos) {
                if (residuo.getCodigo().equals(codigo)){
                    if (residuo instanceof Reciclable) {
                        tipo = "Reciclable";
                        break;
                    }
                    else{
                        tipo = "No Reciclable";
                        break;
                    }
                }
            }
            return tipo;
        }
        
        
        
        
  
        public void agregarArchivo() {
            registrar("Lista de residuos:\n\n", false); 
            int cont = 1;

            for (Residuo residuo : residuos) {
                String tipo = buscarTipo(residuo.getCodigo());
                String esBiodegradable = residuo.biodegradable ? "Sí" : "No";
                
                registrar(cont + ". " + "Código: " + residuo.getCodigo() + "\n", true);
                registrar(" Tipo: " + tipo + "\n", true);
                registrar(" Categoría: " + residuo.getCategoria() + "\n", true);
     
                registrar(" Nombre: " + residuo.getNombre() + "\n", true);
                registrar(" Descripción: " + residuo.getDescripcion() + "\n", true);
                registrar(" Es biodegradable: " + esBiodegradable + "\n", true);
                registrar(" Icono: " + residuo.getIcono() + "\n", true);
     
                cont++;
            }
        }

        @Override
        public boolean registrar(Object dato, boolean append) {
            try (FileWriter fw = new FileWriter("ListaResiduos.txt", append); // Controlar modo
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter out = new PrintWriter(bw)) {
                out.println(dato);
                return true;
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        } 
        
        public void FiltrarPorCategoria(JPanel panel) {
            String[] opciones = {"Orgánico", "Inorgánico", "Peligroso"};
            int categoriaBuscar = JOptionPane.showOptionDialog(panel, "Seleccione la categoría", "Filtrar por Categoría", JOptionPane.DEFAULT_OPTION, 
                                                              JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            String categoriaResiduo;

            switch (categoriaBuscar) {
                case 0:
                    categoriaResiduo = "Orgánico";
                    break;
                case 1:
                    categoriaResiduo = "Inorgánico";
                    break;
                case 2:
                    categoriaResiduo = "Peligroso";
                    break;
                default:
                    return;
            }

            JDialog consultaDialog = new JDialog((Frame) null, "Residuos - " + categoriaResiduo, false); // No modal
            consultaDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            consultaDialog.setSize(400, 300);

            JTextArea textArea = new JTextArea();
            textArea.setEditable(false);

            StringBuilder sb = new StringBuilder();
            sb.append("Categoría: ").append(categoriaResiduo).append("\n\n");
            boolean lista = false;
            int cont = 1;

            for (Residuo residuo : residuos) {
                String tipo = buscarTipo(residuo.getCodigo());
                if (residuo.getCategoria().equals(categoriaResiduo)) {
                    lista = true;
                    sb.append(cont).append(". Nombre del residuo: ").append(residuo.getNombre()).append("\n")
                      .append("    Tipo de residuo: ").append(tipo).append("\n\n");
                    cont++;
                }
            }

            if (lista) {
                textArea.setText(sb.toString());

                textArea.setBackground(new Color(115, 122, 50)); 
                textArea.setForeground(Color.WHITE); 
                textArea.setFont(new Font("Segoe UI", Font.BOLD, 14));
                textArea.setLineWrap(true); 
                textArea.setWrapStyleWord(true); 

                textArea.setBorder(BorderFactory.createLineBorder(new Color(100, 100, 100), 1, true));

                JScrollPane scrollPane = new JScrollPane(textArea);
                scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                scrollPane.setBorder(BorderFactory.createEmptyBorder()); // Eliminar borde del JScrollPane

                consultaDialog.add(scrollPane, BorderLayout.CENTER);

                Color customColor = new Color(53, 68, 44);
                consultaDialog.getContentPane().setBackground(customColor);
                consultaDialog.setLocationRelativeTo(null);
                consultaDialog.setAlwaysOnTop(true);
                consultaDialog.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(panel, "No se encontraron residuos registrados en esta categoría.", "Filtrar por Categoría", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        
        
        
        public ArrayList<Residuo> FiltrarPorTipo(JPanel panel) {
            String[] opciones = {"Reciclable", "No Reciclable"};
            int tipoBuscar = JOptionPane.showOptionDialog(panel, "Seleccione el tipo de residuo", "Filtrar por Tipo de residuo", JOptionPane.DEFAULT_OPTION, 
                                    JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            String tipoResiduo;

            switch (tipoBuscar) {
                case 0:
                    tipoResiduo = "Reciclable";
                    break;
                case 1:
                    tipoResiduo = "No Reciclable";
                    break;
                default:
                    return null;
            }

            boolean lista = false;
            ArrayList<Residuo> residuosTipo = new ArrayList<>();

            for (Residuo residuo : residuos) {
                String tipo = buscarTipo(residuo.getCodigo());
                if (tipo.equals(tipoResiduo)) {
                    residuosTipo.add(residuo);
                    lista = true;
                }
            }

            if (!lista){ 
                JOptionPane.showMessageDialog(panel, "No se encontraron residuos registrados en este tipo.", "Filtrar por Tipo", JOptionPane.INFORMATION_MESSAGE);
                return null;
            } 
            
            return residuosTipo; 
            
        }
        

        
        public ArrayList<Residuo> MostrarInformacionResiduo(JPanel panel) {
            if (residuos == null){ 
                JOptionPane.showMessageDialog(panel, "No se encontraron residuos registrados.", "Mostrar Información", JOptionPane.INFORMATION_MESSAGE);
                return null;
            } 
            return residuos; 
        }
}
    
        

