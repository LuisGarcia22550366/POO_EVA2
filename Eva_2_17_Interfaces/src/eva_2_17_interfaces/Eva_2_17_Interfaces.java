/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_2_17_interfaces;

/**
 *
 * @author invitado
 */
public class Eva_2_17_Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //PrintData p = PrintData();
        
        Person p = new Person("Luis", 18);
        p.print();
        Pc pc = new Pc("Ryzen 5 5600x", 16, 13000, "Laptop gamer shesh");
        pc.print();
    }
    
}
