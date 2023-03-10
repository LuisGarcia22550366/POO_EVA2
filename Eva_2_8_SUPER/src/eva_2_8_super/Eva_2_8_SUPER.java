/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_2_8_super;

/**
 *
 * @author invitado
 */
public class Eva_2_8_SUPER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal ani = new Animal("Gato", 12);
        Mamifero mam = new Mamifero("negro", "Gato", 12);
        Canes can = new Canes();
        

    }

}

class Animal {

    private String name;
    private int peso;

    public Animal() {

        System.out.println("Está vivooooooooooooooooooooooooooooo!!");
    }

    public Animal(String name, int peso) {
        this.name = name;
        this.peso = peso;
        System.out.println("Está vivooooooooooooooooooooooooooooo constructor 2!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void Respirar() {
        System.out.println("Está respirando!!!!!!!!");
    }

}

class Mamifero extends Animal {
    private String colorPelo;
    
    public Mamifero() {
        //Lo primero a llamar al constructor es llamar al constructor de la superclase
        super();//Llamada al constructor default
        System.out.println("Mamiferoooooooooooo!!!!!!!!!! ");
    }

    

    public Mamifero(String colorPelo, String name, int peso) {
        super(name, peso);//Llamada al constructor de la super clase
        this.colorPelo = colorPelo;
         System.out.println("Mamiferoooooooooooo constructor 2!!!!!!!!!! ");
    }
    
    

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }
    
    
}

class Canes extends Mamifero{

    public Canes() {
        super();
        System.out.println("Soy un can!!!!!!!!!!");
    }
    
}
