package superClass;

abstract public class Products {

	protected double price;
	private String description;
	private String unity;

	public Products() {
		this.price = 12;
		this.description = "";
		this.unity = "";

	}

	public Products(double price, String description, String unity) {
		
		this.price = price;
		this.description = description;
		this.unity = unity;
	}

	abstract public double priceSell(int cant);

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUnity() {
		return unity;
	}

	public void setUnity(String unity) {
		this.unity = unity;
	}

}
