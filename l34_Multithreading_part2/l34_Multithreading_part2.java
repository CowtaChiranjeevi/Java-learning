package l34_Multithreading_part2;

public class l34_Multithreading_part2 {
    public static void main(String[] args) {
        // There are a few methods for thread to get the name of the thread and to also set the name of the thread.
        // Thread t1 = new Thread(() -> {
        //     System.out.println("Thread running..."+Thread.currentThread().getName());
        // });
        // System.out.println("Before start: "+t1.getName());
        // t1.setName("Downloader");
        // System.out.println("After start: "+t1.getName());
        // // t1.start();

        // // Check if a thread is alive or not
        // System.out.println("Before start: "+t1.isAlive());
        // t1.start();
        // System.out.println("After start: "+t1.isAlive());
        // System.out.println("After termination: "+t1.isAlive());

        // Using sleep method
        Thread t2 = new Thread(()->{
            for(int i=0;i<=3;i++){
                System.out.println("Count: "+i);
                // Sleep method here must be called inside try catch block and also inside the for loop to work as intended.
                try{
                    Thread.sleep(1000);
                }
                catch(Exception e){
                    System.out.println(e);
                }
            } 
        });
        t2.start();
        // Join method pauses the execution of the calling thread(usually main thread) until the execution of thread is done. It must be written in try catch block.
        try{
            t2.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();;
        }
        System.out.println("Main thread finished execution.. !");
        
        // Setting priorities on different threads to possibly increase the likelihood of getting pushed first in CPU execution order.
        Thread low = new Thread(()->{
            for(int i=0;i<3;i++){
                System.out.println("Low: "+i);
            }
        });
        Thread high = new Thread(()->{
            for(int i=0;i<3;i++){
                System.out.println("high: "+i);
                // yield method makes a suggestion to the scheduler to lower the priority of execution of current thread in favour of other running threads. It may or may not work and is not guaranteed.
                Thread.yield();
            }
        });
        low.setPriority(1);
        high.setPriority(10);
        low.start();
        high.start();
        
    }
}
