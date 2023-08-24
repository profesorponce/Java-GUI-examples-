// Calculadora de Ejemplo
//
// (c) Ricardo Ponce
// https://www.profesorponce.blogspot.com
// Agosto 2022

import javax.swing.*;
import java.awt.*;

public class PrimerPrograma{
    
    public static void main(String[]args) {    
    
   public static void main(String[] args){
                
        // genera la interface
        pantalla();                  
        
        
    } // fin de main
    
    private static int pantalla() {
        
        JFrame frame = new JFrame("Calculadora Simple");      
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        frame.setSize(265, 250);      

        // crear panel y ordenar por posición personalizada de objetos
        JPanel panel = new JPanel();
        panel.setLayout(null); // declarar null el ordenamiento de objetos
               
        // agregar el display
        JTextField campoDeTexto = new JTextField(20);
        campoDeTexto.setEditable(false);
        campoDeTexto.setText(" ");
        campoDeTexto.setBounds(10, 10, 90, 30);
        panel.add(campoDeTexto);
        // Obtener texto:	String str = campoDeTexto.getText();        

        // boton 7
        JButton boton7 = new JButton("7");  
        boton7.setBounds(10, 50, 50, 30);
        panel.add(boton7);
        // boton 8          
        JButton boton8 = new JButton("8");  
        boton8.setBounds(70, 50, 50, 30);
        panel.add(boton8);
        //boton 9
        JButton boton9 = new JButton("9");  
        boton9.setBounds(130, 50, 50, 30);
        panel.add(boton9);
        
        // boton 7
        JButton boton4 = new JButton("4");  
        boton4.setBounds(10, 90, 50, 30);
        panel.add(boton4);
        // boton 8          
        JButton boton5 = new JButton("5");  
        boton5.setBounds(70, 90, 50, 30);
        panel.add(boton5);
        //boton 9
        JButton boton6 = new JButton("6");  
        boton6.setBounds(130, 90, 50, 30);
        panel.add(boton6);
        
        // boton 1
        JButton boton1 = new JButton("1");  
        boton1.setBounds(10, 130, 50, 30);
        panel.add(boton1);
        // boton 2          
        JButton boton2 = new JButton("2");  
        boton2.setBounds(70, 130, 50, 30);
        panel.add(boton2);
        //boton 3
        JButton boton3 = new JButton("3");  
        boton3.setBounds(130, 130, 50, 30);
        panel.add(boton3);
        
        // boton 1
        JButton boton0 = new JButton("0");  
        boton0.setBounds(10, 170, 110, 30);
        panel.add(boton0);
        // boton .          
        JButton botonCOMA = new JButton(".");  
        botonCOMA.setBounds(130, 170, 50, 30);
        panel.add(botonCOMA);

        // boton CLEAR
        JButton botonCLEAR = new JButton("Clear");  
        botonCLEAR.setBounds(110, 10, 70, 30);
        panel.add(botonCLEAR);

        // boton SUMA
        JButton botonSUMA = new JButton("+");  
        botonSUMA.setBounds(190, 10, 50, 30);
        panel.add(botonSUMA);
        
        // boton RESTA
        JButton botonRESTA = new JButton("-");  
        botonRESTA.setBounds(190, 50, 50, 30);
        panel.add(botonRESTA);
        
        // boton MULTIPLICACION
        JButton botonMULTIPLICACION = new JButton("X");  
        botonMULTIPLICACION.setBounds(190, 90, 50, 30);
        panel.add(botonMULTIPLICACION);
        
        // boton DIVISION
        JButton botonDIVISION = new JButton("/");  
        botonDIVISION.setBounds(190, 130, 50, 30);
        panel.add(botonDIVISION);
        
        // boton IGUAL
        JButton botonIGUAL = new JButton("=");  
        botonIGUAL.setBounds(190, 170, 50, 30);
        panel.add(botonIGUAL);        
        
        // agregar panel al frame y hacerlo visible
        frame.setContentPane(panel);       
        frame.setVisible(true);  
        
        return 0;
        
    } // fin de pantalla
    

    } // fin de main
     
} // fin de clase principal
