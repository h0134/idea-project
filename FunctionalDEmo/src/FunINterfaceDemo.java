import java.util.Arrays;
import java.util.function.*;
public class FunINterfaceDemo {
    public static void main(String[] args) {
//        Function<Integer,Integer> f1 = i ->  i*i;
//        System.out.println(f1.apply(6));

//        Function<String,Integer> f1 = i -> i.length();
//        System.out.println(f1.apply("Harmanpreetkaur"));
//         }

        Function<String, String> f1 = i -> i.toUpperCase();
        System.out.println(f1.apply("harmanpreetkaur"));


    }
}
