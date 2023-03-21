/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_2_15_productos;

import SuperClas.Electronica;

/**
 *
 * @author invitado
 */
public final class Pc extends Electronica {

    private String maker;
    private String model;
    private int warranty;

    public Pc() {
        this.maker = "";
        this.model = "";
        this.warranty = 0;
    }

    public Pc(String maker, String model, int warranty, String proccesor, int ram, int ssd, String motherBoard, String maker, String model, int warranty, double price, String name, int unity) {
        super(proccesor, ram, ssd, motherBoard, maker, model, warranty, price, name, unity);
        this.maker = maker;
        this.model = model;
        this.warranty = warranty;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

}

//Pc es una clase final, es el tope de la herencia
/* Laptop extends Pc{
    
}
