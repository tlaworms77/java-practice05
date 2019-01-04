package prob6;

public class Rectangle extends Shape implements Resizable{
	private double width;
	private double height;
	
	public Rectangle(double w, double h) {
		// TODO Auto-generated constructor stub
		width = w;
		height = h;
	}

	@Override
	protected double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}

	@Override
	protected double getPerimeter() {
		// TODO Auto-generated method stub
		return (width+height)*2;
	}

	@Override
	public void resize(double s) {
		// TODO Auto-generated method stub
		width = width * s;
		height = height * s;
	}

}
