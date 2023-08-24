// Choice con detección de seleccion
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

	  Choice ch = new Choice();
          ch.addItem("Opcion 1");
          ch.addItem("Opcion 2");
          ch.addItem("Opcion 3");
          ch.addItem("Opcion 4");

          JButton boton1 = new JButton("Leer check box");
                // agregamos detección del click             
                boton1.addActionListener(new ActionListener() {	
                    public void actionPerformed(ActionEvent e) {
                        int i = ch. getSelectedIndex(); // numero de item seleccionado
                        String str = "Nº de item: " + i;
                        JOptionPane.showMessageDialog(null, str, "Obtener estado", JOptionPane.DEFAULT_OPTION);
                        str = "Item seleccionado: " + ch.getItem(i); //texto del item seleccionado
                        JOptionPane.showMessageDialog(null, str, "Obtener estado", JOptionPane.DEFAULT_OPTION);
                        }	
                    });
 
          JPanel panelDeContenido = new JPanel();

          panelDeContenido.add(ch);
          panelDeContenido.add(boton1);
          
          frame.setContentPane(panelDeContenido);
          frame.setVisible(true);  

     } //fin del main
       
} //fin de clase principal

       