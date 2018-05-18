
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
        Student s = new Student();
        Faculty f = new Faculty();
        System.out.println(s);
        System.out.println(f);
        Address ad = new Address("Elmo", 6789);
        s.setAddress(ad);
        System.out.println(s);
        f.setAddress("Elmo", 67891);
        System.out.println(f);
        Student s1 = new Student("I am unique", new Address("Elm Street", 6666), 12);
        Faculty f1 = new Faculty("I am unique", new Address("Teacher", 1324), 1000);
        System.out.println(s1);
        System.out.println(f1);
    }
}
