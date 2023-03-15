/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_2_10_override;

/**
 *
 * @author invitado
 */
public class Eva_2_10_Override {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person person = new Person();

    }

    class Person {

        private String name;
        private int age;

        public Person() {
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

        @Override
        public String toString() {
            //No estamos invocando al metodo sobreescrito de la super clase
            //Aqui lo estamos reemplazando totalmente a toString de la superclase
            String cade = "Datos: \n" + "Nombre" + name + "\n" + "Edad: " + age;

            return cade;

        }

    }

}
