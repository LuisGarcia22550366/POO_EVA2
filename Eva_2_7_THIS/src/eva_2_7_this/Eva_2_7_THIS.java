package eva_2_7_this;

public class Eva_2_7_THIS {

    public static void main(String[] args) {

        //print(); No se puede usar en un contexto estatico
    }
    
    public void print(){
        
    }

}
//This es una referencia a una instancia de la clase
//This solo existe internamente dentro de las clases 
class Persona {

    private String name;

    public Persona(String name) {
        this.name = name;
        //this.name es el atributo de la clase 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void printData() {
        System.out.println("El nombre es: " + this.name);

    }
}
