package view;

import java.util.*;
import controller.*;

public class UserInteraction {
    public static void main(String[] args) {

    }

    public static void respostaCliente() {
        String respostas;
        Scanner scnVerCardapio = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\n--==Bem vindo a confeitaria jardim!==--\n");
        try {
            System.out.println("Voce deseja ver nosso cardapio? [S] | [N]");
            respostas = scnVerCardapio.nextLine().toUpperCase();
            if (respostas.equals("S")) {
                InterfacePadoka.msgControler = "2";

            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Selecione uma das opçoes abaixo: ");
                System.out.println("\n[1] - Fazer pedido.");
                System.out.println("\n[2] - Ver Cardapio.");
                System.out.println("\n[3] - Ir Embora.");
                respostas = scnVerCardapio.nextLine();
                switch (respostas) {
                    case "1":
                        InterfacePadoka.msgControler = "1";

                    case "2":
                        InterfacePadoka.msgControler = "2";

                    case "3":
                        System.out.println("Saindo...");
                    default:
                        System.out.println("Saindo...");
                }

            }
        } catch (Exception e) {
            System.err.println("Ocorreu um erro! " + e);
        }
        scnVerCardapio.close();
    }
}