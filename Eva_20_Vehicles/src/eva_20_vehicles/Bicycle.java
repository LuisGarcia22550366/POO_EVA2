
package eva_20_vehicles;


public class Bicycle extends SuperVehicle {

    private String tipo;
    private String tipoFrenos;

    public Bicycle() {
    	this.tipo = "";
    	this.tipoFrenos = "";
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

    @Override
	public void changeVelocity(int changeV) {
		int changeVe = velocidad += changeV;
		if ((changeVe) >= 0)
			velocidad = changeVe;

	}

	@Override
	public void printData() {
		System.out.println("Velocidad de la bicicleta: " + getVelocidad());
		System.out.println("Tipo de bicicleta: " + getTipo());
		System.out.println("Tipo de frenos: " + getTipoFrenos());

	}

}
