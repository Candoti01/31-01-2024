package view.ViewExibição;

import java.awt.event.*;
import javax.swing.*;

import com.mysql.cj.x.protobuf.MysqlxConnection.Close;

import java.awt.*; // specifies how components are arranged
import javax.swing.*;// loads images
import controller.*;
import view.BoasVindasView;
import view.CardapioView;

public class EntradaPadoka extends JFrame {
    private final JLabel label1;

    public EntradaPadoka() {

        super("Entrada Padoka");
        setLayout(new FlowLayout()); // set frame layout

        // JLabel constructor with a string argument
        label1 = new JLabel(InterfaceGraficController.bemVindo);
        label1.setToolTipText("Voce é bem vindo!");
        add(label1); // add label1 to JFrame// add label2 to JFrame

        ButtonFrame();
    }

    // ButtonFrame adds JButtons to JFrame
    public void ButtonFrame() {
        final JButton botaoB1; // button with just text
        final JButton botaoB2;
        // button with icons

        botaoB1 = new JButton("Ver Cardapio"); // button with text
        add(botaoB1); // add Botao1 to JFrame
        botaoB2 = new JButton("Sair da padoka");
        add(botaoB2);

        ButtonHandler handler = new ButtonHandler();
        botaoB1.addActionListener(handler);
        botaoB2.addActionListener(handler);
    }

    // inner class for button event handling
    private class ButtonHandler implements ActionListener {
        // handle button event
        @Override
        public void actionPerformed(ActionEvent event) {
            String botaoClick = event.getActionCommand();

            if (botaoClick.equals("Ver Cardapio")) {
                AppCardapio.cardapioExibir();
                //BoasVindasView.exibirCumprimento();
            }
            if (botaoClick.equals("Sair da padoka")) {
                AppSair.sair();
            }

        }
    }
}
