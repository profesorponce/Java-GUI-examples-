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

          // JTextArea("texto inicial", filas, columnas)
          JTextArea ta = new JTextArea("Mi texto",5,20); 
          
          //para limitar la redimensionalidad del control
          ta.setPreferredSize(new Dimension (5,20)); 
          
          ta.setLineWrap(true); // evita que el cuadro se "abra"
          ta.setWrapStyleWord(true); // corta la linea por palabra
          
          // Selección del tipo de letra
          Font font = new Font("Verdana", Font.ITALIC, 12);
          ta.setFont(font);
          
          // colores válidos:
          // black, blue, cyan, dark_gray, green
          // light_gray, orange, pink, red
          // white, yellow
          ta.setForeground(Color.blue);
          ta.setBackground(Color.orange);
                   
          
          JButton boton1 = new JButton("Activar");
                // agregamos detección del click             
                boton1.addActionListener(new ActionListener() {	
                    public void actionPerformed(ActionEvent e) {
                        ta.setEditable(true);
                        }	
                    });

          JButton boton2 = new JButton("Inactivar");
                // agregamos detección del click             
                boton2.addActionListener(new ActionListener() {	
                    public void actionPerformed(ActionEvent e) {
                        ta.setEditable(false);
                        }	
                    });

          JButton boton3 = new JButton("Setting");
                // agregamos detección del click             
                boton3.addActionListener(new ActionListener() {	
                    public void actionPerformed(ActionEvent e) {
                        ta.setText("Cambio por mi texto");
                        }	
                    });

         JButton boton4 = new JButton("Leer el campo");
               // agregamos detección del click             
               boton4.addActionListener(new ActionListener() {	
                   public void actionPerformed(ActionEvent e) {
                       String str = ta.getText();
                       JOptionPane.showMessageDialog(null, str, "Obtener texto", JOptionPane.DEFAULT_OPTION);
                       }	
                   });
 
          JPanel panelDeContenido = new JPanel();

          panelDeContenido.add(ta);
          panelDeContenido.add(boton1);
          panelDeContenido.add(boton2);                    
          panelDeContenido.add(boton3);  
          panelDeContenido.add(boton4);  
          
          frame.setContentPane(panelDeContenido);
          frame.setVisible(true);      

     } //fin del main
       
} //fin de clase principal

       