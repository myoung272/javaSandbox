package interfaces;

public class ActionClass implements InterfaceReference {
    
    public static void main(String[] args) {
      new ActionClass();
    }

    private InterfaceReference listener;

    public ActionClass() {
 
        listener = this; 
      
         // DropdownClass takes interfaceReference as a param
      DropdownClass ddc = new DropdownClass(this.listener);
      //   DropdownClass ddc = new DropdownClass();
         AnotherListener al = new AnotherListener(this.listener);
    }

    

    @Override
    public void interfaceRef(String s) {
        System.out.println(s);
    }

}
