
package interfaces;


public class LongRunningTask implements Runnable{
    
    // Interface
    private OnCompleteListener onCompleteListener;
     
    // assign OnCompleteListener to this class with below method
    public void setOnCompleteListener(OnCompleteListener onCompleteListener) {
        this.onCompleteListener = onCompleteListener;
    }
     
    @Override
    public void run() {
        try {
            Thread.sleep(2*1000); // sleep for 5 seconds and pretend to be working
            onCompleteListener.onComplete();
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
    
}
