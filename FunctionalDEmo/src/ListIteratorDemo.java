import java.util.*;
import java.util.LinkedList;

public class ListIteratorDemo {
    public static void main(String[] args) {
        LinkedList I = new LinkedList();
        I.add("balkrishna");
        I.add("venki");
        I.add("chiru");
        I.add("nag");



        ListIterator itr =  I.listIterator();
        while(itr.hasNext()) {
            String s = (String) itr.next();

            if(s.equals("venki"))
            {
                itr.remove();
            }
           else  if(s.equals("nag"))
            {
                itr.add("chaitu");
            }
           else if(s.equals("chiru")){
               itr.set("charan");
            }
        }
            System.out.println(I);




    }
}
