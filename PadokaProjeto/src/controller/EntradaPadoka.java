package controller;
import view.*;
import model.*;

public class EntradaPadoka {
    public static void main(String[] args) {
        InterfacePadoka.resultadoModelDisponivel = "";
        UserInteraction.respostaCliente();
        if (InterfacePadoka.msgControler.equals("2")) {
            CardapioModel.exibirCardapio();
            CardapioExibir.ExibindoCardapio();
        } else {
            if(InterfacePadoka.msgControler.equals("1")) {
                CadastroController.IniciandoCad();
            }
        }
    }
}
