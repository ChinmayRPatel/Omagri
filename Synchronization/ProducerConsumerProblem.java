package Synchronization;

class Message {
    private String content;
    private boolean hasMessage = false;

    // Synchronized method for producing a message
    public synchronized void produce(String content) {
        while (hasMessage) {
            try {
                wait();  // Wait until the message is consumed
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.content = content;
        hasMessage = true;
        System.out.println("Produced: " + content);
        notify();  // Notify the consumer thread
    }

    // Synchronized method for consuming a message
    public synchronized void consume() {
        while (!hasMessage) {
            try {
                wait();  // Wait until a message is produced
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Consumed: " + content);
        hasMessage = false;
        notify();  // Notify the producer thread
    }
}

public class ProducerConsumerProblem {
    public static void main(String[] args) {
        Message message = new Message();

        // Producer thread
        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                message.produce("Message " + i);
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                message.consume();
            }
        });

        producer.start();
        consumer.start();
    }
}
