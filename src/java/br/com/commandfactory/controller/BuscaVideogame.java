/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.commandfactory.controller;

import dao.videogamedao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.videogame;

/**
 *
 * @author PC Gamer
 */
public class BuscaVideogame implements ICommand{
    
     public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
       
         
         String id = request.getParameter("id");
              videogamedao vdao = new videogamedao();
              videogame v = vdao.buscardados(id);
              request.setAttribute("videogame", v);
              
              return "editar.jsp";
            
     }
    
}
