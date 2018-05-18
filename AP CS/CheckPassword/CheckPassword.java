
/**
 * Name: Jon Reyrao
 * Date: 9/22/17
 * Period: 8
 * Program Name: CheckPassword
 * Program Description: Checks whether the user inputs a valid password, according to certain rules listed below
 */
import java.util.Scanner;

public class CheckPassword
{
    public static void main(String args[])
    {
       String userPass = enterUserPassword();
       
       checkUserPassword(userPass);
    }
    
    public static String enterUserPassword()
    {
        System.out.println
        (
        "\nHere are the rules for valid passwords:\n " +
        "\n1. A password must have at least eight characters." + 
        "\n2. A password consists of only letters and digits." +
        "\n3. A password must contain at least two digits."
        );
        
        Scanner input = new Scanner(System.in);
        String userPass = "";
        
        do
        {
            System.out.print("\nEnter your password: ");
            userPass = input.nextLine();
            
            if(userPass.isEmpty())
            {
                System.out.println("\nPassword cannot be empty.");
            }
        }while(userPass.isEmpty());
        
        return userPass;
    }
    
    public static void checkUserPassword(String userPass)
    {
        //for accessing array of error messages
        final int RULE1 = 0;
        final int RULE2 = 1;
        final int RULE3 = 2;
        final int totalRules = 3;
        
        String[] error = 
        {
          "1. The password did not have at least eight characters.",
          "2. The password did not consist of only letters and digits.\n   (Spaces are invalid characters)",
          "3. The password did not contain at least two digits."
        };
        
        //for determining what error message gets displayed, depending on what rule is false.
        boolean[] ruleState = 
        {
            true, true, true
        };
        
        boolean validPass = true;
        
        int digitCount = 0;
        
        for(int count = 0; count < userPass.length(); ++count)
        {
            char ch = userPass.charAt(count);
            
            if (Character.isDigit(ch))
            {
                ++digitCount;
            }
            
            //executes only if the character is not a digit and is not a letter
            else if (!Character.isLetter(ch))
            {
                ruleState[RULE2] = false;
            }
        }
        
        if(userPass.length() < 8)
        {
            ruleState[RULE1] = false;
            validPass = false;
        }
        
        if(!ruleState[RULE2])
        {
            validPass = false;
        }
        
        if(digitCount < 2)
        {
            ruleState[RULE3] = false;
            validPass = false;
        }
        
        if(validPass)
        {
            System.out.println("\nValid password.");
        }
        
        else
        {
            System.out.println("\nInvalid password. \n\nRules violated:\n ");
            
            for(int rule = 0; rule < totalRules; ++rule)
            {
                if(!ruleState[rule])
                {
                    System.out.println(error[rule] + '\n');
                }
            }
        }
        
    }
}
