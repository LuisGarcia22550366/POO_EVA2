package override;

public class Triangle extends Figura{
	
	private int altura;
	private int base;

	public Triangle() {

		this.altura = 6;
		this.base = 8;
	}

	public Triangle(int altura, int base) {
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
	public double cArea() {
		return (base * altura) / 2;
	}

	@Override
	public double cPerimetro() {
		return (altura * altura) + (base * base);
	}

	@Override
	public String toString() {
		return "Triangle [cArea()=" + cArea() + ", cPerimetro()=" + cPerimetro() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	

}
