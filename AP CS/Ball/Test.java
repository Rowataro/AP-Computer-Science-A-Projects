
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
  public static void main(String[] args)
  {
      Ball[] ball = new Ball[] { new Soccer(), new Volleyball(), new Athlete()};
      System.out.println("\nhit() called first. kick() called second.");
      
      for(int index = 0; index < ball.length; ++index)
      {
          test(ball[index]);
      }
  }
  private static void test(final Ball ball)
  {
      ball.hit();
      ball.kick();
  }
}
