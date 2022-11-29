import java.util.Scanner;
public class Main {
    static double pi = 3.14;
    public static void main (String[] args){

            int r;
            Scanner kb= new Scanner(System.in);
            System.out.println("enter the value of radius:");
            r=kb.nextInt();
            double Area= pi * r *r;
            double circumference= 2 * pi * r;
        System.out.println("The area of the circle is " + Area);
        System.out.println("The circumference  of the circle is " + circumference);


    }

}