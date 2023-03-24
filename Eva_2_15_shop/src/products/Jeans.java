package products;

import superClass.Clothes;

public class Jeans extends Clothes {

	private String material;
	private String sizeJ;

	public Jeans() {
		this.material = "";
		this.sizeJ = "";
	}

	public Jeans(String size, String brand, String color, double price, String description, String unity,
			String material, String sizeJ) {
		super(size, brand, color, price, description, unity);
		this.material = material;
		this.sizeJ = sizeJ;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getSizeJ() {
		return sizeJ;
	}

	public void setSizeJ(String sizeJ) {
		this.sizeJ = sizeJ;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public double priceSell(int cant) {

		if (cant < 10)
			return getPrice() * cant;
		else
			return (getPrice() * 0.8) * cant;
	}

}
