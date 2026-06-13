package practiceJava;

import java.util.Map;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

public class TicketBookingSystem {
    private final static  Map<Integer,Boolean> seats = new ConcurrentHashMap<>();
    private final static ReentrantLock lock = new ReentrantLock();
	public TicketBookingSystem(int totalSeats ) {
		IntStream.range(0, totalSeats).forEach(i->seats.put(i,false));
		
	}
	public static boolean bookseat(int seatid,String Userid) {
		lock.lock();
			try {
				if(!seats.getOrDefault(seatid,true)) {
				   seats.put(seatid,true);
				   System.out.println(Userid+"booked"+seatid);
				   return true ;
				}
		     System.out.println("Seat " + seatid + " already taken");
             return false;

             }
			finally {
				lock.unlock();
				}
			}
	public List<Integer> getavailbleseats() {
		
		return seats.entrySet().stream().filter(e->!e.getValue()).map(Map.Entry::getKey).sorted().toList(); 
	}

}
