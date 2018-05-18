
/**
 * Write a description of class Farmer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Farmer
{
    Farmer()
    {
    }
    
    public void interact(Tool tool)
    {
        System.out.print("\nThe farmer gets his ");
        switch(tool)
        {
            case BASKET:
                System.out.println("basket. He needs to gather eggs from the chicken.");
                break;
            case PAIL: 
                System.out.println("pail. He needs to get milk from the cow.");
                break;
        }
        System.out.println("\n(Aggregation is shown as the Barn has an array of animals (they will do something soon)).");
        System.out.println("\nHe enters the barn.");
        enterBarn(tool);
    }
    private void enterBarn(Tool tool)
    {
        Barn barn = new Barn();
        System.out.println("\nAfter gathering what he needs,the farmer goes back home.");
        System.out.println("\nThe animal goes about its day.");
        System.out.println("\n(Animal's overriden act function will execute below)");
        barn.getAnimal(tool).act();
    }
    
    public void interact(Misc item)
    {
        System.out.print("\nThe farmer gets his ");
        switch(item)
        {
            case KEY:
                System.out.println("key. He goes out and drives his truck to get more supplies.");
                break;
            case REMOTE:
                 System.out.println("remote. He decides he needs a break. He sits down and watches TV.");
                break;
        }
    }
    
    public String toString()
    {
        return "\nThe farmer's home's location: " + home;
    }
    
    private final Location home = new Location("Northeast", "McClellan Street");
}
