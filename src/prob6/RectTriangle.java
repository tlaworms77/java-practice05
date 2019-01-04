package prob6;

public class RectTriangle extends Shape {
	private double width;
	private double height;

	public RectTriangle(double w, double h) {
		// TODO Auto-generated constructor stub
		width = w;
		height = h;
	}

	@Override
	protected double getArea() {
		// TODO Auto-generated method stub
		return width * height/2;
	}

	@Override
	protected double getPerimeter() {
		// TODO Auto-generated method stub
		double perimeter = Math.sqrt((Math.pow(width,2)+Math.pow(height,2))) + width + height;
		return perimeter;
	}

}
