/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_2_18_interfacesherencia;

/**
 *
 * @author invitado
 */
public class Eva_2_18_INTERFACESHERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

interface intA{
    void A();
}

interface intB{
    void B();
}
//Las interfaces si pueden heredar de multiples clases
interface intC extends intA, intB{
    void C();
}

class Try implements intC{

    @Override
    public void C() {
    }

    @Override
    public void A() {
    }

    @Override
    public void B() {
    }
    
}

