/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad5;

import java.awt.TextField;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Alumno
 */
public class Actividad5 {
    /*En este ejercicio vamos a manejar con Oracle Java  la clase file para archivos y directorios.
    1.- Escribir un programa que muestre los nombres de los archivos y directorios que se encuentren en el directorio que se le pida al usuario en el programa –
    2.- Escribir un programa que muestre los nombres de los archivos de un directorio, que se obtendrá del usuario cuya extensión coincida con la que se le pedirá al usuario.
    En este programa utilice JOption Pane para pedir los datos al usuario y cree un menú para seleccionar las opciones 
    1.Directorio y realice el apartado 1 y 2.Archivos y realice el apartado 2*/
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Creamos la ventana
        JFrame jf= new JFrame("Menu Principal");
        jf.setSize(300,300);
        //Añadimos un panel a la ventana
        JPanel miPanel= new JPanel();
        miPanel.setSize(150,100);
        JLabel jl= new JLabel("1.Directorio: ");
        TextField f1= new TextField();
        f1.setSize(10, 0);//cambbiar el tamaño de donde escribo
        miPanel.add(jl);
        miPanel.add(f1);
        //Añadimos los botones
        
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Para que no se me quede el frame abierto
        jf.add(miPanel);
        jf.setVisible(true);
        
    }
}
