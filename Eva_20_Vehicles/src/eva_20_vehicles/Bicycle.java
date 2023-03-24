/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_20_vehicles;

/**
 *
 * @author invitado
 */
public class Bicycle extends SuperVehicle {

    private String tipo;
    private String tipoFrenos;

    public Bicycle() {
    }

    public Bicycle(String tipo, String tipoFrenos, int velocidad, int nNeumaticos, int peso, String color) {
        super(velocidad, nNeumaticos, peso, color);
        this.tipo = tipo;
        this.tipoFrenos = tipoFrenos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipoFrenos() {
        return tipoFrenos;
    }

    public void setTipoFrenos(String tipoFrenos) {
        this.tipoFrenos = tipoFrenos;
    }

}
