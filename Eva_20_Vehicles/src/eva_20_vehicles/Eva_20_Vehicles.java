
package eva_20_vehicles;

public class Eva_20_Vehicles {

	public static void main(String[] args) {

		Car car = new Car("2023", "Nissan", 149.0, "43423235", 45, 4, 8000, "Azul");
		car.printData();
		Bicycle bycicle = new Bicycle("Montana", "Manuales", 12, 2, 45, "Verde");
		bycicle.printData();
	}

}
