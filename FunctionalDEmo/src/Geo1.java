interface i2{
    void c1();
    void c2();
    void c3();
}

abstract class  Geo1 implements i2{
    public void c1() {
        System.out.println("TIng TIng");
    }
}

abstract class Geo2 extends Geo1{
    public void c2() {
        System.out.println("Who's this");

    }
}

class Geo3 extends  Geo2{
    public void c3(){
        System.out.println("HI,I am interface.... heeheheheheheh");
    }
    public static void main(String[] args) {
        Geo3 gg=new Geo3();
        gg.c1();
        gg.c2();
        gg.c3();
    }
}
