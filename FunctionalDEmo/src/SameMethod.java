interface tip{
    void t1();
}
interface tipu{
    void t1();
    void t2();
}

public class SameMethod  implements tipu {
    public void t1(){
        System.out.println(" two same  methods ");
    }
    public void t2(){
        System.out.println("   methods ");
    }

    public static void main(String[] args) {
        SameMethod s= new SameMethod();
        s.t1();
        s.t2();
    }
}
