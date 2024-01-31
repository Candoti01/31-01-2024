package view.ViewExibição;
// Fig. 12.6: LabelFrame.java
// JLabels with text and icons.

import java.awt.event.*;
import javax.swing.*;

import com.mysql.cj.x.protobuf.MysqlxConnection.Close;

import java.awt.*; // specifies how components are arranged
import javax.swing.*;// loads images
import controller.*;
import view.BoasVindasView;
import view.CardapioView;
public class RuaPadokaGraf extends JFrame 
{
   private final JLabel label1; // JLabel with just text
   public RuaPadokaGraf()
   {
      super("Rua");
      setLayout(new FlowLayout()); // set frame layout

      // JLabel constructor with a string argument
      label1 = new JLabel(InterfaceGraficController.msgRua);
      label1.setToolTipText("Voce é bem vindo!");
      add(label1); // add label1 to JFrame// add label2 to JFrame      

      ButtonFrame();
   }

   // ButtonFrame adds JButtons to JFrame
   public void ButtonFrame()
   {
      final JButton botaoB1; // button with just text
      final JButton botaoB2;
// button with icons
   

      botaoB1 = new JButton("Entrar na padoka"); // button with text
      add(botaoB1); // add Botao1 to JFrame
      botaoB2 = new JButton("Fechar o programa");
      add(botaoB2);
      
      ButtonHandler handler = new ButtonHandler();
      botaoB1.addActionListener(handler);
      botaoB2.addActionListener(handler);
   }

   // inner class for button event handling
   private class ButtonHandler implements ActionListener 
   {
      // handle button event
      @Override
      public void actionPerformed(ActionEvent event)
      {
         setVisible(false);
         String valorBotao = event.getActionCommand();
         InterfaceGraficController.botaoRua = valorBotao;
         if (valorBotao == "Entrar na padoka") {
            AppEntrada.entradaPadoka();
         } 
         if (valorBotao == "Fechar o programa") {
            AppSair.sair();
         } 
         //BoasVindasView.exibirCumprimento();
      }
   }
   
}
