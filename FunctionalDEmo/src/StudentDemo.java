import java.util.function.*;

class StudentDemo {
    public static void main(String[] args) {

        Function<Student, String> f = s -> {
            int marks = s.marks;
            String grade = "";
            if (marks >= 80) grade = "A [distinction]";
            else if (marks >= 60) grade = "B[First Class]";
            else if (marks >= 50) grade = "C[Second Class]";
            else if (marks >= 35) grade = "D[Third Class]";
            else grade = "E[Failed]";
            return grade;
        };

        Student[] s ={ new Student("Durga", 100),
                       new Student("sunny", 65),
                        new Student("bunny", 55),
                         new Student("chinny", 45),
                               new Student("vinny", 25)
        };

        for(Student s1:s){
            System.out.println(s1.name );
            System.out.println(s1.marks );
            System.out.println(f.apply(s1));
        }
    }
}

