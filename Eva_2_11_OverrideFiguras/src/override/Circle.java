package override;

public class Circle extends Figura {

	private int radio;

	public Circle() {
	}

	public Circle(int radio) {
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public double cArea() {
		return Math.PI * (radio * radio);
	}

	public double cPerimetro() {
		return Math.PI * (radio * 2);
	}

	@Override
	public String toString() {
		return "Circle [cArea()=" + cArea() + ", cPerimetro()=" + cPerimetro() + ", toString()=" + super.toString()
				+ "]";
	}

	
	

}
