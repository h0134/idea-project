import java.util.spi.LocaleNameProvider;

public class Employee{
    String FName;
    String LName;
    int age;
    String designation;

    public  Employee (String FNami,String LNami, int old,String design) {
        FName = FNami;
         LName = LNami;
         age = old;
         designation = design;
     }
     public static  void main(String [] args){
         Employee myObj= new Employee("Tammany","Sharma",29,"Teacher");
         System.out.println(myObj.FName +  " "+myObj.LName+ " " + "   " + myObj.age + "  "+ myObj.designation);
    }

}
