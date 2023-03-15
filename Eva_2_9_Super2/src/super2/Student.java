package super2;

public class Student extends Person{
	
	private String noControl;
	
	public Student() {
		super();
		this.noControl = "";
	}

	public Student(String noControl, String name, String lastName, int age) {
		super(name, lastName, age);
		this.noControl = noControl;
	}
	
	
	public Student (String noControl) {
		this.noControl = noControl;
	}

	public String getNoControl() {
		return noControl;
	}

	public void setNoControl(String noControl) {
		this.noControl = noControl;
	}

	@Override
	public void printData() {
		System.out.println("No control: " + noControl);
		super.printData();
	}
	
}
