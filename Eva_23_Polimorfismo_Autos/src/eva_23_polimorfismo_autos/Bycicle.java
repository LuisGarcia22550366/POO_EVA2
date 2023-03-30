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
public class Bycicle extends VehicleClass implements Vehicle{

    private String type;//Montaña, pista........................
    private String neumatics;

    public Bycicle() {
        super();
        this.type = "";
        this.neumatics = "";
    }

    public Bycicle(String type, String neumatics, int velocity, String model) {
        super(velocity, model);
        this.type = type;
        this.neumatics = neumatics;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNeumatics() {
        return neumatics;
    }

    public void setNeumatics(String neumatics) {
        this.neumatics = neumatics;
    }
    
     @Override
    public void acelerate(int changeV) {
        int changeVe = velocity += changeV;
        if((changeVe) >= 0)//Aceptar solo velocidades positivas y 0
        velocity = changeVe;
    }

    @Override
    public void tablePrint() {
        System.out.println("Velocidad bicicleta: " + getVelocity());
        System.out.println("Tipo de bicicleta: " + getType());
        System.out.println("Neumaticos: " + getNeumatics());
    }

}
