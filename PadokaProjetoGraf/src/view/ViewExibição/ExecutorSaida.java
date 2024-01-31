package view.ViewExibição;
import javax.swing.*;
import controller.*;

public class ExecutorSaida {
    public static void sairPadoka() {
        SairPadoka Visivel = new SairPadoka();
        Visivel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Visivel.setSize(100, 100); 
        Visivel.setVisible(true); 
     }
}
