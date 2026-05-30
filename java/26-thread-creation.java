/*
26. Thread Creation
• Objective: Implement multithreading.
• Task: Create and run two threads that print messages.
• Instructions:
o Define a class that extends Thread or implements Runnable.
o In the run() method, print a message multiple times.
o Start both threads and observe the output.
*/

class MyThread extends Thread {
    private String message;
    private int count;

    MyThread(String message, int count) {
        this.message = message;
        this.count = count;
    }

    MyThread(String message) {
        this.message = message;
        this.count = 5;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.println(message + " - " + i);
        }
    }
}

class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1", 30);
        MyThread thread2 = new MyThread("Thread 2", 30);
        
        thread1.start();
        thread2.start();
    }
}

/*
Thread 1 - 0
Thread 1 - 1
Thread 2 - 0
Thread 1 - 2
Thread 2 - 1
Thread 2 - 2
Thread 2 - 3
Thread 2 - 4
Thread 2 - 5
Thread 2 - 6
Thread 2 - 7
Thread 2 - 8
Thread 2 - 9
Thread 1 - 3
Thread 1 - 4
Thread 2 - 10
Thread 2 - 11
Thread 2 - 12
Thread 2 - 13
Thread 2 - 14
Thread 2 - 15
Thread 2 - 16
Thread 1 - 5
Thread 2 - 17
Thread 2 - 18
Thread 2 - 19
Thread 1 - 6
Thread 2 - 20
Thread 2 - 21
Thread 2 - 22
Thread 2 - 23
Thread 2 - 24
Thread 2 - 25
Thread 2 - 26
Thread 1 - 7
Thread 2 - 27
Thread 2 - 28
Thread 2 - 29
Thread 1 - 8
Thread 1 - 9
Thread 1 - 10
Thread 1 - 11
Thread 1 - 12
Thread 1 - 13
Thread 1 - 14
Thread 1 - 15
Thread 1 - 16
Thread 1 - 17
Thread 1 - 18
Thread 1 - 19
Thread 1 - 20
Thread 1 - 21
Thread 1 - 22
Thread 1 - 23
Thread 1 - 24
Thread 1 - 25
Thread 1 - 26
Thread 1 - 27
Thread 1 - 28
Thread 1 - 29
 ~/projects/cts/cts-upskilling/java │ main !26 ?5                                                                                                           ✔ │ 03:16:55 PM 
 */