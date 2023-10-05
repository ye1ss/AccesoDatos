/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad5;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Alumno
 */
public class Actividad5 {
    /**/
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Creamos la ventana
        JFrame jf= new JFrame("Menu Principal");
        jf.setSize(600,400);
        //Añadimos un panel a la ventana
        JPanel miPanel= new JPanel();
        miPanel.setSize(150,100);
        //Añadimos los botones
        
        jf.setVisible(true);
    }
}
