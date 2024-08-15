/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.commandfactory.controller;

import dao.videogamedao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.videogame;
import model.videogamebuilder;

/**
 *
 * @author PC Gamer
 */
public class DeletaVideogame implements ICommand{
    
     public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
            videogamedao vdao = new videogamedao();
            videogamebuilder vb = new videogamebuilder();
            vb.setId(Integer.parseInt(request.getParameter("id")));
            videogame v = vb.constroi();
              
              vdao.deletar(v);
              
              return "videogamecontrol?btnoperacao=BuscarDados";
            
     }
    
}
