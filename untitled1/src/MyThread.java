//Example -2
//  normal java class become thread class when we extend thread class.


import java.util.Arrays;

//step-1
class MyThread extends Thread   {

    //    Step-2: write the business logics by overriding the run method.
    public void run()
    {
        for(int i=0 ; i <10; i++){
            System.out.println("userdefined thread");
        }
    }

}

class ThreadDemo{
    public static void main(String[] args) {
        // Step 3: - Instantiate the threadclass

        MyThread t = new MyThread();
        //step4:
        t.start();
//        t.run();

        for(int i=0;i<10;i++){
            System.out.println("main defined thread");


        }

    }
}

