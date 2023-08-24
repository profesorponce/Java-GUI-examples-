// Mensajes en cajas de texto 
// con imágenes personalizadas
//
// (c) Ricardo Ponce
// https://www.profesorponce.blogspot.com
// Junio 2022
// 
// Slides Interfaces en Java GUI (p.30)

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import java.awt.event.*; //para eventos del botón
import javax.swing.JOptionPane; //para caja de mensajes

public class PrimerPrograma{
    
      public static void main(String[] args)throws IOException {
  
        // Debe incluir "throws IOException" en proceso MAIN
        // public static void main(String[] args)throws IOException {

        // Imagen que se usara como icono
        File file = new File("C:\\java\\imagen6.jpg");
        BufferedImage bufferedImage = ImageIO.read(file);
                
        // Si queremos vera a la escala actual en que esta grabada
        // -> ImageIcon imageIcon = new ImageIcon(bufferedImage); 
        // La imagen de muestra original está escalada a 512x288
        
        // Reescalamos para que tenga tamaño de icono 50x50
        ImageIcon imageIcon = new ImageIcon(bufferedImage.getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        
        // Frame para contener el botón
        JFrame jFrame = new JFrame("Mensajes en cajas de texto");  
        jFrame.setSize(300, 200);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //jFrame.setLayout(new BorderLayout());
          
        // JLabel para incrustar la imagen
        JLabel jLabel = new JLabel();
        jLabel.setIcon(imageIcon);
        
        JButton boton = new JButton("Aceptar");
        //boton.setBounds(0, 0, 100, 30); // posicionar el boton especificamente
            // agregamos detección del click             
            boton.addActionListener(new ActionListener() {	
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Mensaje con icono personalizado", "Titulo", JOptionPane.DEFAULT_OPTION, imageIcon);
                }	
            });
        
        // Crear panel de contenido
        JPanel panelDeContenido = new JPanel();
        panelDeContenido.add(jLabel);
        panelDeContenido.add(boton);

        jFrame.setContentPane(panelDeContenido);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          
        jFrame.setVisible(true);

          
          
      } // fin de main
       
} // fin de la clase principal
       