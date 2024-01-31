package view.ViewExibição;
import javax.swing.*;
import controller.*;

public class ExecutorCardapio {
       public static void ExecutorDoCardapio() {
      ExibirCardapioGraf Visivel = new ExibirCardapioGraf(); 
      Visivel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Visivel.setSize(500, 500); 
      Visivel.setVisible(true);   
   }
}
