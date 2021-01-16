
package interfaces;
// a funtional interface can only have one (abstract) method
// it can then be used as a lambda expression
@FunctionalInterface 
 interface OnCompleteListener {
    public void onComplete();
}
