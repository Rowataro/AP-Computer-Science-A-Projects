
/**
 * Write a description of class Barn here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Barn
{
    public Barn()
    {
       loc = new Location("Southwest", "Ranch Street" );
    }
    public Barn(final Location newLoc)
    {
       loc = newLoc;
    }
    public final Animal getAnimal (Tool tool)
    {
        if(tool == Tool.BASKET)
        {
            return animalList[CHICKEN];
        }
        else
        {
            return animalList[COW];
        }
    }
    public String toString()
    {
        return "\nThe barn's location: " + loc;
    }
    //animals are hardcoded. Indexes correspond to each animal
    //no functionality exists yet to add any animals b/c they are hardcoded
    final private int CHICKEN = 0;
    final private int COW = 1;
    private Animal[] animalList = new Animal[] { new Chicken("Chuck", "golden"),
                                                 new Cow("Bessy", "black and white"),
                                                };
    private Location loc = null;
}

