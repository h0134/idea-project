import java.util.*;
import java.util.ArrayList;



public class Example1 {
    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>();
        ar.add("harman");
        ar.add("simran");
        ar.add("gurvansh");
        ar.add("jubni");
        ar.add("jas");

        ListIterator Lstr = ar.listIterator(ar.size());

        while (Lstr.hasPrevious()) {

            String s = (String) Lstr.previous();
            System.out.println(s);

        }

//        while(Lstr.hasNext()){
//          String s = (String) Lstr.next();
//            System.out.println(s);
//        }
//        System.out.println("***********************8");
//
//        while (Lstr.hasPrevious()) {
//
//            String s = (String) Lstr.previous();
//            System.out.println(s);
//
//        }




        }

    }
