import java.util.Arrays;

interface intref{
   public  void  m1(int a ,int b);
}
//class Main implements intref {
//    public void  m1() {
//        System.out.println("Hello JAVA");
//    }
//
//

class Test{
     public static void main(String[] args) {
         intref i1=(a,b)-> System.out.println( a + b);
         i1.m1(2,2);
         i1.m1(3,3);


     }
    }

