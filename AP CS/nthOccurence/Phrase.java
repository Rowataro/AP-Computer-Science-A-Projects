
/**
 * Write a description of class Phrase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Phrase
{
    private String currentPhrase;
    public Phrase(String p)
    {
        currentPhrase = p;
    }
    public int findLastOccurence(String str)
    {
        int index = currentPhrase.indexOf(str);
        while(index != -1)
        {
            index = currentPhrase.substring(index + 1).indexOf(str);
        }
        return index;
    }
}
