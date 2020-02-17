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
public class Adaptador implements InterfazOperacion{
    
    ObjetoExterior oe = new ObjetoExterior();

    @Override
    public void Operacion() {
        oe.doSometing();
    }
    
}
