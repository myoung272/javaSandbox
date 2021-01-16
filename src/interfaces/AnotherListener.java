

package interfaces;


public class AnotherListener {
    
    InterfaceReference interfaceReference;
    
    AnotherListener(InterfaceReference listener) {
        this.interfaceReference = listener;
        
       listener.interfaceRef("from AnotherListener class");
         
    }

}
