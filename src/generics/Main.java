/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author Mitch
 */
class Room<T> {
 
	private T t;
 
	public void add(T t) {
		this.t = t;
	}
 
	public T get() {
		return t;
	}
}
 
public class Main {
	public static void main(String[] args) {
                             //       Room<Integer> room = new Room<Integer>();
		Room<String> room = new Room<String>();
		room.add("60");
 
	//	Integer i = room.get();
		System.out.println(room.get());
	}
}
