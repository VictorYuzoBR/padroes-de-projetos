/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author alunos
 */
public class EmailDecorator implements IDecorator {
    
      @Override
      public String send(){ 
        return ("Você receberá notificações por email");
        

              
    }
    
      
}
