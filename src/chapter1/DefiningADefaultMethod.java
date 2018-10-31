package chapter1;

import chapter1.DefiningADefaultMethod.Drawable.Person;

public interface DefiningADefaultMethod {

	public static void main(String[] args) {
		Person person = new Person();
		person.draw();
		person.drawnInQuotes();
	}
	
	// Formas de declarar un methodo por default

	// La palabra clave defaul antes del tipo de dato
	public default void draw1() {
	}

	// la palabra default esta al principio
	default public void draw2() {
	}

	// la palabra default esta al principio
	// y
	// no se indica el tipo de metodo
	default void draw3() {
	}
	
//Declaracion de una interface
	interface Drawable {
		
		//Metodo por default
		default void draw() {
			System.out.println("The Drawable interface's draw method");
		}
		
		//Metodo por default
		default void drawnInQuotes() {
			System.out.println("\"The Drawable interface's drawInQuotes method\"");
		}

		public abstract boolean hasBeenDrawn();

		//
		class Person implements Drawable {
			public boolean hasBeenDrawn() {
				return true;
			}
		}

	}
}
