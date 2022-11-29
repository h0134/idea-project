import java.util.Arrays;

interface intra{
    int m1(int n);
}
//class Main1 implements intra{
//    public int  m1(int n) {
//        return n * n;
//    }
//}

class Test1{
    public static void main(String[] args) {

//         Main1 kb= new Main1();
//        System.out.println(kb.m1(6));

        intra i1 = n -> n*n;
        System.out.println(i1.m1(6));
    }
}
