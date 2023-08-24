// Bot�n solo con imagen
//
// (c) Ricardo Ponce
// https://www.profesorponce.blogspot.com
// Junio 2022
// 
// 

import javax.swing.*;
import java.awt.event.*;

public class PrimerPrograma{
    
     public static void main(String[] args){

          JFrame frame = new JFrame("Frame de trabajo");  
          frame.setSize(300, 200);
          frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

          JLabel etiqueta1 = new JLabel("Mensaje");
          JTextField campoDeTexto = new JTextField(20);
              //campoDeTexto.setEditable(false);
              //campoDeTexto.setEditable(true);

          JButton boton = new JButton(new ImageIcon("c:\\java\\Bandera_Argentina.jpg"));
          
                // agregamos detecci�n del click             
                boton.addActionListener(new ActionListener() {	
	            private int numClicks;
                    public void actionPerformed(ActionEvent e) {
			numClicks++;
                        campoDeTexto.setText(String.valueOf(numClicks));
                        }	
                    });


          JPanel panelDeContenido = new JPanel();

          panelDeContenido.add(etiqueta1);
          panelDeContenido.add(campoDeTexto);
          panelDeContenido.add(boton);

          frame.setContentPane(panelDeContenido);
          frame.setVisible(true);

    } //fin del main

       
} //fin de clase principal

       