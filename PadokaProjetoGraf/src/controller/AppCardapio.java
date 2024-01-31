package controller;
import model.CardapioModel;
import view.Cardapio;
import view.ViewExibição.*;

public class AppCardapio {
    public static void cardapioExibir() {
        CardapioModel.atualizarCardapio();
        ExecutorCardapio.ExecutorDoCardapio();
    }
}
