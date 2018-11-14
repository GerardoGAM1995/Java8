package chapter1;

public interface WorkingWithDiamondInheritance {

	public static void main(String[] Args) {
		Busy busy = new Busy();
		busy.draw();
	}

	// Primera interface
	public interface Drawable {
		default void draw() {
			System.out.println("The Drawable interface's draw method");
		}
	}

	// Segunda interface
	public interface Displayable extends Drawable {
		@Override
		default void draw() {
			System.out.println("The displayable interface's draw method");
		}
	}

	// tercera Interface
	public interface Colorable extends Drawable {
		public default void draw() {
			System.out.println("The Colorable interface's draw mehtod");
		}
	}

	// Cuarta interface
	public interface MoreDisplayable extends Displayable, Colorable {
		@Override
		default void draw() {
			System.out.println("The More Displayable interface's draw method");
		}
	}

	public class Busy implements Displayable, Colorable {
		@Override
		public void draw() {
			Displayable.super.draw();
			Colorable.super.draw();
		}
	}

}
