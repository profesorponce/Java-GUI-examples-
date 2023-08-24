// RadioButton en Java
//
// (c) Ricardo Ponce
// https://www.profesorponce.blogspot.com
// Junio 2022

import javax.swing.*;
import java.awt.event.*;

public class PrimerPrograma{
    
    public static void main(String[]args) {      
 
          JFrame frame = new JFrame("RadioButton");  
          frame.setSize(300, 200);
          frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

          JLabel etiqueta1 = new JLabel("Mensaje");
          
          JTextField campoDeTexto = new JTextField(20);
          campoDeTexto.setEditable(false);
          
          JButton boton = new JButton("Ver selección");
          
          JRadioButton botoncierto = new JRadioButton(cbg,"Cierto");
          JRadioButton botonfalso = new JRadioButton(cbg,"Falso");
          
          botoncierto.setSelected(false);
          botonfalso.setSelected(false);
          //botoncierto.setSelected(true); //false
          //botoncierto.setVisible(true); // false
          
          
          JPanel panelDeContenido = new JPanel();
          panelDeContenido.add(etiqueta1);
          panelDeContenido.add(campoDeTexto);
          panelDeContenido.add(boton);
          panelDeContenido.add(botoncierto);
          panelDeContenido.add(botonfalso);
          
          // agregamos detección del click             
          boton.addActionListener(new ActionListener() {	
              public void actionPerformed(ActionEvent e) {
                  campoDeTexto.setText("Has pulsado el botón ");
                  
                  }	
              });
          
          frame.setContentPane(panelDeContenido);
          frame.setVisible(true);


    } // fin de main
     
} // fin de clase principal