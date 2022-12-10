package abstraction;

public abstract class GraphicObject {
//an abstract cannot be instantiated	
	int x, y;

	GraphicObject() {
		System.out.println("Base abstract class");
	}

//	 abstract class can also have concrete methods with implementations
	void cal(int x, int y) {
		System.out.println("x square= " + x * y);
	}

//	 abstract methods can only be instantiated in a child class
//	 the explanations of the abstract methods are provided but not the implementation
	abstract void draw();

	abstract void resize();

}
