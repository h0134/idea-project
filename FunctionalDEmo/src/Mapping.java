//import java.util.Arrays;
//import java.util.stream.Collectors;
//import java.util.*;
//import java.util.stream.IntStream;
//import java.util.List;
//
//public class Mapping {
//    public static void main(String[] args) {
//
//
//        List<Integer> l = new ArrayList<Integer>();
//        l.stream().filter(e -> e % 2 == 0).forEach(System.out::println);
//        System.out.println(l);
//
//    }
//
//}


//input :["one","two,"three","four","ten"]
//
//output:["one","two","ten","four","three"]


import java.util.ArrayList;
import java.util.Collections;

class Mapping{
    public static void main(String[] args) {
        ArrayList<String> ar= new ArrayList<String>();
        ar.add("one");
        ar.add("two");
        ar.add("three");
        ar.add("four");
        ar.add("ten");

        Collections.sort(ar,(s1,s2)->{
            if(s1.length()>s2.length())
                return 1;
            else if (s1.length()<s2.length())
                return -1;
            else
                return 0;

        });

        for(String str:ar){
            System.out.println(str);
        }


    }
}











