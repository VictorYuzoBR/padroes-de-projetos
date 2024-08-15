/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.commandfactory.controller;

import dao.videogamedao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.videogame;
import model.videogamebuilder;

/**
 *
 * @author PC Gamer
 */
public class CadastraVideogame implements ICommand {
    
      @Override
      public String executar(HttpServletRequest request, HttpServletResponse response) {
          
               int a = Integer.parseInt(request.getParameter("memoria"));
                double b = Double.parseDouble(request.getParameter("valor"));

                /* videogame v = new videogame(request.getParameter("nome"),request.getParameter("fabricante"),request.getParameter("tipo"), 
                request.getParameter("garantia"), b, a, request.getParameter("processador"),
                request.getParameter("tipomidia"),request.getParameter("ano")); */
                videogamebuilder vb = new videogamebuilder();
                vb.setNome(request.getParameter("nome"));
                vb.setFabricante(request.getParameter("fabricante"));
                vb.setTipo(request.getParameter("tipo"));
                vb.setGarantia(request.getParameter("garantia"));
                vb.setValor(b);
                vb.setMemoria(a);
                vb.setProcessador(request.getParameter("processador"));
                vb.setTipomidia(request.getParameter("tipomidia"));
                vb.setAno(request.getParameter("ano"));
                videogame v = vb.constroi();
                
                videogamedao vdao = new videogamedao();
                
                String message = "";
                
                try {
                    vdao.cadastrar(v);
                    
                } catch (SQLException ex) {
                    Logger.getLogger(CadastraVideogame.class.getName()).log(Level.SEVERE, null, ex);
                } 
                  request.setAttribute("message", message);
                return "videogamecontrol?btnoperacao=BuscarDados";
      }
    
}
