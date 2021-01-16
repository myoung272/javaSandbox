package interfaces;

public class DropdownClass {

    InterfaceReference interfaceReference;
    
    DropdownClass() { }

    DropdownClass(InterfaceReference listener) {
        this.interfaceReference = listener;
        
       listener.interfaceRef("from DropdownClass");
         
    }
}
