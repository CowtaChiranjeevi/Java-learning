package l36_Inter_ThreadCommunication_ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Kitchen class created to create two synchronized methods which use wait() and notify()
class Kitchen {
    boolean foodReady = false;
    synchronized void cook() {
        System.out.println("Chef: Cooking food...");
        try { Thread.sleep(2000); } catch (InterruptedException e) {}
        foodReady = true;
        System.out.println("Chef: Food is ready! Notifying waiter...");
        notify();
    }
    synchronized void serve() {
        while (!foodReady) {
            System.out.println("Waiter: Waiting for food...");
            try { wait(); } catch (InterruptedException e) {}
        }
        System.out.println("Waiter: Serving food to customer!");
    }
}

public class l36_Inter_ThreadCommunication_ExecutorFramework {
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        Thread waiter = new Thread(() -> kitchen.serve(), "Waiter");
        Thread chef = new Thread(() -> kitchen.cook(), "Chef");
        // Although the waiter's serve method is called first , because of using the wait() method it comes out of the lock and waits for the call of a notify() from another method.
        waiter.start();
        chef.start();

        // Executor Framework is responsible for creating a fixed number of threads and assigns tasks to these threads automatically instead of doing it manually which is not optimal.
        ExecutorService service = Executors.newFixedThreadPool(3);
        service.submit(() -> System.out.println("Task 1 - "+Thread.currentThread().getName()));
        service.submit(() -> System.out.println("Task 2 - "+Thread.currentThread().getName()));
        service.shutdown();

        ExecutorService service01 = Executors.newFixedThreadPool(3);
        for(int i = 1; i < 5; i++ ){
            int taskNum = i;
            service01.submit(() -> {
                System.out.println("Task "+taskNum+" - "+Thread.currentThread().getName());
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            } );
            
        }
        service01.shutdown();
        
    }
}
