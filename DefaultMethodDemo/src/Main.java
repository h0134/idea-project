interface  interf{
    void m1();
    void m2();
    default void m3(){}
}

class Test implements interf{
    public void  m1(){

    }
    public void  m2(){

    }

}
class Test1 implements interf{
    public void  m1(){

    }
    public void  m2(){

    }
}
class Main{
    public static void main(String[] args) {

    }
}