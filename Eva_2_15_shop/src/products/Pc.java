package products;

import superClass.Components;

public class Pc extends Components {
	private int ram;
	private double screenSize;
	private int memory;
	private String proccesor;

	public Pc() {
		this.ram = 0;
		this.screenSize = 0;
		this.memory = 0;
		this.proccesor = "";

	}

	public Pc(double price, String description, String unity, String maker, String model, int warranty, int ram,
			double screenSize, int memory, String proccesor) {
		super(price, description, unity, maker, model, warranty);
		this.ram = ram;
		this.screenSize = screenSize;
		this.memory = memory;
		this.proccesor = proccesor;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public String getProccesor() {
		return proccesor;
	}

	public void setProccesor(String proccesor) {
		this.proccesor = proccesor;
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
