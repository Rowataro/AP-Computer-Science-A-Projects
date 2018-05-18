
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
        Dog dog = new Dog("Max");
        Cat cat = new Cat("Marcy");
        LoudDog lDog = new LoudDog("Gabriel");
        Pet[] petList = new Pet[]{dog, cat, lDog};
        Kennel kennel = new Kennel(petList);
        kennel.allSpeak();
    }
}
