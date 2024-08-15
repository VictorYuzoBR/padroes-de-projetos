/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.commandfactory.controller;

import decorator.BaseDecorator;
import decorator.EmailDecorator;
import decorator.IDecorator;
import decorator.WhatsDecorator;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC Gamer
 */
public class NotifVideogame implements ICommand{
    
    public String executar(HttpServletRequest request, HttpServletResponse response) {
        
         String[] array = request.getParameterValues("cbnotify");
         
         IDecorator base = new EmailDecorator();
         IDecorator teste;
         String ax = base.send();
         
       
          try {   
              
         
         for (String x : array) {
             
             String nomeDaClasse = "decorator." + x + "Decorator";
             
             
             Class[] t = new Class[1] ;  
             t[0] = IDecorator.class;
             
             
             
             Class classe = Class.forName(nomeDaClasse);
             
             teste = (IDecorator) classe.getDeclaredConstructor(t).newInstance(base);
             base = teste;
             ax = teste.send();
                 
             } 
         
         
         
          } 
          
          catch (ClassNotFoundException ex) {
                 Logger.getLogger(NotifVideogame.class.getName()).log(Level.SEVERE, null, ex);
             } catch (NoSuchMethodException ex) {
            Logger.getLogger(NotifVideogame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(NotifVideogame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(NotifVideogame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(NotifVideogame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(NotifVideogame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(NotifVideogame.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
          
         
         
         
         
         request.setAttribute("msg", ax);
         
         return "resultadocheck.jsp";
        
    };
    
}
