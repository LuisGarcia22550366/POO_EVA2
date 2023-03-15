package super2;

public class Teacher extends Person {

	private String plaza;

	public Teacher() {
		super();
		this.plaza = "";
	}

	public Teacher(String plaza, String name, String lastName, int age) {
		super(name, lastName, age);
		this.plaza = plaza;

	}

	public String getPlaza() {
		return plaza;
	}

	public void setPlaza(String plaza) {
		this.plaza = plaza;
	}

	@Override
	public void printData() {
		System.out.println("Plaza :" + plaza);
		super.printData();
	}
	
	

}
