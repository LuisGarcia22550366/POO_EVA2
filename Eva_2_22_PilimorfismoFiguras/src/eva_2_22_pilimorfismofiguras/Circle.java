/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_2_22_pilimorfismofiguras;

/**
 *
 * @author invitado
 */
public class Circle implements Figuras, PrintData{

    private double radio;

    public Circle() {
        this.radio = 5;
    }

    public Circle(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;

    }

    @Override
    public double cArea() {
        
        return Math.PI * Math.pow(radio, 2);
    }
     @Override
    public double cPerimetro() {
    
        return Math.PI * (radio * radio);
    }

    @Override
    public void printData() {
        
        System.out.println("Circulo: ");
        System.out.println("Radio: " + radio);
        System.out.println("Area: " + cArea());
        System.out.println("Perimetro: " + cPerimetro());
    }
    
    

    }

   