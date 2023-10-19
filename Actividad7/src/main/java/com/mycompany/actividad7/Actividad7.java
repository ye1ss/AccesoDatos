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
                        File fichero= new File(ruta);
                        //verificar i el archivo existe y si tiene permisos de lectura
                        if(fichero.exists()&& fichero.canRead()){
                            JOptionPane.showConfirmDialog(null, "El archivo tiene permisos de lectura");
                        }else {
                            JOptionPane.showMessageDialog(null, "El archivo no tiene permisos de lectura");
                        }
                        //verificar si el archivo existe y tiene permisos de 
                        break;

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
