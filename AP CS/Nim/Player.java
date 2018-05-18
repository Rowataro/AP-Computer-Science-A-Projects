
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player
{
    private String name = "";
    
    Player(String newName)
    {
        name = newName;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int computerPlaysE(Pile pile)
    {
       int total = 1 + (int) (Math.random() * (pile.getMarbles() / 2));
       return total;
    }
    
    public int computerPlaysH (Pile pile)
    {
        int[] powers = {1, 3, 7, 15, 31};
        boolean found = false;
        int total2 = 0;
        
        for (int i = powers.length; i >= 0; i--)
        {
            if (powers[i] == pile.getMarbles())
            {
                found = true;
            }
        }
        
        if (found)
        {
            total2 = 1 + (int) (Math.random() * (pile.getMarbles() / 2));
        }
        
        else
        {
            for (int i = powers.length; i >= 0; i--)
            {
                if (powers[i] <= pile.getMarbles() / 2)
                {
                    total2 = powers[i];
                    break;
                }
            }
        }
        
        
        return total2;
    }
   
}
