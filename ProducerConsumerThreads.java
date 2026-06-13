package practiceJava;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerThreads {

	

	public static void main(String[] args) {
		SharedBuffer shared = new SharedBuffer();
        Thread producer = new Thread(()->{
        	int i=1;
        	try {
        		while(true) {
        			shared.produce(i++);
        			Thread.sleep(500);
        		}	
        	}catch(InterruptedException e){
        		e.printStackTrace();
        	}
        });
        Thread consumer = new Thread(()->{
        	int i=1;
        	try {
        		while(true) {
        			shared.consume();
        			Thread.sleep(1000);
        		}	
        	}catch(InterruptedException e){
        		Thread.currentThread().interrupt();
        	}
        });
        producer.start();
        consumer.start();
	}
	

}
class SharedBuffer{

	private final Queue<Integer> queue = new LinkedList<>();
	private final int capacity = 5;

	public synchronized void produce(int i) throws InterruptedException {
		
		while(queue.size()==capacity) {
			wait();
		}
		queue.add(i);
		System.out.println("Produced"+i);
		notify();
		
	}

     public synchronized void consume() throws InterruptedException {
		
		while(queue.isEmpty()) {
			wait();
		}
		int i1 = queue.poll();
		System.out.println("consumed"+i1);
		notify();
		
	}
	
}
