
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student extends Person
{
   public Student()
   {
       id = 12345;
   }
   public Student(final String name, final Address ad, final int newId)
   {
       super(name, ad);
       id = newId;
   }
   
   public void setId(int newId)
   {
       id = newId;
   }
   public final int getId()
   {
       return id;
   }
   
   public String toString()
   {
        return "\nStudent information " + 
                "\n  " + super.toString() +
                "\nStudent id: " + id;
   }
    
   private int id = -1;
}
