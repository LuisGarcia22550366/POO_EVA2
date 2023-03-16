package override;

public class Override {

	public static void main(String[] args) {

		Override override = new Override();
		Person person = override.new Person("Luis", 18);
		System.out.println(person.toString());

	}

	class Person {

		private String name;
		private int age;

		public Person() {
			this.name = "____";
			this.age = 0;
		}

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String toString() {
			String cade = "Datos: \n" + "Nombre: " + name + "\n" + "Edad: " + age;
			return cade;
		}

	}
}
