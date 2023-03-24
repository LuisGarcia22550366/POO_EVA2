package superClass;

public abstract class Components extends Products {

	private String maker;
	private String model;
	private int warranty;

	public Components() {
		this.maker = "";
		this.model = "";
		this.warranty = 0;
	}

	public Components(double price, String description, String unity, String maker, String model, int warranty) {
		super(price, description, unity);
		this.maker = maker;
		this.model = model;
		this.warranty = warranty;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

}
