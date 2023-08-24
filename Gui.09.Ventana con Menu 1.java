// Ventana con menu
//
// (c) Ricardo Ponce
// https://www.profesorponce.blogspot.com
// Junio 2022


import javax.swing.*;
import java.awt.*;

public class PrimerPrograma{
    
     public static void main(String[] args){

	 // Creando el Marco        
        JFrame frame = new JFrame("Sistema de Menú");       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        frame.setSize(400, 400);        

        // Creando MenuBar y agregando componentes   
        JMenuBar mb = new JMenuBar();       
        JMenu m1 = new JMenu("Archivo");       
        JMenu m2 = new JMenu("Herramientas");       
        JMenu m3 = new JMenu("Acerca de");       
        mb.add(m1);       
        mb.add(m2);       
        mb.add(m3);
        
        // Menu (1) Archivo
        JMenuItem m11 = new JMenuItem("Abrir");       
        JMenuItem m12 = new JMenuItem("Guardar");       
        JMenuItem m13 = new JMenuItem("Salir");       
        m1.add(m11);       
        m1.add(m12);        
        m1.add(m13);        
        
        // Menu (2) Herramientas
        JMenuItem m21 = new JMenuItem("Tools 1");       
        JMenuItem m22 = new JMenuItem("Tools 2");       
        JMenuItem m23 = new JMenuItem("Tools 3");       
        m2.add(m21);       
        m2.add(m22);        
        m2.add(m23);        
        
        // Menu (3) Acerca de
        JMenuItem m31 = new JMenuItem("Link a mi pagina web");       
        m3.add(m31);       
                
        // Creando el panel en la parte inferior y agregando componentes       
        JPanel panel = new JPanel(); // el panel no está visible en la salida      
        JLabel label = new JLabel("Introducir texto");       
        JTextField tf = new JTextField(10); // acepta hasta 10 caracteres        
        JButton send = new JButton("Enviar");       
        JButton reset = new JButton("Restablecer");       
        panel.add(label); 
        panel.add(tf);       
        panel.add(send);       
        panel.add(reset);        

        // Área de texto en el centro    
        JTextArea ta = new JTextArea();        

        // Agregar componentes al marco.      
        frame.getContentPane().add(BorderLayout.SOUTH, panel);       
        frame.getContentPane().add(BorderLayout.NORTH, mb);       
        frame.getContentPane().add(BorderLayout.CENTER, ta);       
        frame.setVisible(true);  

    } //fin del main
       
} //fin de clase principal