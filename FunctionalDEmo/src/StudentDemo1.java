import java.util.ArrayList;
import java.util.function.*;

public class StudentDemo1 {
    public static void main(String[] args) {



        Function<Student,String>  ff = al -> {
            int marks = al.marks;
            String grade = "";
            if (marks>80) grade="A";
            else if (marks > 65 & marks <80 ) grade ="B";
            else  grade = "Fail";
            return grade;
        };


        ArrayList<Student> al = new ArrayList<Student>();
       Student s1 =new Student("harman",89);
        Student s2 =new Student("karman",76);
        Student s3 =new Student("jarpan",40);

        al.add(s1);
        al.add(s2);
        al.add(s3);



        for (Student sis: al){
            System.out.println(sis.marks);
            System.out.println(sis.name);
            System.out.println(ff.apply(sis));
        }


    }
}
