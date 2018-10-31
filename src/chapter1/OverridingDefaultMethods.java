package chapter1;

public interface OverridingDefaultMethods {

	public static void main (String [] args) {
		Person person= new Person();
		person.draw();
	}
	//Declaracion de una interface
	interface Drawable{
		//Declaracion de un methodo por default
		public default void draw() {
			System.out.println("The drawable interface's draw method");
		}
	}
	
	class Person implements Drawable{
		@Override
		public void draw() {
			System.out.println("The Person's draw method");
//Para implementar el contenido del metoo por default desde  la clase colocamos
			//NOMBRE DE LA INTERFACE.LA PALABRA SUPER.NOMBRE DEL METODO
			Drawable.super.draw();
		}
	}
}
