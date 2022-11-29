import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class nine {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
//        List.copyOf(list).add(1);
        System.out.println("Unmodifiable List:");
        list.stream()
                .filter(e->e>11)
                .collect(Collectors.toUnmodifiableList()).forEach(System.out::println);

    }
}
