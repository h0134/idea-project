
import java.util.ArrayList;
        import java.util.List;
public class Main
{
    public static void main(String[] args)
    {
        List<Float> list = new ArrayList<>();
        list.add(55.4f);
        list.add(56.4f);
        list.add(57.4f);
        list.add(58.4f);
        list.add(59.4f);
        float sum=0;
        for(Float i :list)
            sum +=i;
        System.out.println("sum -> " + sum);
    }
}
