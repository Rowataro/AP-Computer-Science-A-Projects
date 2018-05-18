
/**
 * Name: Jon Reyrao
 * Date: 11/8/17
 * Period: 8
 * Program Name: TestShape
 * Program Description: Practice with objects
 */
import java.util.Scanner;

public class TestShape
{
  public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      
      Circle myCircle1 = new Circle();
      System.out.println(myCircle1.getNumberOfObjects());
      Circle myCircle2 = new Circle(5);
      /*System.out.println("Enter a new circle:");
      Circle userCircle = new Circle(input.nextInt());
   
      
      double x = myCircle1.getArea();
      double y = myCircle1.getCircumference();
      
      System.out.println("The area of myCircle1 is: " + x);
      System.out.println("The area of myCircle2 is: " + myCircle2.getArea());
      System.out.println("The area of userCircle is: " + userCircle.getArea());
      System.out.println("The circumference of myCircle1 is: " + y);
      System.out.println("The circumference of myCircle2 is: " + myCircle2.getCircumference());
      System.out.println("The circumference of userCircle is: " + userCircle.getCircumference());
      
      myCircle1.setRadius(myCircle2.getRadius()+userCircle.getRadius());
      System.out.println("The area of myCircle1 is: " + myCircle1.getArea());
  
       System.out.println("The circumference of myCircle1 is: " + myCircle1.getCircumference());
       */
      
      System.out.println(myCircle1.getNumberOfObjects());
      System.out.println(myCircle2.getNumberOfObjects());
      
      Circle myCircle3 = new Circle();
      
       System.out.println(myCircle1.getNumberOfObjects());
      
      
      System.out.println(myCircle1);
  }
}
