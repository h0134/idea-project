class ThreadRunnableClass implements Runnable {

    @Override
    public void run() {
        System.out.println("In Thread Runnable class");
    }
}

class ThreadClass extends Thread {
    @Override
    public void run() {
        System.out.println("In thread class");
    }
}