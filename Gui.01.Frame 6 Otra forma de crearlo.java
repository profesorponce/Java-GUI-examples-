// Clase Gui 2
// Otra forma de crear un JFrame (ventana)
//
// (c) Ricardo Ponce
// https://www.profesorponce.blogspot.com
// Junio 2022
// Slides Interfaces en Java GUI (p.19)

import javax.swing.*;

public class PrimerPrograma{
    
    public static void main(String[] args) { 
            MySimpleGUI gui = new MySimpleGUI();
        } //proceso main
    
} // fin de clase principal

class MySimpleGUI extends JFrame { 
     public MySimpleGUI() {
          setSize(400, 200); 
          setTitle("Ventana de tipo JFrame"); 
          setVisible(true);
     } // proceso MySimpleGUI
} //clase MySimpleGUI

