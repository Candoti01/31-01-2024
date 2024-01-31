package model;
import java.sql.*;
import java.util.*;
import controller.*;

public class Log_Model {
    public static void main(String[] args) {
        TelaLogModel();
    }
    
    public static void envioMetodoErro() {
        ErroLogin.erro_log();
        throw new ArithmeticException("Erro no login!");
    }
    
    public static void TelaLogModel() {
        try{
            Connection conn = MySQLConnector.conectar();
            String strSqlSelect = "select * from `mysql_connector`.`tbl_clientes` where `nome` = '" + InterfaceUsuariosPadoka.UsuarioLogs + "' and `senha` = '" + InterfaceUsuariosPadoka.SenhaLogs + "';"; 
            Statement stmSql = conn.createStatement(); 
            ResultSet rsSql = stmSql.executeQuery(strSqlSelect);
                if(rsSql.next()) {
                    ComprasPadoka.ComprarBolos();
                } else {}
            } catch (Exception e) {

        }
    }

}
