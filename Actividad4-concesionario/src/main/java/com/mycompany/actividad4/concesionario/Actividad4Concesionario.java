/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad4.concesionario;

import java.awt.HeadlessException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Actividad4Concesionario {
/*Crea una aplicación que almacene los datos básicos de un vehículo como la matricula(String), marca (String),
tipo de combustible (string), numero de puertas (int), año del vehiculo (int) y modelo (String) en ese orden y de uno en uno usando la clase DataInputStream y
DataOutputStream que tiene métodos para escribir los caracteres tipo UTF-8
    
Los datos anteriores datos se pedirán por teclado y se irán añadiendo al fichero (no se sobrescriben los datos)
cada vez que ejecutemos la aplicación.
    
El fichero siempre sera el mismo, en todos los casos.
Muestra todos los datos de cada coche en un cuadro de dialogo, es decir, si tenemos 3 vehículos mostrara 3 cuadros de dialogo
con sus respectivos datos.*/
//Utilizar el metodo appending para añadir al fichero, buferedreader, hacer que no se sobescriban con el metodo append
//Preguntas cuantos coches quiere registrar e irlos metiendo sin sobescribirlos
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        JOptionPane op= new JOptionPane(System.in);
        int opcion= Integer.parseInt(JOptionPane.showInputDialog(null, "Menu\n"+"1.Registrar\n"+"2.Ver registros\n"+"3.Salir"));
        //String nCoches= JOptionPane.showInputDialog("Introduce el número de coches que quieres registrar");
        //JOptionPane.showMessageDialog(null, "Esta bien, registraremos los "+nCoches+" coches");
        
            switch(opcion){
                case 1:
                    Registrar();
                    break;
                case 2:
                    
                    break;
            }

            
    }
    private static void Registrar() throws NumberFormatException, HeadlessException {
        boolean repetir= true;
        String matricula= JOptionPane.showInputDialog("Introduce la matrícula del cocche: ");
        JOptionPane.showMessageDialog(null,"Matricula "+matricula+" registrada.");
        
        String marca= JOptionPane.showInputDialog("Introduce la marca del coche: ");
        JOptionPane.showMessageDialog(null,"Marca "+marca+" registrada.");
        
        String modelo= JOptionPane.showInputDialog("Introduce el modelo del coche: ");
        JOptionPane.showMessageDialog(null,"Modelo "+modelo+" registrado.");
        
        String combustible= JOptionPane.showInputDialog("Introduce el tipo de combustible del coche: ");
        JOptionPane.showMessageDialog(null,"Combustible "+combustible+" registrado.");
        
        int nPuertas = 0;
        boolean repetirPuertas = true;
            while (repetirPuertas) {
            try {
                nPuertas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de puertas del coche: "));
                JOptionPane.showMessageDialog(null, "Número de puertas " + nPuertas + " registrado.");
                repetirPuertas = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Introduce un número válido (3 o 5)");
                repetirPuertas = true;
            }
        }
        int aVehiculo = 0;
        boolean repetirAnio = true;
            while (repetirAnio) {
            try {
                aVehiculo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año del vehículo del coche: "));
                JOptionPane.showMessageDialog(null, "Año del vehículo " + aVehiculo + " registrado.");
                repetirAnio = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Introduce un año válido");
                repetirAnio = true;
            }
        }
    }
}
