public class Test {

    public static void dostuff () {


        domorestuff();

    }
    public static void domorestuff ()
    {

    }

    public static void main(String[] args) {
        dostuff();
        try {

            System.out.println(8/0);
            System.out.println("hi");   }
        catch(ArithmeticException e)
        {
            System.out.println(10/0);
        }
        System.out.println("pipe");
    }



}