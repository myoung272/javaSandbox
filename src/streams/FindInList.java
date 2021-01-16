package streams;

import java.util.ArrayList;
import java.util.List;

public class FindInList {

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        List<Integer> pl = new ArrayList<>();
        
        al.add(123);
        al.add(234);
        al.add(345);
        al.add(333);
        al.add(22);
        System.out.println("al is: "+al.toString());
        
        pl.add(22);
        pl.add(23);
        pl.add(24);
        pl.add(12345);
        System.out.println("pl is: "+pl.toString());
   
     // add if not in pl list
        for(Integer ali : al) {
            if( ! pl.contains(ali)) {
                pl.add(ali);
                System.out.println(ali+ " Added to pl list");
            }
        }
        System.out.println("pl afetr adding al is: "+pl);
      
        // remove if in  pl list 
        for(int i = 0; i < pl.size() ; i++) {
            int folderId = pl.get(i);
            if(  al.contains(folderId)) {
                pl.remove(i);
                // if pl.remove is invoked the size of the list changes and throws off the counter
                // so decrement the counter size if the list size changes because of remove
                i = i -1;
             //  System.out.println(pl.get(i)+ " removed from pl list");
            }
        }
        System.out.println("pl after remove al is: "+pl);
        
        
    }
}
