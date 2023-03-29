/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_23_polimorfismo_autos;

/**
 *
 * @author invitado
 */
public class Eva_23_Polimorfismo_Autos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Auto a = new Auto("Nissan", 0, "Sentra", 2023);
        changeVelocity(a, 45);
        Bycicle b = new Bycicle("Montaña", "XXX", 0, "Harley");
        changeVelocity(b, 17);
        //Clase Object -------> 
        Object obj = a;
    }

    public static void changeVelocity(Vehicle vehi, int vel) {
        vehi.acelerate(vel);
        vehi.tablePrint();
    }

}
