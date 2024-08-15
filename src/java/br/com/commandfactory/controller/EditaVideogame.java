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
public class EditaVideogame implements ICommand {
    
     public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
            
         videogamedao vdao = new videogamedao();
                   int a = Integer.parseInt(request.getParameter("memoria"));
                double b = Double.parseDouble(request.getParameter("valor"));
                int c = Integer.parseInt(request.getParameter("id"));

                videogamebuilder vb = new videogamebuilder();
                vb.setId(c);
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
              vdao.editar(v);
              
              return "videogamecontrol?btnoperacao=BuscarDados";
            
     }
    
}
