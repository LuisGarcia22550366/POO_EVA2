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
public class Auto extends VehicleClass  implements Vehicle{

    private String marca;

    private int age;

    public Auto() {
        super();
        this.marca = "";

        this.age = 0;
    }

    public Auto(String marca, int velocity, String model, int age) {
        super(velocity, model);
        this.marca = marca;

        this.age = age;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void acelerate(int changeV) {
        int changeVe = velocity += changeV;
        if((changeVe) >= 0)//Aceptar solo velocidades positivas y 0
        velocity = changeVe;
    }

    @Override
    public void tablePrint() {
        System.out.println("Velocidad del automovil: " + getVelocity());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getAge());
    }

}
