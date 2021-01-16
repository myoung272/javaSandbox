

package hashcode;

import java.util.Objects;


public class Employee {
    
     public int id;
    
    public String name;

/*   @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.id;
           System.out.println(hash);
        hash = 83 * hash + Objects.hashCode(this.name);
        System.out.println(hash);
        return hash;
    }
*/

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

  
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public static void main(String[] args) {
        
        Employee emp1 = new Employee(1, "dog");
        
       Employee emp2 = new Employee(1, "dog");
       
       System.out.println("emp1 hash code "+emp1.hashCode());
       System.out.println("emp2 hash code "+emp2.hashCode());
        
      //   Employee emp2 = emp1;
        
        if(emp1.equals(emp2)) {
            System.out.println("they are equal");
        } else {
            System.out.println("they are not equal");
        }
    
   
    }
    
}
    


