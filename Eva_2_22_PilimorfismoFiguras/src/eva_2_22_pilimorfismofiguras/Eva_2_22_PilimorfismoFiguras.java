/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_2_22_pilimorfismofiguras;

/**
 *
 * @author invitado
 */
public class Eva_2_22_PilimorfismoFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle circle = new Circle();
        circle.printData();
        Figuras fig = circle;
        System.out.println("Area: " + fig.cArea());
    }
    
}
