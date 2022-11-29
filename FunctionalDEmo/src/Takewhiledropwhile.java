import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Arrays;
public class Takewhiledropwhile {
    public static void main(String[] args) {
       ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println("----takewhile---------");

        al.stream().takeWhile(e -> e<5).forEach(System.out::println);


        System.out.println("----takewhile---------");

        al.stream().dropWhile(e -> e<5).forEach(System.out::println);


    }
}





















