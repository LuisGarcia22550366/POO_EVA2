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
abstract public class Electronica extends Producto {

    private String proccesor;
    private int ram;
    private int ssd;
    private String motherBoard;
    

    public Electronica() {

        super();
        this.proccesor = "";
        this.ram = 0;
        this.ssd = 0;
        this.motherBoard = "";
        
    }

    public Electronica(String proccesor, int ram, int ssd, String motherBoard, String maker, String model, int warranty, double price, String name, int unity) {
        super(price, name, unity);
        this.proccesor = proccesor;
        this.ram = ram;
        this.ssd = ssd;
        this.motherBoard = motherBoard;
        
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

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }

    
    @Override
    public double precioVenta(int cant) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
