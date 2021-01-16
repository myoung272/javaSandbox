

package generics.ocp;

import java.util.ArrayList;
import java.util.List;


public class OcpPage105 {
    
    public static void main(String[] args) {
    
    List<String> list = new ArrayList<>();
    list.add("Fluffy");  // 0
    list.add("Webby"); //1
    
    String[] array  = new String[list.size()];
    
    array[0] = list.get(1);
    System.out.println("array[0] is: "+array[0]);
    array[1] = list.get(0);
    System.out.println("array[1] is: "+array[1]);
    System.out.println("list.get(0) is: "+list.get(0));
    System.out.println("list.get(1) is: "+list.get(1));
    for ( int i = 0; i < array.length; i++) {
        System.out.print( array[i] + "-");
    
    }
    
    }
   

}
