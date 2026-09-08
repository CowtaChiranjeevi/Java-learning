package l35_RaceConditions_Synchronization;

// Created a class that gives the function to withdraw from balance and printing the thread that executes it and shows balance
class Account{
    int balance = 1000;
    // Adding syncrhronized keyword makes it so that other threads cannot access the variables inside the method and have to wait till the execution of this thread is completed. 
    synchronized void withdraw(){
    if(balance >= 600){
        System.out.println("Name of the thread is: "+Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName()+" is withdrawing..");
        balance -= 600;
        System.out.println("Total balance: "+balance);
    }
    else{
        System.out.println("Insufficient balance");
    }
    }
}

public class l35_RaceConditions_Synchronization {
    public static void main(String[] args) {
        Account acc = new Account();
        // Created two threads with runnable interfaec overriding run method and also mentioning thread custom name as second argument.
        Thread t1 = new Thread(()-> acc.withdraw(), "T1");
        Thread t2 = new Thread(()-> acc.withdraw(), "T2");
        t1.start();
        t2.start();
    }
}
