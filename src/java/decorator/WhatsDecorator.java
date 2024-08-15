/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author alunos
 */
public class WhatsDecorator extends BaseDecorator{
    
    public WhatsDecorator(IDecorator pacote) {
        super(pacote);
    }
    
    @Override
    public String send(){
         String x = super.send();
         return (x + " e Whatsapp");
    }
    
}
