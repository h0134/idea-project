import java.util.Scanner;

public class AssQ1_info
{
    static String FirstName;
    static String LastName;
    static int age;
    static void getQ1(String fn,String ln,int a)
    {
        FirstName=fn;
        LastName=ln;
        age=a;
    }
    static void printQ1()
    {
        System.out.println("First name :" + FirstName);
        System.out.println("Last name :" + LastName);
        System.out.println("Age :" + age);
    }
    public static void main(String[] args)
    {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter First name: ");
        String fn=SC.next();
        System.out.println("Enter Last name: ");
        String ln=SC.next();
        System.out.println("Enter age: ");
        int a = SC.nextInt();
        getQ1(fn,ln,a);
        printQ1();
    }
}
