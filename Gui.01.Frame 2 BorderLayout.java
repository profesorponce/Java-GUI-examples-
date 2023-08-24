// Clase Gui
// Se crea un JFrame (ventana)
// Lo ordena con el metodo BORDERLAYOUT
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

        // crear panel y ordenar por BORDERLAYOUT        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(5, 10));
               
        // agregar botones en una zona especifica
        JButton boton1 = new JButton("Boton NORTE");                
        panel.add(boton1, BorderLayout.NORTH);
           
        JButton boton2 = new JButton("Boton CENTRO");                
        panel.add(boton2, BorderLayout.CENTER);

        JButton boton3 = new JButton("Boton SUR");                
        panel.add(boton3, BorderLayout.SOUTH);

        JButton boton4 = new JButton("Boton OESTE");                
        panel.add(boton4, BorderLayout.WEST);

        JButton boton5 = new JButton("Boton ESTE");                
        panel.add(boton5, BorderLayout.EAST);

        // agregar panel al frame y hacelo visible
        frame.setContentPane(panel);       
        frame.setVisible(true);     

    } // fin de main
     
} // fin de clase principal
