import java.util.Arrays;

public class StrinDemo {
    int eid;
    String ename;

    StrinDemo(int eid,String ename) {
        this.eid = eid;
        this.ename = ename;
    }
  public String toString(){
        return eid+ "     " +  ename;
  }

    public static void main(String[] args) {
        StrinDemo st1  = new StrinDemo(101,"jay");
        StrinDemo st2  = new StrinDemo(102,"akash");
        StrinDemo st3  = new StrinDemo(103,"parkash");

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);

    }


    }
