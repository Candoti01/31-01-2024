package view;
import controller.*;
import java.util.*;

public class Erro_login {
    public static void erroLog() { 
        String nome;
        System.out.println("--==Ocorreu um erro durante seu login!==--\n");
        System.out.println("--==Digite seu login novamente ou precione enter para sair==--");
        Scanner scnNome = new Scanner(System.in);
        nome = scnNome.nextLine();
        InterfaceUsuariosPadoka.UsuarioLogs = nome;
        scnNome.close();
    }

    public static void errolog2() {
        System.out.println("Digite sua senha");
        Scanner scnSenha = new Scanner(System.in);
        String senha = scnSenha.nextLine();
        InterfaceUsuariosPadoka.SenhaLogs = senha;
        scnSenha.close();
    }
}
