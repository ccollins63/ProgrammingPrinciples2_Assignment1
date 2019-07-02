//Cameron Collins

import java.util.Scanner;

public class TestTriangle
{
    public static void main (String args[])
    {
      Scanner scan = new Scanner(System.in); //Scanner object

      System.out.println("Enter three side lengths of the triangle:");
      Triangle triangle = new Triangle(scan.nextDouble(), scan.nextDouble(), scan.nextDouble()); //new triangle object

      System.out.println("Enter color of the triangle:");
      triangle.setColor(scan.next());

      System.out.println("Triangle is filled.");
      triangle.setFilled(scan.nextBoolean());

      //tests methods of object
      System.out.println(triangle.toString());
      System.out.println("Area:\t\t" + triangle.getArea());
      System.out.println("Perimeter:\t" + triangle.getPerimeter());
      System.out.println("Color:\t\t" + triangle.getColor());
      System.out.println("Filled:\t\t" + triangle.isFilled());
    }
}
