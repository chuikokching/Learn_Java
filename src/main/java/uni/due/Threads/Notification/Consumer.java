package uni.due.Threads.Notification;

public class Consumer implements Runnable {

    Queue queue;

    public Consumer(Queue queue) {
        this.queue = queue;
    }

    public void run() {
        while (true)
        {
            queue.getN();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
