interface It1
{
    void  m1();
    void m2();
    void m3();
}

abstract class Test implements  It1 {
    public void m1() {
        System.out.println("TTN");T1 extends Test{}
    public void m2() {
        System.out.println("Hello JAVA");
    }


}

    class Test2 extends Test{

        public  void m3(){
            System.out.println("Hello Functional Programming");
        }

        public static void main(String[] args) {
    Test2 t1 =new Test2();
    t1.m1();    t1.m2(); t1.m3();
    It1 i = t1;
    i.m1(); i.m2(); i.m3();

    }
}