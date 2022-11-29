import java.util.ArrayList;
import java.util.Arrays;

class ArraysDemo {
     public static void main(String[] args) {
         ArrayList al = new ArrayList();
         al.add(10);
         al.add("ratan");
         al.add("durga");
         al.add(10.5);
         System.out.println(al);
         System.out.println(al.size());
         al.add(1,"harman");
         al.remove(0);
         System.out.println(al);
         System.out.println(al.size());
         System.out.println(al.contains("durga"));
         System.out.println(al.isEmpty());
         al.clear() ;// to remove all the elements from the array list
         System.out.println(al);

     }

}
