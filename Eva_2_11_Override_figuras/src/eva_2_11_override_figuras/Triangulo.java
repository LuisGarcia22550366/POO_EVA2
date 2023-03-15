/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_2_11_override_figuras;

/**
 *
 * @author invitado
 */
public class Triangulo extends Figura {

    private int altura;
    private int base;

    public Triangulo() {
        
        this.altura = 6;
        this.base = 8;
    }

    public Triangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public double cArea(){
        return (base * altura) / 2;
    }
    
    @Override
    public double cPerimetro(){
        return (altura * altura) + (base * base);
    }
}
