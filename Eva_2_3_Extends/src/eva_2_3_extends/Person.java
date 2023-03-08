package eva_2_3_extends;

public class Person {

    private String name;
    private String lastName;
    private int age;

    public Person(){
        
    }
    
    public Person(String name, String lastName, int age){
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

    public String getLastNAme() {
        return lastName;
    }

    public void setLastNAme(String lastNAme) {
        this.lastName = lastNAme;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
