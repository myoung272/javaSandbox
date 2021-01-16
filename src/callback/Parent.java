package callback;

public class Parent implements ListenerCallBack {
    
    ListenerCallBack lcb;       
    
public  Parent() {
       // MY Note passing ListenerCallBack does not work, need to pass this way
  lcb = this;
   // Child child = new Child(lcb); 
    // or can just pass a ref to the class
    Child child = new Child(lcb); 
   }
    
     @Override  // callback
    public void callBackValue( String value )   {
       System.out.println( "Value is: "+value) ;
    }
    
    public static void main(String[] args) {
        Parent p = new Parent();
        
    }
}
