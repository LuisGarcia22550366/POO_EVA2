/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_20_vehicles;

/**
 *
 * @author invitado
 */
abstract public class SuperVehicle implements Vehicle {

    private int velocidad;
    private int nNeumaticos;
    private int peso;
    private String color;

    public SuperVehicle() {
    }

    public SuperVehicle(int velocidad, int nNeumaticos, int peso, String color) {
        this.velocidad = velocidad;
        this.nNeumaticos = nNeumaticos;
        this.peso = peso;
        this.color = color;
    }

    public int getnNeumaticos() {
        return nNeumaticos;
    }

    public void setnNeumaticos(int nNeumaticos) {
        this.nNeumaticos = nNeumaticos;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int acelerar(int acelera) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int detener(int acelera) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
