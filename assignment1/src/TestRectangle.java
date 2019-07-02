//Cameron Collins

public class TestRectangle
{
    public static void main(String args[])
    {
        //rectangle objects
        Rectangle rectangle1 = new Rectangle(4,30);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        //tests the methods of both objects
        System.out.println("Rectangle with width " + rectangle1.getWidth() + " and height " + rectangle1.getHeight() + " has an area of " + Math.round(rectangle1.getArea() * 100.0) / 100.0 + " and a perimeter of " + rectangle1.getPerimeter() + ".");
        System.out.println("Rectangle with width " + rectangle2.getWidth() + " and height " + rectangle2.getHeight() + " has an area of " + Math.round(rectangle2.getArea() * 100.0) / 100.0 + " and a perimeter of " + rectangle2.getPerimeter() + ".");
    }
}
