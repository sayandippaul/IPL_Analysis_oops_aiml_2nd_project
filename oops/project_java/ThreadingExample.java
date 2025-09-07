// extending Thread class
// class MyThread extends Thread {
//     private String threadName;

//     public MyThread(String name) {
//         threadName = name;
//     }

//     public void run() {
//         for(int i = 5; i > 0; i--) {
//             System.out.println(threadName + ": " + i);
//             try {
//                 Thread.sleep(500); // Sleep for 500 milliseconds
//             } catch (InterruptedException e) {
//                 System.out.println(threadName + " interrupted.");
//             }
//         }
//         System.out.println(threadName + " exiting.");
//     }
// }
// Implementing Runnable interface
class MyThread implements Runnable {
    private String threadName;

    public MyThread(String name) {
        threadName = name;
    }

    public void run() {
        for(int i = 5; i > 0; i--) {
            System.out.println(threadName + ": " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
        System.out.println(threadName + " exiting.");
    }
}

public class ThreadingExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread("Thread-1"));
        Thread t2 = new Thread(new MyThread("Thread-2"));

        t1.start();
        t2.start();
    }
}
