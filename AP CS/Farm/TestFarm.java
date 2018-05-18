
/**
 * Write a description of class TestFarm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestFarm
{
    public static void main(String[] args)
    {
        Farmer farmer = new Farmer();
        System.out.println("\n(interact function will execute below with Tool objects)");
        System.out.println("\nTOOL Basket:");
        farmer.interact(Tool.BASKET);
        System.out.println();
        System.out.println("\nTOOL Pail:");
        farmer.interact(Tool.PAIL);
        System.out.println("\n\n(Overloaded interact function will execute below with Misc objects)");
        System.out.println("\nMISC Key:");
        farmer.interact(Misc.KEY);
        System.out.println();
        System.out.println("\nMISC Remote:");
        farmer.interact(Misc.REMOTE);
        System.out.println("\n\n(Aggregation shown below with Location object. Farmer and Barns will be printed to show their location object)");
        System.out.println(farmer);
        
        //These barns seperate from which the farmer interacts with
        Barn barn1 = new Barn();
        System.out.println(barn1);
        Barn barn2 = new Barn(new Location("West", "Elmo Street"));
        System.out.println(barn2);
    }
}
