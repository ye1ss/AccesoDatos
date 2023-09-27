/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Actividad3 {
/*
    Escribir un programa en Oracle Java que mediante la clase scanner y/o un JOption.Pane, realice las siguientes operaciones:
1.Pedir al usuario una ruta donde introducir el fichero que incluya el nombre del fichero e introducirlo en la variable string ruta
2.Pedir al usuario el texto que quiera escribir en el fichero en introducirlo en la variable string texto. 
    Este apartado y el 1 se escribirán en un método-funcion- main que tiene que crear en el programa.
3.Realizar la escritura del texto del fichero pero mediante la creación de un método –funcion- que se llame Escribir fichero 
    y que incluya la gestión de excepciones y que tenga  dos variables de tipo string nomfich y texto
    a.A este método le pasamos la variable ruta que ha introducido del usuario y la variable texto 
    b.Mediante la clase FileWriter creamos un objeto fr y utilizamos el método write para escribir el texto en el fichero
4.Realizar la impresión del contenido del fichero pero mediante la creación de un método –función- que se llame mostrar fichero 
    a.A este método le pasamos la ruta que ha introducido el usuario en el apartado 1 de este ejercicio 
    b.El método saca por pantalla “El Contenido del fichero –nombre del fichero- es”  
    c.El método lee el contenido del fichero y los muestra por pantalla mediante la clase FileReader y la utilización de un for o un while que permita 
    leer los caracteres e imprimirlos con system.out.print
    d.Gestionamos las excepciones de este método o función.
    */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Escribe una ruta donde inttroducir el fichero y el nombre del fichero: ");
        String ruta= sc.next();
        
        System.out.println("Escribe el texto que quieres que tenga el fichero: ");
        String texto= sc.next();
        
        // Llamar a la función para escribir en el archivo
        escribirFichero(ruta, texto);

        // Cerrar el scanner
        sc.close();
    }

    private static void escribirFichero(String ruta, String texto) {
        try{
            File archivo= new File(ruta);
            //Creamos el fichero
            archivo.createNewFile();
            //Creamos el objeto fr para escribir
            FileWriter escribir= new FileWriter(archivo);
            escribir.write(texto);
            escribir.flush();
            escribir.close();
            FileReader fr= new FileReader(archivo);
            char[] a= new char[50];
            fr.read(a);
        
            for(char c : a)
                System.out.print(c);
            fr.close();
            
        }catch(IOException e){
            System.out.println("\"Hubo un error al escribir en el archivo.\"");
            e.printStackTrace();
        }
    }
}
