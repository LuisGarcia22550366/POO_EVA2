/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_2_21_polimorfismo;

/**
 *
 * @author invitado
 */
public class Eva_2_21_Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Teacher te = new Teacher();
        te.setPlaza("23");
        te.setName("Luis");
        te.setAge(18);
        te.setLastName("Garcia");
        Person perso = te;
        Person perso2 = new Person();
        //No se puede convertir una persona en un maestro
        //No se pueden agregar cosas, solo se ocultan propiedades
        //Teacher te = perso2;
        te.printData();
    }

}
