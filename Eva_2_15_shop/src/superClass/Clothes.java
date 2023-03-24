package superClass;

abstract public class Clothes extends Products {

	private String size;
	private String brand;
	private String color;

	public Clothes() {
		this.size = "";
		this.brand = "";
		this.color = "";
	}

	public Clothes(String size, String brand, String color, double price, String description, String unity) {
		super(price, description, unity);
		this.brand = "";
		this.size = "";
		this.color = "";

	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	

}
