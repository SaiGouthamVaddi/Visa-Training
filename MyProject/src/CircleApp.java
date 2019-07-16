class Circle
{
	private int radius;
	Circle(int radius)
	{
		this.radius = radius;
	}
	
	public String getShapeName()
	{
		return "Circle";
	}
	
	public double computeArea()
	{
		return 3.14*radius*radius;
	}
}

public class CircleApp {
	public static void main(String[] args) {
		Circle c = new Circle(3);
		System.out.println(c.getShapeName());
		System.out.println(c.computeArea());
	}
}
