/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasandbox;

/**
 *
 * @author Mitch
 */
public class JavaSandbox implements TestInterface{

  public void go() {
       System.out.println("Hello from go() JavaSandbox");
       doda();
   }
  
  public void doda(){
       System.out.println("Hello from doda() JavaSandbox");
  }
  
  
  
    public static void main(String[] args) {
        
        JavaSandbox jsb = new JavaSandbox();
     
      jsb.go();
    }
    
}
