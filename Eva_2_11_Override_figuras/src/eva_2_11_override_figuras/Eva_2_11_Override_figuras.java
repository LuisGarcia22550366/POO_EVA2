/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_2_11_override_figuras;

/**
 *
 * @author invitado
 */
public class Eva_2_11_Override_figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo circu = new Circulo(10);
        System.out.println("Area: " + circu.cArea());
        System.out.println("Perimetro: " + circu.cPerimetro());
    }
    
}
