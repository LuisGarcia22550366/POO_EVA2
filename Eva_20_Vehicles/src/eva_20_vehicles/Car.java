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
public class Car extends SuperVehicle {

    private String modelo;
    private String marca;
    private double caballosMotor;
    private String matricula;

    public Car() {
    }

    public Car(String modelo, String marca, double caballosMotor, String matricula, int velocidad, int nNeumaticos, int peso, String color) {
        super(velocidad, nNeumaticos, peso, color);
        this.modelo = modelo;
        this.marca = marca;
        this.caballosMotor = caballosMotor;
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCaballosMotor() {
        return caballosMotor;
    }

    public void setCaballosMotor(double caballosMotor) {
        this.caballosMotor = caballosMotor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
