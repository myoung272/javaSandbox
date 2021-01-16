

package stringfunctions;


public class CheckStringForNum {
    
    public static boolean isNumeric(String str) {
  return str.matches("\\d+?");  
}
    
    public static void main(String[] args) {
        String num = "0020";
        System.out.println("Is number? " +isNumeric(num));
        
    }

}
