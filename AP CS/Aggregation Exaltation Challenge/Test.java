
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
  public static void main (String[] args)
  {
      Course c1 = new Course();
      System.out.println(c1);
      c1.printStudents();
      Address a1 = new Address("Happy Lane", 12345);
      Student s2 = new Student("Bob", 555, a1);
      c1.setStudent(s2,2);
      c1.setStudent(s2,4);
      c1.printStudents();
      c1.setName("Marketing");
      Faculty f1 = new Faculty("Ms.Smith", a1);
      c1.setFaculty(f1);
      System.out.println(c1);
      Course c2 = new Course("COURSE2", f1, 21);
      System.out.println(c2.getStudent(25));
      System.out.println(c2);
  }
}
