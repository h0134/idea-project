import org.w3c.dom.ls.LSOutput;

interface inter {
    void vini();

}

class Main3 implements inter {

    public void vini() {
        System.out.println("Hi ");
    }
}

class Sample  extends Main3 {
    void mm(){
      System.out.println("hello");}

}


 class sample2 {
              public static void main(String[] args) {
           Main3 kb =new Main3();
           Sample pp =new Sample();
           kb.vini();
           pp.mm();




    }
 }



