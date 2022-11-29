interface intr{
    void o1();
    void o2();
}

class   Main6  implements intr {

    public void o1() {
        System.out.println("hello interface");

    }

    public void o2() {
        System.out.println("hello ");
    }
}


abstract class Main7 implements intr{

    public void  display(){
        System.out.println("JVM");
    }
//    public void o1() {
//        System.out.println("hello interface");
//
//    }
//
//    public void o2() {
//        System.out.println("hello ");
//    }
}























class Te {
    public static void main(String[] args) {
        intr i1 = new Main6();
        i1.o1();
        i1.o2();

    }

}


