/**
 * Name: Jon Reyrao
 * Date: 11/8/17
 * Periiod: 8
 * Program Name: StopWatch
 * Program Description: Class with stopwatch capabilities. 
 */
import java.util.Date;

public class StopWatch
{
    //time in milliseconds
    private long startTime;
    private long endTime;
    
    //stop watch has to create a new date to get a new time
    StopWatch()
    {
        Date date = new Date();
        startTime = date.getTime();
    }
    
    public void start()
    {
        Date date = new Date();
        startTime = date.getTime();
    }
    
    public void stop()
    {
        Date date = new Date();
        endTime = date.getTime();
    }
    
    public long getElapsedTime()
    {
        return endTime - startTime;
    }
}
