// Check box con detección de estado
//
// (c) Ricardo Ponce
// https://www.profesorponce.blogspot.com
// Junio 2022
// 
// Slides Interfaces en Java GUI (p.30)

import javax.swing.*;
import java.*;
import java.awt.event.*;

public class PrimerPrograma{
    
     public static void main(String[] args){

      JFrame frame = new JFrame("Frame de trabajo");  
          frame.setSize(300, 200);
          frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

          TextField tf = new TextField(30);

          JButton boton1 = new JButton("Leer");
                boton1.addActionListener(new ActionListener() {	
                    public void actionPerformed(ActionEvent e) {
                        String str = tf.getText();
                        JOptionPane.showMessageDialog(null, str, "Escribió", JOptionPane.DEFAULT_OPTION);
                        }	
                    });
 
          JButton boton2 = new JButton("Borrar");
                boton2.addActionListener(new ActionListener() {	
                    public void actionPerformed(ActionEvent e) {
                        tf.setText(" ");
                        }	
                    }); 

          JPanel panelDeContenido = new JPanel();

          panelDeContenido.add(tf);
          panelDeContenido.add(boton1);
          panelDeContenido.add(boton2);
          
          frame.setContentPane(panelDeContenido);
          frame.setVisible(true);  
     } //fin del main
       
} //fin de clase principal

       