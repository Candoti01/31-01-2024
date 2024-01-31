package view.ViewExibição;
// Fig. 12.6: LabelFrame.java
// JLabels with text and icons.

import java.awt.event.*;
import javax.swing.*;

import com.mysql.cj.x.protobuf.MysqlxConnection.Close;

import java.awt.*; // specifies how components are arranged
import javax.swing.*;// loads images
import controller.*;
import view.*;
public class ExibirCardapioGraf extends JFrame 
{
   private final JLabel label1; // JLabel with just text
   public ExibirCardapioGraf()
   {
      super("Cardapio");
      setLayout(new FlowLayout()); // set frame layout

      // JLabel constructor with a string argument
      label1 = new JLabel(InterfaceGraficController.Cardapio);
        label1.setToolTipText(InterfaceGraficController.Produtos);
      add(label1); // add label1 to JFrame// add label2 to JFrame      

    }
}