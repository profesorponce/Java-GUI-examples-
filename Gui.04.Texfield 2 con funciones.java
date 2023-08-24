// Text field con funciones
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

          JTextField campoDeTexto = new JTextField(20);
              // Inhabilitarlo: campoDeTexto.setEditable(false);
              // Habilitarlo:   campoDeTexto.setEditable(true);
              // Poner texto:	campoDeTexto.setText("Mi texto");
              // Obtener texto:	String str = campoDeTexto.getText();

          JButton boton1 = new JButton("Activar");
                // agregamos detección del click             
                boton1.addActionListener(new ActionListener() {	
                    public void actionPerformed(ActionEvent e) {
                        campoDeTexto.setEditable(true);
                        }	
                    });

          JButton boton2 = new JButton("Inactivar");
                // agregamos detección del click             
                boton2.addActionListener(new ActionListener() {	
                    public void actionPerformed(ActionEvent e) {
                        campoDeTexto.setEditable(false);
                        }	
                    });

          JButton boton3 = new JButton("Setting");
                // agregamos detección del click             
                boton3.addActionListener(new ActionListener() {	
                    public void actionPerformed(ActionEvent e) {
                        campoDeTexto.setText("Cambio por mi texto");
                        }	
                    });

        JButton boton4 = new JButton("Leer el campo");
               // agregamos detección del click             
               boton4.addActionListener(new ActionListener() {	
                   public void actionPerformed(ActionEvent e) {
                       String str = campoDeTexto.getText();
                       JOptionPane.showMessageDialog(null, str, "Obtener texto", JOptionPane.DEFAULT_OPTION);
                       }	
                   });
 
          JPanel panelDeContenido = new JPanel();

          panelDeContenido.add(campoDeTexto);
          panelDeContenido.add(boton1);
          panelDeContenido.add(boton2);                    
          panelDeContenido.add(boton3);  
          panelDeContenido.add(boton4);  
          
          frame.setContentPane(panelDeContenido);
          frame.setVisible(true);      

     } //fin del main
       
} //fin de clase principal

       