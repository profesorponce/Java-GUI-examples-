// RadioButtonGroup en Java
//
// (c) Ricardo Ponce
// https://www.profesorponce.blogspot.com
// Junio 2022

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane; //para caja de mensajes

public class PrimerPrograma{
    
    public static void main(String[]args) {      
 
          JFrame frame = new JFrame("RadioButton");  
          frame.setSize(300, 200);
          frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

          JLabel etiqueta1 = new JLabel("Mensaje");
          
          JTextField campoDeTexto = new JTextField(20);
          campoDeTexto.setEditable(false);
          
          JButton boton = new JButton("Ver selección");
        
          // Button group hace que se comporten como grupo
          // en donde se puede seleccionar uno a la vez
          ButtonGroup bg = new ButtonGroup();
          JRadioButton botoncierto = new JRadioButton("Cierto");
          JRadioButton botonfalso = new JRadioButton("Falso");
          botoncierto.setSelected(false);
          botonfalso.setSelected(false);
          bg.add(botoncierto);
          bg.add(botonfalso);
                    
          JPanel panelDeContenido = new JPanel();
          panelDeContenido.add(etiqueta1);
          panelDeContenido.add(campoDeTexto);
          panelDeContenido.add(boton);
          panelDeContenido.add(botoncierto);
          panelDeContenido.add(botonfalso);
          
          // agregamos detección del click             
          boton.addActionListener(new ActionListener() {	
              public void actionPerformed(ActionEvent e) {
                  String str = "";
                  if (botoncierto.isSelected()){
                      str = "Eligió CIERTO";
                  }	
                  if (botonfalso.isSelected()){
                      str = "Eligió FALSO";
                  }
                  campoDeTexto.setText(str);
                  JOptionPane.showMessageDialog(null, str , "Eligió", JOptionPane.DEFAULT_OPTION);
              }
              
              });
          
          frame.setContentPane(panelDeContenido);
          frame.setVisible(true);

    } // fin de main
     
} // fin de clase principal