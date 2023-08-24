// Clase Gui
// JFrame ordenado personalmente
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

        // crear panel y ordenar por posición personalizada de objetos
        JPanel panel = new JPanel();
        panel.setLayout(null); // declarar null el ordenamiento de objetos
               
        // agregar botones y dejar la distribución especificada
        // a través de  las propiedades setBounds(...) o setLocation(...)
        // indicando (columna, fila, ancho, alto) de cada control
 
        JButton boton1 = new JButton("Boton 1");  
        boton1.setBounds(0, 0, 100, 30);
        panel.add(boton1);
                  
        JButton boton2 = new JButton("Boton 2");                
        boton2.setBounds(0, 50, 100, 30);
        panel.add(boton2);
        
        JButton boton3 = new JButton("Boton 3");                
        boton3.setBounds(0, 100, 100, 30);
        panel.add(boton3);
        
        JButton boton4 = new JButton("Boton 4");                
        boton4.setBounds(0, 150, 100, 30);
        panel.add(boton4);
        
        JButton boton5 = new JButton("Boton 5");                
        boton5.setBounds(0, 200, 100, 30);
        panel.add(boton5);
        
        // agregar panel al frame y hacerlo visible
        frame.setContentPane(panel);       
        frame.setVisible(true);  
    } // fin de main
     
} // fin de clase principal
