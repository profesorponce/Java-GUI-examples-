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

	  // no estan organizados como grupo y se pueden seleccionar
	  // individualmente cada uno
          Checkbox cb1 = new Checkbox ("Mostrar subdirectorios", false);
          Checkbox cb2 = new Checkbox ("Mostrar carpetas", false);

          JButton boton1 = new JButton("Leer check box");
                // agregamos detección del click             
                boton1.addActionListener(new ActionListener() {	
                    public void actionPerformed(ActionEvent e) {
                        String str = "Esta marcado como: " + cb1.getState();
                        JOptionPane.showMessageDialog(null, str, "Obtener estado", JOptionPane.DEFAULT_OPTION);
                        }	
                    });
 
          JPanel panelDeContenido = new JPanel();

          panelDeContenido.add(cb1);
          panelDeContenido.add(cb2);
          panelDeContenido.add(boton1);
          
          frame.setContentPane(panelDeContenido);
          frame.setVisible(true);                

     } //fin del main
       
} //fin de clase principal

       