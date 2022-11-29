interface intra
{
    public void m1();
     int a =10;
}

interface intra2{

    int a=100;
}

class interfaceDEmo implements intra,intra2 {


    System.out.println(intra.a);
    public void m1() {
        System.out.println("hello");
    }



}
class tester{
    public static void main(String[] args) {
        intra i1= new interfaceDEmo();
        i1.m1();


    }
}