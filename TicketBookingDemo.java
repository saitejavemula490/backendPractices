package practiceJava;

public class TicketBookingDemo {

	public static void main(String[] args) {
		TicketBookingSystem system = new TicketBookingSystem(5);
		
		system.bookseat(1, "user1");
		system.bookseat(2, "user2");
		system.bookseat(1, "user3");
		
		System.out.println("avaialble seats"+system.getavailbleseats());

	}

}
