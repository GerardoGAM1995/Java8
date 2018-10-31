package chapter1;

public interface WorkingWihtSingleInheritance {
/*En este ejemplo muestra que una interface puede precentar herencia con otra interface
y a su vez esta puede ser implementada por una clase 
*/
	
	public static void main (String[]args) {
		Person person = new Person();
		person.draw();
	}
	
	//Creacion de una interfaz
	interface Drawable{
		//creacion de un metodo por default
		public default void draw() {
			System.out.println("The drawable interface's draw method");
		}
	}
	
	//Creacion de una interfaz con herencia simple
	//la cual hereda los atributos de la interfaz DRAWABLE
	interface Displayable extends Drawable{
	//Creacion de metodo por default 
		public default void draw(){
			System.out.println("The Displayable interface's draw method");
		}
	}
	
	//creacion de una interface cn herencia simple
	//Obteniendo los metodos y atributos de la nterfaz Drawable
	interface MoreDisplayable extends Displayable{
		//creacion de un metodo abstracto el cual indica que se sobre escribe un metodo
		@Override
		public abstract void draw();
	}
	
	//Creacion de la clase person
	//La cual implementa  la interface DISPLAYABLE
	public class Person implements Displayable{
		
	}
}
