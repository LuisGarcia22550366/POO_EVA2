/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperClas;

/**
 *
 * @author invitado
 */
abstract public class Producto {

    private String name;
    private double price;
    private int unity;

    public Producto() {
        this.price = 0;
        this.name = "---";
        this.unity = 0;
    }

    public Producto(double price, String name, int unity) {
        this.price = price;
        this.name = name;
        this.unity = unity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getUnity() {
        return unity;
    }

    public void setUnity(int unity) {
        this.unity = unity;
    }

    public abstract double precioVenta(int cant);

}
