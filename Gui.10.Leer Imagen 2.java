// Leer una imagen para incrustarla
// dentro de una label
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

public class PrimerPrograma{
    
      public static void main(String[] args)throws IOException{
 
        // Debe incluir "throws IOException" en proceso MAIN
        // public static void main(String[] args)throws IOException {
        File file = new File("C:\\java\\imagen6.jpg");
        BufferedImage bufferedImage = ImageIO.read(file);              
                
        // Si queremos vera a la escala actual en que esta grabada
        // -> ImageIcon imageIcon = new ImageIcon(bufferedImage); 
        // La imagen de muestra original está escalada a 512x288
        
        // Si queremos re-escalarla a 250x139
        ImageIcon imageIcon = new ImageIcon(bufferedImage.getScaledInstance(250, 139, Image.SCALE_DEFAULT));
        
        JFrame jFrame = new JFrame();        
        jFrame.setSize(500, 500);
        
        // JLabel para incrustar la imagen
        JLabel jLabel = new JLabel();
        jLabel.setIcon(imageIcon);
        jLabel.setBounds(50, 5, 100, 100); //(columna, fila,ancho, alto)
        
        // Crear panel de contenido
        JPanel panelDeContenido = new JPanel();
        panelDeContenido.add(jLabel);

        jFrame.setContentPane(panelDeContenido);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          
        jFrame.setVisible(true);
        
          
      } // fin de main
       
} // fin de la clase principal
       