// Posici�n personalizada de controles en Java
// Bot�n con detecci�n de click
//
// (c) Ricardo Ponce
// https://www.profesorponce.blogspot.com
// Junio 2022
// 
// Slides Interfaces en Java GUI (p.30)

import javax.swing.*;
import java.awt.event.*;    // captura del bot�n

public class PrimerPrograma{
    
      public static void main(String[] args){
  
          // Posici�n personalizada de controles
          // 
          // 1) configurar panel.setLayout(null); 
          // 2) configurar cada posici�n de control
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
          
                // agregamos detecci�n del click             
                boton.addActionListener(new ActionListener() {	
                    public void actionPerformed(ActionEvent e) {
                        campoDeTexto.setText("Has pulsado el bot�n ");			
                        }	
                    });

          // La propiedad setLocation(columna,fila) permite
	  // cambiar dinamicamente la posici�n de un control
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
          // setLayout(null), la posici�n de los controles deben configurarse
          // deben configurarse manualmente
          
          panelDeContenido.setLayout(null); 
          
          // 6) Asociar el contenedor a la ventana
          frame.setContentPane(panelDeContenido);
          // 7) Hacer visible la ventana
          frame.setVisible(true);
          
      } // fin de main
       
} // fin de la clase principal
       