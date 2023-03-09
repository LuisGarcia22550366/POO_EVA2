/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_2_6_constructor;

/**
 *
 * @author invitado
 */
public class Eva_2_6_Constructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Animal");
        Animal ani =  new Animal();
        ani.comer();
        ani.respirar();
        System.out.println("Mamifero");
        Mamifero mam = new Mamifero();
        mam.comer();
        mam.respirar();
    }
    
}
