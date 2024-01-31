package view.ViewExibição;
import javax.swing.*;
import controller.*;

public class ExecutorRua 
{
   public static void iniciarProjeto() {
      RuaPadokaGraf Visivel = new RuaPadokaGraf(); 
      Visivel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Visivel.setSize(400, 130); 
      Visivel.setVisible(true);   
   }




} 

