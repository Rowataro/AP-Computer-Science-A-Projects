
/**
 * Write a description of class Kennel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kennel
{
    Kennel(Pet[] list)
    {
        for(int index = 0; index < petList.length; ++index)
        {
            petList[index] = list[index];
        }
    }
    
    public void allSpeak()
    {
        for(Pet pet: petList)
        {
            System.out.println
            (
                "\nName: " + pet.getName() + " says " + pet.speak()
            );
        }
    }
    
    private Pet[] petList = new Pet[3];
}
