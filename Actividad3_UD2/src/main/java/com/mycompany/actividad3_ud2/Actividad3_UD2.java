/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad3_ud2;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Yeismil
 */
public class Actividad3_UD2 {

    public static void main(String[] args) {
        
        JFrame ventana= new JFrame("Menú");
        ventana.setSize(600,550);
        ventana.setResizable(false);
        
        JMenuBar menuBar= new JMenuBar();
        
        JMenu Infos= new JMenu("Info");
        
        JMenuItem menu1= new JMenuItem("Info tabla Payment");
        JMenuItem menu2= new JMenuItem("Info tabla Rental");
        JMenuItem menu3= new JMenuItem("Info tabla Store");
        JMenuItem menu4= new JMenuItem("Info tabla Payment-customer");
        JMenuItem menu5= new JMenuItem("Info tabla Costomer");
        JMenuItem menu6= new JMenuItem("Info tabla Staff");
        
        menuBar.add(Infos);
        Infos.add(menu1);
        Infos.add(menu2);
        Infos.add(menu3);
        Infos.add(menu4);
        Infos.add(menu5);
        Infos.add(menu6);
       
        
        
        
        
        ventana.add(menuBar);
        ventana.getContentPane().add(BorderLayout.NORTH, menuBar);
        ventana.setVisible(true);
    }
}
