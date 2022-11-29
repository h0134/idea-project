import java.util.Scanner;
public class Assgnm_Q2
{
    public static void main(String[] args)
    {
        String inp;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Write anything except XDONE:");
            inp=sc.nextLine();
            System.out.println(inp);
        } while(!inp.equals("XDONE"));
    }

}
