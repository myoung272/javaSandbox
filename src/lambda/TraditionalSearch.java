/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;   

/**
 *
 * @author Mitch
 */
public class TraditionalSearch {
    
    public static void main(String[] args){
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true,false));
        animals.add(new Animal("roo", true, false,false));
        animals.add(new Animal("cat", false, false,false));
        animals.add(new Animal("dog", true, true, true));
        
    //    print(animals, new CheckIfHopper());
    System.out.println("animals that can swim");
    print(animals, a -> a.canSwim());
      System.out.println("animals that can hop");
    print(animals, a -> a.canHop());
    
    System.out.println("animals that can bark");
    print(animals, a -> a.canBark());
    
    }
    
    private static void print(List<Animal> animals, Predicate<Animal> checker){
        for (Animal animal : animals){
            if ( checker.test(animal))
                System.out.println(animal);
        }
    }
    
}
