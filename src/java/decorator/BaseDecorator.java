/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author alunos
 */
public class BaseDecorator implements IDecorator {
    
    private IDecorator pacote;
    
         BaseDecorator(IDecorator pacote) {
          this.pacote = pacote;
      }   
         
    @Override
       public String send() {
           return pacote.send();
       }  
    
    
}
