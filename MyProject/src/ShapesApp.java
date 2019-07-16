class Circle1
{
	private int radius;
	Circle1(int radius)
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

class Rectangle1
{
	private int width, height;
	Rectangle1(int width, int height)
	{
		this.width = width;
		this.height = height;
				
	}
	public String getShapeName()
	{
		return "Rectangle";
	}
	
	public double computeArea()
	{
		return width*height;
	}
}
public class ShapesApp {
	Object[] shapes = new Object[10];
	static int count = -1;
	ShapesApp()
	{
		count++;
		
	}
	
	public void insertObject(Object o)
	{
		shapes[count] = o;
	}
	public static void displayShape(Object o)
	{
		if(o instanceof Circle1)
		{
			System.out.println("Circle");
		}
		if(o instanceof Rectangle1)
		{
			System.out.println("Circle");
		}
	}
	
	public static void main(String[] args) {
		Circle1 c = new Circle1(5);
		Rectangle1 r = new Rectangle1(5,10);
		ShapesApp.displayShape(c);
		
		ShapesApp sa = new ShapesApp();
		sa.insertObject(c);
		System.out.println(sa.shapes.length);
		
		
	}
}