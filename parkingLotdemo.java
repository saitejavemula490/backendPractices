package practiceJava;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class parkingLotdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        Parkinglot lot = new Parkinglot(2);
        EntryGate Entry = new EntryGate(lot);
        ExitGate Exit = new ExitGate(lot);
        vehcile v = new vehcile( "CAR1234", vehcileType.CAR);
        ticket t1 = Entry.issueTicket(v);
        Thread.sleep(2000); // simulate parking duration

        Exit.processExit(t1);
	}

}
enum vehcileType{
	CAR,BIKE,TRUCK;

	vehcileType getType() {
		// TODO Auto-generated method stub
		return null;
	}

	String getNumber() {
		// TODO Auto-generated method stub
		return null;
	}
}

class vehcile{
	private String carnumber;
	private vehcileType type;
	vehcile (String carnumber,vehcileType type){
		this.carnumber = carnumber;
		this.type=type;
	}
	
	public String getcarnumber(String carnumber) {
		return carnumber;
		
	}
	public vehcileType getType() {
		return type;
		
	}
	public String getNumber() {
		// TODO Auto-generated method stub
		return carnumber;
	}
}
class parkingslot{
	private int slotid;
	private vehcileType type;
	private boolean occupied;
	parkingslot(int slotid,vehcileType type){
		this.slotid = slotid;
		this.type = type;
	}
	
	public int getSlotid() {
		return slotid;
	}
	public vehcileType getType() {
		return type;
	}
	public boolean isAvailble() {
		return !occupied;
	}
	public void occupy() {
		 occupied = true;
	}
	public void release() {
		occupied = false;
	}	
}
class Parkingfloor{
	private int floorNumber ;
	private List<parkingslot> slots = new ArrayList<>() ;
	public Parkingfloor(int floor,int carslots,int bikeslots,int truckslots) {
		this.floorNumber = floorNumber;
		int counter = 1;
		for (int i = 0; i < carslots; i++) {slots.add(new parkingslot(counter++, vehcileType.CAR));}
		for (int i = 0; i < bikeslots; i++) {slots.add(new parkingslot(counter++, vehcileType.BIKE));}
		for (int i = 0; i < truckslots; i++) {slots.add(new parkingslot(counter++, vehcileType.TRUCK));}
	}
	public ticket allowcateSlot(vehcile v) {
		for(parkingslot slot : slots) {
			if(slot.getType() == v.getType()&& slot.isAvailble()) {
				slot.occupy();
				return new ticket(v,slot,floorNumber);
			}
		}
		return null;
		
	}
	public void releaseSlot(ticket t) {
        t.getSlot().release();
    }
    public int getfloorNumber() { return floorNumber; }
}
class ticket {
    private vehcile vehicle;
    private parkingslot slot;
    private int floorNumber;
    private long entryTime;

    public ticket(vehcile v, parkingslot slot2, int floorNumber2) {
        this.vehicle = v;              // store the whole vehicle
        this.slot = slot2;
        this.floorNumber = floorNumber2;
        this.entryTime = System.currentTimeMillis();
    }

    public long getEntryTime() { return entryTime; }
    public parkingslot getSlot() { return slot; }
    public vehcile getVehicle() { return vehicle; }   // return vehicle object
    public int getfloorNumber() { return floorNumber; }
}

class FeeCalculator {
    public static int calculate(ticket ticket) {
        long duration = (System.currentTimeMillis() - ticket.getEntryTime()) / 1000; // seconds
        int rate = switch(ticket.getVehicle().getType()) {
            case CAR -> 20;
            case BIKE -> 10;
            case TRUCK -> 30;
        };
        return (int)duration * rate;
    }
}
class Parkinglot{
	 private List<Parkingfloor> floors = new ArrayList<>();
	    private ReentrantLock lock = new ReentrantLock();
	    public Parkinglot(int numfloors) {
			for (int i = 0; i < numfloors; i++) {
				floors.add(new Parkingfloor(i, 2, 2, 2));
			}
		}
	    public ticket allowcateSlot(vehcile v) {
	    	lock.lock();
	    	try {
				for(Parkingfloor floor : floors) {
					ticket t = floor.allowcateSlot(v);
					if(t!=null)return t;
				}
			} finally {
				lock.unlock();
			}
			return null;
	    	
	    }
	    public void removeSlot(ticket t) {
	    	lock.lock();
	    	try {
	    		for(Parkingfloor floor : floors) {
	                if(floor.getfloorNumber() == t.getfloorNumber()) {
	                    floor.releaseSlot(t);
	                }
	            }
			} finally {
				lock.unlock();
			}
	    	
	    	
	    }
}
class EntryGate {
    private Parkinglot lot;
    public EntryGate(Parkinglot lot) { this.lot = lot; }
    public ticket issueTicket(vehcile v) {
        ticket t = lot.allowcateSlot(v);
        if(t != null) {
            System.out.println("Ticket issued for " + v.getNumber() +
                               " at floor " + t.getfloorNumber() +
                               ", slot " + t.getSlot().getSlotid());
        } else {
            System.out.println("No slot available for " + v.getNumber());
        }
        return t;
    }
}

class ExitGate {
    private Parkinglot lot;
    public ExitGate(Parkinglot lot) { this.lot = lot; }
    public void processExit(ticket t) {
        lot.removeSlot(t);
        int fee = FeeCalculator.calculate(t);
        System.out.println("Vehicle " + t.getVehicle().getNumber() +
                           " exited from floor " + t.getfloorNumber() +
                           ". Fee: " + fee);
    }
}








