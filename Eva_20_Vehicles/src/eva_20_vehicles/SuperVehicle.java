
package eva_20_vehicles;

abstract public class SuperVehicle implements Vehicle {

    protected int velocidad;
    private int nNeumaticos;
    private int peso;
    private String color;

    public SuperVehicle() {
    }

    public SuperVehicle(int velocidad, int nNeumaticos, int peso, String color) {
        this.velocidad = velocidad;
        this.nNeumaticos = nNeumaticos;
        this.peso = peso;
        this.color = color;
    }

    public int getnNeumaticos() {
        return nNeumaticos;
    }

    public void setnNeumaticos(int nNeumaticos) {
        this.nNeumaticos = nNeumaticos;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    

}
