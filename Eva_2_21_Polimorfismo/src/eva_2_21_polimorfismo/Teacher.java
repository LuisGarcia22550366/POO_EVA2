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
public class Teacher extends Person {

    private String plaza;

    public Teacher() {
        super();
        this.plaza = "";
    }

    public Teacher(String plaza, String name, String lastName, int age) {
        super(name, lastName, age);
        this.plaza = plaza;

    }

    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println("Plaza :" + plaza);

    }
}
