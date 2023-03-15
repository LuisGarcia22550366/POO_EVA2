package super2;

public class Person {

	private String name;
	private String lastName;
	private int age;

	public Person() {
		this.name = "";
		this.lastName = "";
		this.age = 1;
	}

	public Person(String name, String lastName, int age) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void printData() {
		System.out.println("Datos:");
		System.out.println("Nombre: " + this.name);
		System.out.println("Apellido: " + this.lastName);
		System.out.println("Edad: " + this.age);
		
	}

}
