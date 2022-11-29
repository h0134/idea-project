import java.util.stream.IntStream;

public class three {
    public static void main(String[] args) {
        System.out.println("Without rangeClosed on {20-30}:");
        IntStream.range(20, 30).forEach(System.out::println);
        System.out.println("Without rangeClosed on {20-30}:");
        IntStream.rangeClosed(20, 30).forEach(System.out::println);

    }
}