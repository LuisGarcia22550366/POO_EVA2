package super2;

public class Super2 {
	
	public static void main(String args[]) {
		
		Student student = new Student("22550366", "Luis", "Garcia", 18);
		student.printData();
		
		Teacher teacher = new Teacher("12121212" , "Luis", "Garcia", 23);
		teacher.printData();
		
		Provvedor provedor = new Provvedor("FGH234232", "Luis", "Garcia", 45);
		provedor.printData();
	}

}
