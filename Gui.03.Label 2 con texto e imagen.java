// Label con texto e imagen
//
// (c) Ricardo Ponce
// https://www.profesorponce.blogspot.com
// Junio 2022
// 
// Slides Interfaces en Java GUI (p.30)

import javax.swing.*;
import java.awt.event.*;

public class PrimerPrograma{
    
     public static void main(String[] args){

          JFrame frame = new JFrame("Frame de trabajo");  
          frame.setSize(300, 200);
          frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

          JLabel etiqueta1 = new JLabel("Mensaje");
          etiqueta1 = new JLabel(new ImageIcon("c:\\java\\Bandera_ARgentina.jpg"));
          
          JPanel panelDeContenido = new JPanel();

          panelDeContenido.add(etiqueta1);
                    

          frame.setContentPane(panelDeContenido);
          frame.setVisible(true);  


    } //fin del main

       
} //fin de clase principal

       