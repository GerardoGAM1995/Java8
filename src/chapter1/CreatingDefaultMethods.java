package chapter1;

public interface CreatingDefaultMethods {
	//
	public static void main (String[]args) {
		Person person = new Person();
		person.draw();
	}
//
	interface Drawable{
	 public default void draw() {
		 System.out.println("The Drawable interface's draw method");
	 }
	 public abstract boolean hasBeenDrawn();
 }

class Person implements Drawable{
	public boolean hasBeenDrawn() {
		return true;
	}
}
}
