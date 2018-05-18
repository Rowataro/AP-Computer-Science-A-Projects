
/**
 * Write a description of class Faculty here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Faculty extends Person
{
    public Faculty()
    {
        salary = 1;
    }
    public Faculty(final String name, final Address ad, final int newSalary)
    {
        super(name, ad);
        salary = newSalary;
    }
    
    public void setSalary(final int newSalary)
    {
        salary = newSalary;
    }
    public final int getSalary()
    {
        return salary;
    }
    
    public String toString()
    {
        return "\nFaculty information " + 
                "\n  " + super.toString() +
                "\nSalary: " + salary;
    }
    
    private int salary = -1;
}
