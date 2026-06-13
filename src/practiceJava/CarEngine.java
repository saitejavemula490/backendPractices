package practiceJava;

public class CarEngine {

	public static void main(String[] args) {
		//car car = new car();
		Bus bus = new Bus();
		//car.drive();
        //car.accelerate();
		bus.busmoving();
	}
	

}
class car {
	private Engine engine = new Engine();
	public void drive() {
        //engine.start();
        System.out.println("Car is moving...");
    }
	public void accelerate() {
        //engine.start();
        System.out.println("Car is accelerating...");
    }
	}
	class Engine {
	    public void start() {
	        System.out.println("Engine started...");
	    }
	}
	//===============================================
	class Bus {
		private Busgear busgear = new Busgear();
		public void busmoving() {
			//busgear.move();
			System.out.println("Bus is moving...........");
		}
		
	}
	class Busgear{
		public void move() {
			System.out.println("BusGEAR is placed......");
		}
	}
