//Cameron Collins

public class Triangle extends SimpleGeometricObject
{
    //data fields
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    //no arg constructor
    public Triangle()
    {
    }

    //constructor
    public Triangle(double side1, double side2, double side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //getters and setters
    public double getSide1()
    {
        return side1;
    }

    public void setSide1(double side1)
    {
        this.side1 = side1;
    }

    public double getSide2()
    {
        return side2;
    }

    public void setSide2(double side2)
    {
        this.side2 = side2;
    }

    public double getSide3()
    {
        return side3;
    }

    public void setSide3(double side3)
    {
        this.side3 = side3;
    }

    //method for area
    public double getArea()
    {
        double semiperimeter = (side1 + side2 + side3) / 2.0;
        double area          = Math.round(Math.sqrt((semiperimeter - side1) * (semiperimeter - side2) * (semiperimeter - side3)) * 100.0) / 100.0;
        return area;
    }

    //method for perimeter
    public double getPerimeter()
    {
        double perimeter = (side1 + side2 + side3);
        return perimeter;
    }

    public String toString()
    {
        return "Triangle: side1 = " + side1 + " side 2 = " + side2 + " side 3 = " + side3;
    }
}
