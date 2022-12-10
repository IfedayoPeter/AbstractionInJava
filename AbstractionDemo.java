package abstraction;

public class AbstractionDemo {
	public static void main(String[] args) {

		GraphicObject circle = new circle();
		circle.draw();
		circle.resize();

		GraphicObject rectangle = new rectangle();
		rectangle.draw();
		rectangle.resize();

		circle clean = new circle();
		clean.clean();
	}

}
