/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad7;


import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Actividad7 {

    public static void main(String[] args) {
        Object[]opciones={"Sobre Archivo","Sobre Directorio","Salir"};
        int seleccion=JOptionPane.showOptionDialog(null, "Elige una opción:", "Menú de permisos",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[2]);
        
                switch(seleccion){
                    case 0:
//                        JFileChooser fc= new JFileChooser();
//                        int resultado = fc.showOpenDialog(null);
//                        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                        String ruta=JOptionPane.showInputDialog(null, "Escribe la ruta completa de un archivo");
                        File archivo= new File(ruta);
                        //verificar i el archivo existe y si tiene permisos de lectura
                        if(!archivo.isFile());{
                            JOptionPane.showMessageDialog(null, "No ha introducido correctamente un archivo","Error",JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        boolean lectura= archivo.canRead(), escritura= archivo.canWrite(), ejecucion= archivo.canExecute();
                        String mensaje= String.format("Permisos del archivo:\nLectura: %s\nEscritura: %s\nEjecuión: %s", lectura, escritura, ejecucion);
                        JOptionPane.showMessageDialog(null,mensaje,"Permisos del archivo",JOptionPane.INFORMATION_MESSAGE);
                        
                    case 1: 
                        JOptionPane.showMessageDialog(null, "Has seleccionado 'Sobre Directorio'");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Saliendo de la aplicación");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida");
                        break;
                }
    
    }
}
