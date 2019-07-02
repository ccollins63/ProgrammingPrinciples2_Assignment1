//Cameron Collins

public class Rectangle
{
    //data fields
    private double width  = 1.0;
    private double height = 1.0;

    //no arg constructor
    public Rectangle()
    {
    }

    //constructor
    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    //getters and setters
    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    //area method
    public double getArea()
    {
        double area = (width * height);
        return area;
    }

    //method perimeter
    public double getPerimeter()
    {
        double perimeter = (2 * width) + (2 * height);
        return perimeter;
    }
}
