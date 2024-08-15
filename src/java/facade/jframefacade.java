/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

import dao.videogamedao;
import java.sql.SQLException;
import model.videogame;

/**
 *
 * @author PC Gamer
 */
public class jframefacade {
    
    public String Cadastrar(videogame v) {
        
         
        
        videogamedao vdao = new videogamedao();
        String message = "";
        try {
            vdao.cadastrar(v);
            message = "CADATRADO COM SUCESSO";
        } catch (SQLException ex) {
            message = "CADASTRO NÃO REALIZADO: " + ex.getMessage();
            System.out.println("Erro: " + ex.getMessage());
        }
        return message;
    
        
    }
    
      public String Deletar(videogame v) {
        
         
        
        videogamedao vdao = new videogamedao();
        String message = "";
        vdao.deletar(v);
        message = "DELETADO COM SUCESSO";
        return message;
    
        
    }
    
}
