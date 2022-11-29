
public class Question_1 {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new ThreadRunnableClass());
        Thread t2 = new ThreadClass();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }
}

