import java.util.function.*;
public class FunctionChaining {
    public static void main(String[] args) {
        Function<Integer,Integer> fx = i -> 2*i;
        Function<Integer,Integer> fy = i ->  i * i* i;
        System.out.println(fx.andThen(fy).apply(2));
        System.out.println(fx.compose(fy).apply(2));
    }

}
