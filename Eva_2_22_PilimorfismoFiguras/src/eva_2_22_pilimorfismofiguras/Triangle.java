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
public class Triangle implements Figuras, PrintData{

    private double base;
    private double altura;

    public Triangle() {
        
        this.altura = 0;
        this.base = 0;
    }

    public Triangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double cArea() {

        return (base * altura) / 2;
    }

    @Override
    public double cPerimetro() {

        double hip = Math.hypot(base, altura);
        return base + altura + hip;
    }

    @Override
    public void printData() {
        
        System.out.println("Triangulo: ");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Area: " + cArea());
        System.out.println("Perimetro: " + cPerimetro());
        
    }
    
    

}
