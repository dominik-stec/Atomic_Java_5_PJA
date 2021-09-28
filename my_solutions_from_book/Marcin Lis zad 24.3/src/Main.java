
public class Main {
	
	public void drawShape (Shape shape) {
		shape.draw();
	}
		
	public static void main(String[] args) {
		Main main = new Main();
		
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		Rectangle rectangle = new Rectangle();
		
		main.drawShape(circle);
		main.drawShape(triangle);
		main.drawShape(rectangle);
		
	}

}
