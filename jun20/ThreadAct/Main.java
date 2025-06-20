package jun20.ThreadAct;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread("Thread 1", 2000));
        Thread thread2 = new Thread(new MyThread("Thread 2", 5000));
        Thread thread3 = new Thread(new MyThread("Thread 3", 1000));
        Thread thread4 = new Thread(new MyThread("Thread 4", 3000));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        System.out.println("Is Thread 1 alive? " + thread1.isAlive());
        System.out.println("Is Thread 2 alive? " + thread2.isAlive());
        System.out.println("Is Thread 3 alive? " + thread3.isAlive());
        System.out.println("Is Thread 4 alive? " + thread4.isAlive());

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted.");
        }

        System.out.println("Is Thread 1 alive after join? " + thread1.isAlive());
        System.out.println("Is Thread 2 alive after join? " + thread2.isAlive());
        System.out.println("Is Thread 3 alive after join? " + thread3.isAlive());
        System.out.println("Is Thread 4 alive after join? " + thread4.isAlive());

    }
}
