import java.util.ArrayList;
import java.util.*;
import java.util.function.Predicate;
import java.util.Collections;

public class IteratorDemo {

    public static void main(String[] args) {


//         Example :
//         ArrayList num = new ArrayList();
//         num.add(1);
//         num.add("harman");
//         num.add(10.5);
//

//
//         Iterator itr = num.iterator();
//         while(itr.hasNext()){
//             Object  val = itr.next();
//             System.out.println(val);
//         }


//         ArrayList<String> al = new ArrayList<String>();
//         al.add("ratan");
//
//         al.add("anu");
//
//         al.add("naresh");
//         al.add("savya");

        ArrayList<Integer> ci = new ArrayList<Integer>();
        ci.add(12);
        ci.add(13);
        ci.add(16);
        ci.add(15);
        ci.add(14);


        // for each method to read the data: using Lambda
//         al.forEach(str ->System.out.println(str));
//  --foreach() method accepts consumer functional interface
//         C.F.I contains only one method whose implementation can be put here(foreach()) using lambda expression:


//         str ->System.out.println(str)   This is the implementation of accept method


        // for each method to read the data: using method refrence:
//al.forEach(System.out::println);


// read the data using get() method
//        String st=  al.get(2);
//         System.out.println(st);

// read the data using normal cursor iterator:Iterator
//         Iterator itr = al.iterator();
//         while(itr.hasNext()){
//             String s =(String)itr.next();
//             System.out.println(s);
//         }


        // read the data using generic  cursor iterator:Iterator
//         Iterator <String> itr = al.iterator();
//         while(itr.hasNext()){
//             String s =(String)itr.next();
//             System.out.println(s);
//         }
//


//         Predicate <Integer> p = ar ->  ar%2==0;
//         ArrayList<Integer> ar = new ArrayList<>();
//         for (int i = 0; i < 10; i++) {
//             ar.add(i);
//         }
//         System.out.println(ar);
//         for(Integer ll:ar){
//             if (p.test(ll)){
//                 System.out.println(ll);
//             }
    }

}

 // AnotherWay

//        System.out.println(l);
//                 Iterator itr =  l.iterator();
//                 while(itr.hasNext()) {
//                     Integer I = (Integer) itr.next();
//                     if (I % 2 == 0)
//                         System.out.println(I);
//                     else itr.remove();
//                 }
//        System.out.println(l);
//
//
//
//
//
//
//
//    }
//
//}
