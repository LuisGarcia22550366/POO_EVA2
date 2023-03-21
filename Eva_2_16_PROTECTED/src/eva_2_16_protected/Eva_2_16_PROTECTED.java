/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_2_16_protected;

/**
 *
 * @author invitado
 */
public class Eva_2_16_PROTECTED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        SuperClase superA = new SuperClase();
        

    }

}

class SuperClase {

    protected int data;

   

}

class SubClase extends SuperClase {

    public void print() {
        System.out.println("A: " + data);
    }
}
