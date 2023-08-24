// Leer una imagen para inscrutarla
// en un botón y proceder a moverla
// a través del Frame controlando 
// sus movimientos con botones
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
          
        // Variables necesarias para controlar 
        // el movimiento de la imagen
        int Frame_Ancho = 700;
        int Frame_Alto = 500;
        //int Imagen_Pos_Columna_1 = 0;
        //int Imagen_Pos_Fila_1 = 0;
        int Imagen_Ancho = 512;
        int Imagen_Alto = 288;
        int Columna_de_botones = 549;
        int Max_Columna = 40;
        int Max_Fila = 175;
  
        // Debe incluir "throws IOException" en proceso MAIN
        // public static void main(String[] args)throws IOException {

        // Imagen que se usara como icono
        File file = new File("C:\\java\\imagen6.jpg");
        BufferedImage bufferedImage = ImageIO.read(file);
                
        // Si queremos vera a la escala actual en que esta grabada
        ImageIcon imageIcon = new ImageIcon(bufferedImage); 
        // La imagen de muestra original está escalada a 512x288
        
        // Reescalamos para que tenga tamaño de icono 50x50
        //ImageIcon imageIcon = new ImageIcon(bufferedImage.getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        
        // Frame para contener el botón
        JFrame jFrame = new JFrame("Mover una imagen");  
        jFrame.setSize(Frame_Ancho, Frame_Alto);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //jFrame.setLayout(new BorderLayout());
          
        // Incrustamos la imagen en un botón
        JButton jLabel = new JButton();
        jLabel.setIcon(imageIcon);
        jLabel.setSize(Imagen_Ancho, Imagen_Alto);
        // jLabel.setBounds(0, 0, Imagen_Ancho, Imagen_Alto);
        // jLabel.setEnabled(false);   // inabillitarlo como boton
        jLabel.addActionListener(new ActionListener() {	
            public void actionPerformed(ActionEvent e) {
                int X = jLabel.getBounds().x;
                int Y = jLabel.getBounds().y;                
                JOptionPane.showMessageDialog(null, "Pos.X = " + X + " / Pos.Y = "+ Y, "Posicion", JOptionPane.DEFAULT_OPTION);
            }	
        });
                
        
        JButton botonUP = new JButton("Arriba");
        botonUP.setBounds(Columna_de_botones+20, 50, 100, 30); // posicionar el boton especificamente
            // agregamos detección del click             
            botonUP.addActionListener(new ActionListener() {	
                public void actionPerformed(ActionEvent e) {
                    int X = jLabel.getBounds().x;
                    int Y = jLabel.getBounds().y;
                    Y=Y-5;
                    if (Y>0){
                        jLabel.setBounds(X, Y, Imagen_Ancho, Imagen_Alto);    
                    }	
                }	
            });
        
        JButton botonDOWN = new JButton("Abajo");
        botonDOWN.setBounds(Columna_de_botones+20, 125, 100, 30); // posicionar el boton especificamente
            // agregamos detección del click             
            botonDOWN.addActionListener(new ActionListener() {	
                public void actionPerformed(ActionEvent e) {
                    int X = jLabel.getBounds().x;
                    int Y = jLabel.getBounds().y;
                    Y=Y+5;
                    if (Y<Max_Fila){
                        jLabel.setBounds(X, Y, Imagen_Ancho, Imagen_Alto);    
                    }	
                }    
            });
   
        JButton botonIZQ = new JButton("Izq");
        botonIZQ.setBounds(Columna_de_botones, 88, 60, 30); // posicionar el boton especificamente
            // agregamos detección del click             
            botonIZQ.addActionListener(new ActionListener() {	
                public void actionPerformed(ActionEvent e) {
                    int X = jLabel.getBounds().x;
                    int Y = jLabel.getBounds().y;
                    X=X-5;
                    if (X>0){
                        jLabel.setBounds(X, Y, Imagen_Ancho, Imagen_Alto);    
                    }	
                }	
            });
                
        JButton botonDER = new JButton("Der");
        botonDER.setBounds(Columna_de_botones+70, 88, 60, 30); // posicionar el boton especificamente
            // agregamos detección del click             
            botonDER.addActionListener(new ActionListener() {	
                public void actionPerformed(ActionEvent e) {
                    int X = jLabel.getBounds().x;
                    int Y = jLabel.getBounds().y;
                    X=X+5;
                    if (X<Max_Columna){
                        jLabel.setBounds(X, Y, Imagen_Ancho, Imagen_Alto);    
                    }	
                }	
            });
            
        // Crear panel de contenido
        JPanel panelDeContenido = new JPanel();
        panelDeContenido.add(jLabel);
        panelDeContenido.add(botonUP);
        panelDeContenido.add(botonDOWN);
        panelDeContenido.add(botonIZQ);
        panelDeContenido.add(botonDER);
        // ATENCION: configuracion manual de posiciones
        // de los controles
        // Si se configura al panel de contenidos como
        // setLayout(null), la posición de los controles deben configurarse
        // deben configurarse manualmente
        panelDeContenido.setLayout(null); 

        // Asociar el contenedor a la ventana
        jFrame.setContentPane(panelDeContenido); 
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
      } // fin de main
       
} // fin de la clase principal
       