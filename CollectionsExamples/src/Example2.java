import java.util.Vector;

public class Example2 {
    public static void main(String[] args) {
        Vector<String> objects = new Vector<String>();
        objects.add("harman");
        objects.add("tamanna");
        objects.add("anuja");

        System.out.println(objects.capacity());


        Vector<String> objs = new Vector<String>(3);
        System.out.println(objs.capacity());
        objs.add("anu");
        objs.add("sarvaya");
        objs.add("anu");
        objs.add("anu");
        System.out.println(objs.capacity());

    }
}
