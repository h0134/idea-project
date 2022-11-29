//There are two approaches to create a thread in java
//1. Extending Thread
//2. Implementing Runnable Interface
//public class Main {
////    whenever the execution starts from the main method one thread is started ,
////    automatically,that thread name is Main Thread.
//    public static void main(String[] args) // main Thread
//    {
//        System.out.println("Hello world!"); // main executing
//        System.out.println("Hello world!");// main executing
//        System.out.println("Hello world!");// main executing
//        System.out.println("Hello world!");// main executing
//        System.out.println("Hello world!");// main executing
//    } // main Thread ended
//}


//Example -2
//  normal java class become thread class when we extend thread class.


//step-1
//class MyThread extends Thread   {
//
//    //    Step-2: write the business logics by overriding the run method.
//    public void run()
//    {
//        // thread logics
//    }
//
//}
//
//
//
//// Step 3: - Instantiate the threadclass
//
//    MyThread t = new MyThread();
//
////step4:
//t.start();
