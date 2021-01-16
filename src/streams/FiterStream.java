

package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


// https://www.mkyong.com/java8/java-8-streams-filter-examples/

public class FiterStream {
    
     public static void main(String args[]) {
         
         List<Person> persons = Arrays.asList(
                new Person("mkyong", 30, "m"),
                new Person("jack", 20, "m"),
                new Person("lawrence", 40, "m"),
                new Person("jack", 17, "f")
        );
         
         Person result2 = persons.stream()
                .filter(x -> "ahmook".equals(x.getName()))
                .findAny()
                .orElse(null);
         
         Person result1 = persons.stream()                        // Convert to steam
                .filter(x -> "jack".equals(x.getName()))        // we want "jack" only
                .findAny()                                      // If 'findAny' then return found
                .orElse(null);                                  // If not found, return null

        System.out.println("result1 "+result1);
        
        

        System.out.println("result2 "+result2);
        
        List<String> collect = persons.stream()
                .map(Person::getName)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
        
      //  persons.forEach(p -> p.setName("Doe"));
        
     //   System.out.println(persons);
        
        Stream<Person> personsOver18 = persons.stream().filter(p -> p.getAge() >= 30);
        
        personsOver18.forEach(System.out::println); // double colin is a method reference
        
       
        
      
     }

}
