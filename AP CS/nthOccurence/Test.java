
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
        Phrase phrase = new Phrase("A cat ate late.");
        assert phrase.findLastOccurence("at") == 11 : "at did not work";
        assert phrase.findLastOccurence("cat") == 2 : "cat did not work";
        assert phrase.findLastOccurence("bat") == -1 : "bat did not work";
        System.out.println("Success!");
    }
}
