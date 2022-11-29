import java.util.ArrayList;
import java.util.function.Predicate;
class PredicateArray{
    public static void main(String [] args){
        Predicate <Integer> p = ar -> ar%2==0;
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(10);
        ar.add(11);
        ar.add(12);
        ar.add(13);
        ar.add(14);
        ar.add(15);
        ar.add(16);
        ar.add(17);
//        ar.add(18);
        ar.add(19);
//        Predicate <Integer> p = ari -> ari%2==0;



        for ( Integer e:ar){
            if(p.test(e))
            {
                System.out.println(e);
            }

        }
    }
}