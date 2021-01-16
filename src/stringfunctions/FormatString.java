/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringfunctions;

/**
 *
 * @author Mitch
 */
public class FormatString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String stf = "Document Identified As Requirements Package Assistant Document Updated. RPA Document Status set to Needs Review";
        FormatString fs = new FormatString();
        
      System.out.println( fs.formatTheStringBreak(stf, 3, true)); 
    }
    
    public static String formatTheStringBreak(String inString, int breakSpot, boolean breakAtBlank) {
            
        //    char blank = ' ';
            String blank = " ";  // can be a String or a 
            String bR = "<br>";
            
            StringBuilder sB = new StringBuilder();
            
            if (inString.length() > breakSpot) {
                
                sB.append(inString.substring(0, breakSpot));
                if (breakAtBlank) {
                   // int indexOf(String str, int fromIndex): Returns the index of string str, starting from the specified index “fromIndex”.
                    int insertBrAt = inString.indexOf(blank, breakSpot); // breakSpot is the index starting point to find blank, which can be a String or char
                    if (insertBrAt >= 0) { // -1 returned if not found
                        sB.append(inString.substring(breakSpot, insertBrAt));
                        sB.append(bR);
                        sB.append(inString.substring(insertBrAt, inString.length()));
                    } else { // if no blank found after the desired break return whole string
                        return inString;
                    }
                } else { // just break even if no blanks (for file name)
                sB.append(bR);
                sB.append(inString.substring(breakSpot, inString.length()));
                }
            return sB.toString();
            } else {
                return inString;
            }
    }
}
    

