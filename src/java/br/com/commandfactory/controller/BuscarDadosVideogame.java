/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.commandfactory.controller;

import dao.videogamedao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.List;
import model.videogame;

/**
 *
 * @author PC Gamer
 */
public class BuscarDadosVideogame implements ICommand{
  public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {  
   
      videogamedao vdao = new videogamedao();

    

                try {
                    List<videogame> lista = vdao.listartodos();
                    
                            
                    
                    request.setAttribute("lista", lista);
                } catch (SQLException ex) {
                    
                    System.out.println("Erro: " + ex.getMessage());
                }
                return "/dados.jsp";
                 
  }
}
