/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_2_17_interfaces;

/**
 *
 * @author invitado
 */
public class Pc extends Producto implements PrintData{
    
    private String proccesor;
    private int ram;

    public Pc() {
    }

    public Pc(String proccesor, int ram, double price, String name) {
        super(price, name);
        this.proccesor = proccesor;
        this.ram = ram;
    }

    public String getProccesor() {
        return proccesor;
    }

    public void setProccesor(String proccesor) {
        this.proccesor = proccesor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public void print() {
        System.out.println("Nombre: " + name);
        System.out.println("Precio: " + price);
        System.out.println("Procesador: " + proccesor);
        System.out.println("Ram: " + ram);
    }
    
    
}
