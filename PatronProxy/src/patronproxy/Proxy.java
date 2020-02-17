/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronproxy;

/**
 *
 * @author estudiantes
 */
public class Proxy implements InterfazOperacion{
    
    InterfazOperacion io;
    Adaptador oe;
    
    @Override
    public void Operacion(){
       io = new ObjetoOperacion();
       io.Operacion();
       oe = new Adaptador();
       oe.Operacion();
       
        
    }
    
}
