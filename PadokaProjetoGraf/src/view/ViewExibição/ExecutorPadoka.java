package view.ViewExibição;
import javax.swing.*;
import controller.*;

public class ExecutorPadoka {
       public static void entradaPadoka() {
      EntradaPadoka Visivel = new EntradaPadoka(); 
      Visivel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Visivel.setSize(200, 130); 
      Visivel.setVisible(true);   
   }
}
