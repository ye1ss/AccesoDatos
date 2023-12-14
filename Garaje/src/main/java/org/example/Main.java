package org.example;

import javax.swing.*;
import java.awt.*;
import java.sql.DriverManager;
import java.sql.SQLException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        JFrame ventana= new JFrame("Garaje");
        ventana.setSize(600,600);
        ventana.setResizable(false);

        JMenuBar barraArriba= new JMenuBar();
        JMenu menu= new JMenu("Menú");

        JMenuItem opcion1= new JMenuItem("Usuario del Seat Ibiza");
        JMenuItem opcion2= new JMenuItem("Número de coches y modelo de Jonas");

        menu.add(opcion1);
        menu.add(opcion2);

        barraArriba.add(menu);

        //Nos conectamos a la base de datos para hacer las consultas y que salgan en el menu



        ventana.getContentPane().add(BorderLayout.NORTH, barraArriba);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);

        String url= "jdbc:mysql://localhost:3306/garaje";
        String usuario= "root";
        String contraseña="";   //en casa la contraseña es root
        class primeraConsulta{
            Connection conexion= null;
            Statement sentencia= null;

            try{
                conexion= DriverManager.getConnection(url, usuario, contraseña);
                sentencia= conexion.createStatement();

                if(conexion!= null){
                    System.out.println("Conexion correcta a la base de datos");
                    //Consulta
                    String consulta= "SELECT ";
                }
            }catch(SQLException e){
                System.out.println("Error al intentar conectar con la base de datos");
            }
        }
        class segundaConsulta{

        }

    }
}