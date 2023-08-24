// Posición personalizada de controles en Java
// Botón con detección de click
//
// (c) Ricardo Ponce
// https://www.profesorponce.blogspot.com
// Junio 2022
// 
// Slides Interfaces en Java GUI (p.30)

import javax.swing.*;
import java.awt.event.*;    // captura del botón

public class PrimerPrograma{
    
      public static void main(String[] args){
  
          // Posición personalizada de controles
          // 
          // 1) configurar panel.setLayout(null); 
          // 2) configurar cada posición de control
          //    control.setBounds(columna1, fila1, ancho, alto);
          
          JFrame frame = new JFrame("Frame Personalizado");  
          
          frame.setSize(300, 200);
          frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
          // 3) Crear los componentes que se integraran a la ventana
          JLabel etiqueta1 = new JLabel("Mensaje:");
          etiqueta1.setBounds(5, 0, 60, 40); //(columna, fila,ancho, alto)
          
          JTextField campoDeTexto = new JTextField(20);
          campoDeTexto.setBounds(65, 10, 140, 20); //(columna, fila,ancho, alto)
          campoDeTexto.setEditable(false);
              //campoDeTexto.setEditable(true);
          JButton boton = new JButton("Aceptar"); 
          boton.setBounds(65, 100, 100, 30); //(columna, fila,ancho, alto)
          
                // agregamos detección del click             
                boton.addActionListener(new ActionListener() {	
                    public void actionPerformed(ActionEvent e) {
                        campoDeTexto.setText("Has pulsado el botón ");			
                        }	
                    });

          // La propiedad setLocation(columna,fila) permite
	  // cambiar dinamicamente la posición de un control
          // boton.setLocation(0,60);   

          // 4) Crear un contenedor de los objetos creados
          JPanel panelDeContenido = new JPanel();
          // 5) Asociamos los componentes al contenedor
          panelDeContenido.add(etiqueta1);
          panelDeContenido.add(campoDeTexto);
          panelDeContenido.add(boton);
          
          // ATENCION: configuracion manual de posiciones
          // de los controles
          // Si se configura al panel de contenidos como
          // setLayout(null), la posición de los controles deben configurarse
          // deben configurarse manualmente
          
          panelDeContenido.setLayout(null); 
          
          // 6) Asociar el contenedor a la ventana
          frame.setContentPane(panelDeContenido);
          // 7) Hacer visible la ventana
          frame.setVisible(true);
          
      } // fin de main
       
} // fin de la clase principal
       