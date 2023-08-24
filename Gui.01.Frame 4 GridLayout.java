// Clase Gui
// JFrame ordenado con FlowLayout
//
// (c) Ricardo Ponce
// https://www.profesorponce.blogspot.com
// Junio 2022

import javax.swing.*;
import java.awt.*;

public class PrimerPrograma{
    
    public static void main(String[]args) {    
    
        JFrame frame = new JFrame("Mi primera GUI");      
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        frame.setSize(500, 300);      

        // crear panel y ordenar por GRIDLAYOUT(filas, columnas)      
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,3));
               
        // agregar botones y dejar la distribución a la MV
        JButton boton1 = new JButton("Boton 1");                
        panel.add(boton1);
           
        JButton boton2 = new JButton("Boton 2");                
        panel.add(boton2);

        JButton boton3 = new JButton("Boton 3");                
        panel.add(boton3);

        JButton boton4 = new JButton("Boton 4");                
        panel.add(boton4);

        JButton boton5 = new JButton("Boton 5");                
        panel.add(boton5);

        // agregar panel al frame y hacelo visible
        frame.setContentPane(panel);       
        frame.setVisible(true);      

    } // fin de main
     
} // fin de clase principal
