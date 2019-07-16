class Rectangle
{
	private int width, height;
	Rectangle(int width, int height)
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

public class RectangleApp
{
	public static void main(String[] args) {
		
	}
}


