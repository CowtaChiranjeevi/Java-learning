package l33_Multithreading_part1;

// Creating a class that extends threat which is the first way of creating a thread. It creates tight coupling between thread object and its method.
class MyThread extends Thread{
    public void run(){
        System.out.println("Thread is running");
        System.out.println("Name of the thread is: " + Thread.currentThread().getName());
    }
}

// Creating a class that implements runnable interface and creates a task that can be used by a new thread object
class MyThread2 implements Runnable{
    public void run(){
        System.out.println("Second thread is running");
        System.out.println("Name of the second thread is: "+Thread.currentThread().getName());
    }
}

public class l33_Multithreading_part1 {
    public static void main(String[] args) {
        // Created a thread object t1 and executed the thread by calling the start method
        // MyThread t1 = new MyThread();
        // t1.start();

        // System.out.println("Thread created");

        // // Creating a thread by making use of the method created by implementing runnable interface and assigning it to thread constructor
        // MyThread2 task2 = new MyThread2();
        // Thread t2 = new Thread(task2);
        // t2.start();

        // // Created a thread by using lambda expression which removes the need of creating a seperate class that is supposed to implement runnable interface or extending thread class
        // Thread t3 = new Thread(() -> {
        //     for(int i=0;i<=3;i++){
        //         System.out.println("Thread 3: "+i);
        //     }
        // });
        // t3.start();

        // If you call a thread which has already executed it returns an exception , IllegalThreadStateException.
        // t1.start();

        // A thread goes through different states during its lifecycle which include New, runnable, running , waiting/blocked, terminated.
        Thread t4 = new Thread(()->{
            System.out.println("Current state of the Thread: "+Thread.currentThread().getState());
            System.out.println("Thread 4 is running...");
        });
        System.out.println("After creation: "+t4.currentThread().getState());
        t4.start();
        System.out.println("After start: "+t4.currentThread().getState());
        try{
            t4.sleep(1000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("After completion: "+t4.getState());
    }
}
