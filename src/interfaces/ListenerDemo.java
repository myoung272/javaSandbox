
package interfaces;


public class ListenerDemo {
    
     public static void main(String args[]) {
         
         // this class has a field of type OnCompleteListener
        LongRunningTask longRunningTask = new LongRunningTask();
         LongRunningTask longRunningTask2 = new LongRunningTask();
        
          // new keyword called on an interface of anonymous inner class
        longRunningTask.setOnCompleteListener(new OnCompleteListener() { 
            @Override
            public void onComplete() {
                System.out.println("Yeah, the long running anonymous inner class task has been completed!");
            }
        });
        
         // same as above anonymous inner class using lambda expression
         // works because OnCompleteListener is a functional interface
       longRunningTask2.setOnCompleteListener(() -> {
            System.out.println("Yo, the long running lambda task has been completed!");
        });  
        
        
        System.out.println("Starting the long running task.");
        longRunningTask.run();
        longRunningTask2.run();
        
    }
    
}
