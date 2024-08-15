/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alunos
 */
public class ConectaBanco {
    
    public static Connection getConexao() {
        try {
            // O método forName carrega e inicia o driver passado por parâmetro
             Class.forName("com.mysql.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/trabalhopedro";
            String USER = "root";
            String PASSWORD = "senhaaleatoria12";
            // Estabelecendo a conexão
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) { // Tratamento de Exceções
            System.out.println("erro na conexao");
            return null;
        }
    }
     
     
    
}
