public class Rectangle {
	int width;
	int height;
	
	public Rectangle (int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public double area() {
		return Math.pow(width, 2);
	}

}
