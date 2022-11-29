//import java.io.File;
//import java.io.IOException;
//import java.io.FileWriter;   // Import the FileWriter class
//import java.io.IOException;  // Import the IOException class to handle errors

class Main{
    public static void main(String [] args){

        SBI obj1 =new SBI();
        BOI obj2= new BOI();
        ICICI obj3 = new  ICICI();
        System.out.println("The rate of interest of SBI Bank is :"  + obj1.getDetails());
        System.out.println("The rate of interest of BOI Bank is :"  + obj2.getDetails());
        System.out.println("The rate of interest of ICICI Bank is :"  + obj3.getDetails());
        obj1.OpenNewAccount();

    }
}
