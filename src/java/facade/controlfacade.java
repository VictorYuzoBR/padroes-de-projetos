/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

import br.com.commandfactory.controller.ICommand;
import java.io.IOException;import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 *
 * @author PC Gamer
 */
public class controlfacade {
    
    public void acionar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException {
    
        try {
         String paramAction = request.getParameter("btnoperacao");
                String nomeDaClasse = "br.com.commandfactory.controller." + paramAction + "Videogame";
                
                Class classeAction = Class.forName(nomeDaClasse);
                ICommand commandAction = (ICommand) classeAction.newInstance();
                
                
                
                String pageDispatcher = commandAction.executar(request, response);
                request.getRequestDispatcher("/" + pageDispatcher).forward(request, response);
        } catch (Exception ex) {
             System.out.println("Erro: " + ex.getMessage());
        }
        
        
    }
    
}
