
/**
 * Write a description of class StringManipulator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
/*
 * String manipulator used for specific needs for libraryBook title and author 
 * strings
 */
public class StringManipulator
{
    /*
     * precondition: 
     *  None
     * postcondition: 
     *  If string contains word up to a certain index,
     *  then removeWordUpTo removes that word.
     *
     *Examples:
     * Use Case 1:
     *  precondition:
     *      unwantedWord = "The ";
     *      int endIndex = 3;
     *      title = "The Things They Carried";
     *  postcondition:
     *      returns "Things They Carried";
     * Use Case 2:
     *  precondition:
     *      unwantedWord = "The ";
     *      int endIndex = 3;
     *      title = "Where The Red Fern Grows"
     *  postcondition:
     *      returns same title
     *          ("The " is not within the range of endIndex)
     */
    public static String removeWordUpTo(final String unwantedWord, int endIndex, final String title)
    {
        if
        (
            title.indexOf(unwantedWord) <= endIndex && 
            title.contains(unwantedWord)
        )
        {
            return title.replace(unwantedWord, "");
        }
        else
        {
            return title;
        }
    }
    
    /*
     * precondition: 
     *  none
     * postcondition: 
     *  returns the very last word of the string. The last word is defined as
     *  the one after the last space.
     *Examples:
     *  Use Case 1:
     * precondition:
     *  word = "Tim O'Brien"
     * postcondition:
     *  returns "O'Brien"
     */
    public static String getLastWordOnly(final String word)
    {
        int firstIndexOfLastWord = getFirstIndexOfSpaceEndingFrom(word.length() - 1, word) + 1;
        
        if(firstIndexOfLastWord != -1)
        {
            return word.substring(firstIndexOfLastWord, word.length());
        }
        else
        {
            return word;
        }
    }
    private static int getFirstIndexOfSpaceEndingFrom(int endIndex, final String word)
    {
        assert endIndex >= 0 && endIndex <= word.length() -1 : "Index outside of string";
        char space = ' ';
        for(int index = endIndex; index >= 0; --index)
        {
            if(word.charAt(index) == space)
            {
                return index;
            }
        }
        return -1;
    }
}
