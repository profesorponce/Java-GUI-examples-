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

          // list (FilasVisibles, true/false)
          // Filas visibles = cantidad de filas del listbox
          // true/false = si permite multiple seleccion
	  List lst = new List(5, false);
	  lst.add("Opcion 1");
          lst.add("Opcion 2");
          lst.add("Opcion 3");
          lst.add("Opcion 4");

          JButton boton1 = new JButton("Leer check box");
                // agregamos detección del click             
                boton1.addActionListener(new ActionListener() {	
                    public void actionPerformed(ActionEvent e) {
                        int i = lst.getSelectedIndex(); // numero de item seleccionado
                        String str = "Nº de item: " + i;
                        JOptionPane.showMessageDialog(null, str, "Obtener estado", JOptionPane.DEFAULT_OPTION);
                        str = "Item seleccionado: " + lst.getItem(i); //texto del item seleccionado
                        JOptionPane.showMessageDialog(null, str, "Obtener estado", JOptionPane.DEFAULT_OPTION);
                        }	
                    });
 
          JPanel panelDeContenido = new JPanel();

          panelDeContenido.add(lst);
          panelDeContenido.add(boton1);
          
          frame.setContentPane(panelDeContenido);
          frame.setVisible(true);  

     } //fin del main
       
} //fin de clase principal

       