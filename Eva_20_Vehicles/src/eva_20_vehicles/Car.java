
package eva_20_vehicles;

public class Car extends SuperVehicle {

	private String modelo;
	private String marca;
	private double caballosMotor;
	private String matricula;

	public Car() {
	}

	public Car(String modelo, String marca, double caballosMotor, String matricula, int velocidad, int nNeumaticos,
			int peso, String color) {
		super(velocidad, nNeumaticos, peso, color);
		this.modelo = modelo;
		this.marca = marca;
		this.caballosMotor = caballosMotor;
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getCaballosMotor() {
		return caballosMotor;
	}

	public void setCaballosMotor(double caballosMotor) {
		this.caballosMotor = caballosMotor;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public void changeVelocity(int changeV) {
		int changeVe = velocidad += changeV;
		if ((changeVe) >= 0)
			velocidad = changeVe;

	}

	@Override
	public void printData() {
		System.out.println("Velocidad del vehiculo: " + getVelocidad());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Marca: " + getMarca());
		System.out.println("Caballos de fuerza: " + getCaballosMotor());
		System.out.println("MAtricula: " + getMatricula());

	}

}
