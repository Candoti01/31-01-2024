package view;
import controller.*;
import java.util.*;
public class CardapioExibir {

    public static void ExibindoCardapio() {
        System.out.println("---===--- Cardapio de bolos ---===---");
        System.out.println(InterfacePadoka.resultadoModelDisponivel);
        System.out.println("\n Deseja Comprar?  -=[S] | [N]=-");
        Scanner scnRespostas = new Scanner(System.in);
        String strRespostas = scnRespostas.nextLine().toUpperCase();
        
        scnRespostas.close();
        if (strRespostas == "S") {
            CadastroController.IniciandoCad();
        }else {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Deseja sair? ");
            strRespostas = scnRespostas.nextLine().toUpperCase();
            if (strRespostas == "S") {
                System.out.println("Obrigado por vir, volte sempre!!");
            }else{
                EntradaPadoka.main(null);
            }
        }
    }

}
