package super2;

public class Provvedor extends Person{
	
	private String rfc;
	
	public Provvedor() {
		super();
		this.rfc = "";
	}

	public Provvedor(String rfc,String name, String lastName, int age) {
		super(name, lastName, age);
		this.rfc = rfc;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	
	public void printData() {
		System.out.println("Rfc :" + rfc);
		super.printData();
	}
	
	
}
