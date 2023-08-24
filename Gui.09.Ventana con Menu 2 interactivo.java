// Ventana con menu interactivo
//
// (c) Ricardo Ponce
// https://www.profesorponce.blogspot.com
// Junio 2022


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PrimerPrograma{
    
     public static void main(String[] args){

 	 // Creando el Marco        
        JFrame frame = new JFrame("Sistema de Men�");       
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
        JPanel panel = new JPanel(); // el panel no est� visible en la salida      
        JLabel label = new JLabel("SELECCI�N");       
        JTextField tf = new JTextField(10); // acepta hasta 10 caracteres        
        
        panel.add(label); 
        panel.add(tf);       
        
        // �rea de texto en el centro    
        JTextArea ta = new JTextArea();        

        // Agregar componentes al marco.      
        frame.getContentPane().add(BorderLayout.SOUTH, panel);       
        frame.getContentPane().add(BorderLayout.NORTH, mb);       
        frame.getContentPane().add(BorderLayout.CENTER, ta); 
        
        //----DETECCION DE CLICK EN MENU-----------
        //ABRIR es m11
        m11.addActionListener(new ActionListener() {	
            public void actionPerformed(ActionEvent e) {
                tf.setText("ABRIR");			
                }	
            });
        
        //GUARDAR es m12
        m12.addActionListener(new ActionListener() {	
            public void actionPerformed(ActionEvent e) {
                tf.setText("GUARDAR");			
                }	
            });

        //SALIR es m13
        m13.addActionListener(new ActionListener() {	
            public void actionPerformed(ActionEvent e) {
                tf.setText("SALIR");			
                }	
            });
        
        //HERRAMIENTAS 1 es m21
        m21.addActionListener(new ActionListener() {	
            public void actionPerformed(ActionEvent e) {
                tf.setText("HERRAMIENTAS 1");			
                }	
            });
        
        //HERRAMIENTAS 2 es m22
        m22.addActionListener(new ActionListener() {	
            public void actionPerformed(ActionEvent e) {
                tf.setText("HERRAMIENTAS 2");			
                }	
            });
        
        //HERRAMIENTAS 3 es m23
        m23.addActionListener(new ActionListener() {	
            public void actionPerformed(ActionEvent e) {
                tf.setText("HERRAMIENTAS 3");			
                }	
            });
        
        //LINK DE ACERCA DE es m31
        m31.addActionListener(new ActionListener() {	
            public void actionPerformed(ActionEvent e) {
                tf.setText("CLICK EN LINK");			
                }	
            });        
        
        frame.setVisible(true);   


    } //fin del main

} //fin de clase principal