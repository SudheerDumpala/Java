package sealedClass;

public class SealedClasses {
	/*
	 * Sealed classes restrict the number of classes that can inherit from them. We
	 * can use the "permits" keyword to specify which classes are allowed to inherit
	 * from the sealed class.
	 * 
	 * Any class that extends the sealed class must be declared as either "sealed",
	 * "non-sealed", or "final".
	 */

	/*
	 * This also applies to interfaces, but interfaces cannot be declared "final".
	 * An interface extending a sealed interface can be declared as either "sealed"
	 * or "non-sealed".
	 */
	static sealed class A permits B, C {
		public void show() {
			System.out.println("This is a sealed class");
		}
	}

	non-sealed class B extends A {

	}

	static sealed class C extends A permits D {

	}
	
	static final class D extends C {
		@Override
		public void show() {
			System.out.println("This is a final class D extending sealed class C");
		}
	}
	// Here we declared every class as static because they are inner classes.
	// in order to instantiate them, we either need to use the instance of the outer class
	// or declare inner classes as static.
	public static void main(String[] args) {
		D obj = new D();
		obj.show();
	}

}
