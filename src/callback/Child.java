package callback;

public class Child  {
    
   // private ListenerCallBack listenerCallBack;   // does not need a field to hold it
    
   // private Parent parent;  // does not need a field to hold it
    
   public Child(ListenerCallBack listenerCallBack) {
 //       this.listenerCallBack = istenerCallBack;  // does not need a field to hold it
     // passing back a value as a callBack from some type of event
     // this may be a button click or change event
        listenerCallBack.callBackValue("from child"); 
 //   }
// can also pass the Parent class instead of the interface
//   public Child(Parent parent) {
  //  parent.callBackValue("From child via Parent");
}

}
