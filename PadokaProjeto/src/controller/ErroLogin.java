package controller;

import view.*;
import model.*;
import java.util.*;

public class ErroLogin {
    public static void erro_log() {   
        Erro_login.erroLog();
        if (!InterfaceUsuariosPadoka.UsuarioLogs.equals("")) {
            Log_Model.TelaLogModel();
        }
    }
}
