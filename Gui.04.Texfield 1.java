// Text field
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
          
          JPanel panelDeContenido = new JPanel();

          panelDeContenido.add(campoDeTexto);
                    
          frame.setContentPane(panelDeContenido);
          frame.setVisible(true);      } //fin del main
       
} //fin de clase principal

       