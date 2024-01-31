package controller;

import model.*;
import view.*;
import java.util.*;

public class CadastroController {
    
        public static void IniciandoCad() {
        Log_CadView.CadastroUsuario();
    }

    public static void Cad_User() {
        Cad_View.Tela_Cad();
        Cad_Model.Cad_userSQL();
        CadConcluido.Cad_Concluido();
        LoginCotroller.Log_User();
    }
}
