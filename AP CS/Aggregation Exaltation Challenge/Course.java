/**
 * Name: Jon Reyrao
 * Date: 11/28/17
 * Period: 8
 * Program Name: Aggregation Exaltation Challenge
 * Program Description: Classes follow the aggregation relationship, where a course has students
 * and faculty
 */
public class Course
{
   public Course()
   {
       name = "Default Course";
       f = new Faculty();
       count = minStudents;
       //for loop makes sure that all objects in the array are initialized
       for(int index = 0; index < count; ++index)
       {
           s[index] = new Student();
       }
   }
   
   public Course(final String newName, final Faculty newF, final int newCount)
   {
       name = newName;
       f = newF;
       count = newCount;
       for(int index = 0; index < newCount; ++index)
       {
           s[index] = new Student();
       }
   }
 
   public String toString()
   {
       return "\nCourse Information: " +
              "\n  Name: " + name +
              "\n" + f +
              "\n\n  Count(students enrolled): " + count;
   }
   
   public final String getName()
   {
       return name;
   }
   public void setName(final String newName)
   {
       name = newName;
   }
   
   public final Faculty getFaculty()
   {
       return f;
   }
   public void setFaculty(final Faculty newF)
   {
       f = newF;
   }
   
   public final int getCount()
   {
       return count;
   }
   
   public final String getStudent(int number)
   {
       if(number < 1 || number > count)
       {
           return "\nInvalid student. Students are from 1 to " + count;
       }
       
       else
       {
           //indexes start from 0, not 1
           number -= 1;
       }
       
       return s[number].toString();
   }
   public void setStudent(final Student newS, final int student)
   {
       //spot undergoes the changes
       int spot = student;
       boolean valid = true; 
       
       if(spot > maxStudents)
       {
           System.out.println("\nOut of spots. Only " + maxStudents + " spots available.");
           valid = false;
       }
       
       else if(spot < 1 || spot > (count + 1))
       {
           System.out.println("\nThis is an invalid spot.");
       }
       
       if(valid)
       {
           //indexes start at 0, not 1
          spot -= 1;
          s[spot] = newS;
          
          //some spots just overrided, not added
          if(student > count)
          {
              ++count;
          }
       }
   }
   
   public void printStudents()
   {
       for(int index = 0; index < count; ++index)
       {
           System.out.println("\nStudent " + (index + 1) + ":");
           System.out.println(s[index]);
       }
  }
   
   private String name = "";
   private Faculty f = null;
   //count is the total students and also the logical size
   private int count = 0;
   private final int minStudents = 3;
   private final int maxStudents = 50;
   private Student[] s = new Student[maxStudents];
   
   
}
