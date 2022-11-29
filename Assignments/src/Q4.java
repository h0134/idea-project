import java.util.LinkedHashMap;
import java.util.Map;

public class Q4 {
    public static void main(String args[]) {
        Employee1 e1 = new Employee1(20, "Mohana", "trainee");
        Employee1 e2 = new Employee1(28, "Sumathi", "manager");
        Employee1 e3 = new Employee1(27, "sriharan", "director");
        Employee1 e4 = new Employee1(38, "Muthu", "CEO");

        Map<Employee1, Integer> map = new LinkedHashMap<>();

        map.put(e1, 30000);
        map.put(e2, 50000);
        map.put(e3, 88820);
        for (Employee1 key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
    }
}
