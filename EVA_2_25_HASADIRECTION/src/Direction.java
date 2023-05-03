
public class Direction {

	public static void main(String[] args) {

		Person person = new Person();
		person.setNombre("Eduardo");
		person.setApellido("Muñoz");
		person.setEdad(18);

		// Para asginar la dirección, debemos crear un objeto de tipo dirección.
		// direccion direc = new direccion();
		// direc.setCalle("Industrias");
		// direc.setNúmero(11101);
		// direc.setCp("31135");
		// direc.setColonia("Complejo Industrial Chihuahua");
		// direc.setCiudad("Chihuahua");
		// direc.setEstado("Chihuahua");
		// persona.setDirec(direc);
		person.imprimirDatos();

	}

}

class direction {
	private String street;
	private int number;
	private String colony;
	private String cp;
	private String city;
	private String state;

	public direction() {
		this.street = "";
		this.number = 0;
		this.colony = "";
		this.cp = "";
		this.city = "";
		this.state = "";
	}

	public direction(String street, int number, String colony, String cp, String city, String state) {
		this.street = street;
		this.number = number;
		this.colony = colony;
		this.cp = cp;
		this.city = city;
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getColony() {
		return colony;
	}

	public void setColony(String colony) {
		this.colony = colony;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void imprimirDatos() {
		System.out.println("DIRECCION: ");
		System.out.println("Calle: " + street);
		System.out.println("Número: " + number);
		System.out.println("Colonia: " + colony);
		System.out.println("CP: " + cp);
		System.out.println("Ciudad: " + city);
		System.out.println("Estado: " + state);
	}

}

class Person {
	private String name;
	private String last_name;
	private int age;
	private direction direc;// Persona has a

	public Person() {
		this.name = "----";
		this.last_name = "----";
		this.age = 0;
		this.direc = null;// NO SE HA CREADO UN OBJETO DE TIPO DIRECCIÓN
	}

	public Person(String name, String last_name, int age, direction direc) {
		this.name = name;
		this.last_name = last_name;
		this.age = age;
		this.direc = direc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public direction getDirec() {
		return direc;
	}

	public void setDirec(direction direc) {
		this.direc = direc;
	}

	public void imprimirDatos() {
		System.out.println("NOMBRE: " + name);
		System.out.println("APELLIDO: " + last_name);
		System.out.println("EDAD: " + age);
		if (direc == null)
			System.out.println("Sin dirección");
		else
			direc.imprimirDatos();
	}

}

class Sucursal {
	private String nombreSucursal;
	private direction direc;
}
