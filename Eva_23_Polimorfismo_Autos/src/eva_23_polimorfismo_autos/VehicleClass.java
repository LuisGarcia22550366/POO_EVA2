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
public class VehicleClass {

    protected int velocity;
    private String model;

    public VehicleClass() {
        this.velocity = 0;
        this.model = "";
    }

    public VehicleClass(int velocity, String model) {
        this.velocity = velocity;
        this.model = model;
    }
    //La velocidad se modifica con acelerar
    public int getVelocity() {
        return velocity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
