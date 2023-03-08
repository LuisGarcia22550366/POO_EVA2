/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_2_3_extends;

/**
 *
 * @author invitado
 */
public class Eva_2_3_Extends {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Student student = new Student();
        
        student.setAge(12);
        student.setName("Luis");
        student.setLastNAme("Garcia");
        student.setnControl("22550366");
        
        Proveedores prov =  new Proveedores();
        prov.setRfc("35823r293uhr29");
        prov.setName("Juan");
        prov.setLastNAme("Perez");
        prov.setAge(45);
        
        System.out.println("Imprimir datos");
        System.out.println("Nombre: " + prov.getName());
        System.out.println("Apellido: " + prov.getLastNAme());
        System.out.println("Edad: " + prov.getAge() + "años");
        
        System.out.println("RFC: " + prov.getRfc());
        
      
        
        
        
    }
    
}
