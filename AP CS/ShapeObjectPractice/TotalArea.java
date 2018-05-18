
/**
 * Name: Jon Reyrao
 * Date: 11/8/17
 * Period: 8
 * Program Name: TotalArea
 * Program Description: Practice with obejcts and an array of objects
 */
public class TotalArea
{
    public static void main(String[] args)
    {
        Circle[] circleArray = createCircleArray();
        printCircleArray(circleArray);
    }
    
    public static Circle[] createCircleArray()
    {
        Circle[] circleArray = new Circle[5];
        
        for(int count = 0; count < circleArray.length; ++count)
        {
            circleArray[count] = new Circle(Math.random() * 100);
        }
        
        return circleArray;
    }
    
    public static void printCircleArray(Circle[] circleArray)
    {
        System.out.printf("%-30s%-15s\n", "Radius" , "Area");
        for(int count = 0; count < circleArray.length; ++count)
        {
            System.out.printf("%-30f%-15f\n", circleArray[count].getRadius(), circleArray[count].getArea()); 
        }
        
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-30s%-15f\n", "The total area of circles is " , sum(circleArray));
    }
    
    private static double sum(Circle[] circleArray)
    {
        double sum = 0;
        for(int count = 0; count < circleArray.length; ++count)
        {
            sum+=circleArray[count].getArea();
        }
        
        return sum;
    }
}


