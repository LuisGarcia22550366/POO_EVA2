

package eva_2_24_collections;

import java.util.ArrayList;

public class Eva_2_24_Collections {

    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList array= new ArrayList();
        array.add(new Person());
        array.add(new Dog());
        array.add(new Auto());
        
        ArrayList <Integer> array2 = new ArrayLIst<Integer>();
        array2.add(1000);
        array2.add(2000);
        array2.add(3000);
        array2.add(4000);
        array2.add(100);
        System.out.println(array2);
        
    }
    
}

class Person{
    
}
class Auto{
    
}
class Dog{
    
}
