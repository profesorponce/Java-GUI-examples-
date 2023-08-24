// Clase Gui
// Se crea un JFrame (ventana)
// Sin contenido
// 
// (c) Ricardo Ponce
// https://www.profesorponce.blogspot.com
// Junio 2022

import javax.swing.*;

public class PrimerPrograma{
    
    public static void main(String[]args) {   
   
        // se crea el frame
        JFrame frame = new JFrame("Mi primera GUI");      
        // se define  el tipo de cierre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        // se define el tamaño (ancho, alto)
        frame.setSize(300, 300);      
        // se hace visible para el usuario
        frame.setVisible(true);   

    } // fin de main
     
} // fin de clase principal
