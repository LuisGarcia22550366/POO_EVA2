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
public class Circulo extends Figura {

    private int radio;

    public Circulo() {
    }

    public Circulo(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    @Override
    public double cArea(){
        return Math.PI * (radio * radio);
    }
    
    @Override
    public double cPerimetro(){
        return Math.PI * (radio * 2);
    }

}
