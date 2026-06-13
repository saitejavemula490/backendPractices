package practiceJava;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class HotelBookingLLD {

    public static void main(String[] args) {
        Hotel hotel = new Hotel(1, "Taj", 3);
        BookingSystem bs = new BookingSystem(hotel);

        Thread user1 = new Thread(() -> bs.bookRoom(1));
        Thread user2 = new Thread(() -> bs.bookRoom(1));
        Thread user3 = new Thread(() -> bs.bookRoom(2));
        Thread user11 = new Thread(() -> bs.cancelRoom(1));

        user1.start();
        user2.start();
        user3.start();
        user11.start();
    }
}

class Hotel {
    int hotelId;
    String name;
    List<Room> rooms;

    public Hotel(int hotelId, String name, int totalRooms) {
        this.hotelId = hotelId;
        this.name = name;
        this.rooms = new ArrayList<>();
        for (int i = 1; i <= totalRooms; i++) {
            rooms.add(new Room(i));
        }
    }

    Room getRoom(int roomId) {
        return rooms.get(roomId - 1);
    }
}

class Room {
    int roomId;
    boolean isBooked;
    ReentrantLock lock = new ReentrantLock();

    public Room(int roomId) {
        this.roomId = roomId;
        this.isBooked = false;
    }

    boolean bookRoom() {
        lock.lock();
        try {
            if (!isBooked) {
                isBooked = true;
                System.out.println("Room " + roomId + " booked successfully!");
                return true;
            } else {
                System.out.println("Room " + roomId + " is already booked!");
                return false;
            }
        } finally {
            lock.unlock();
        }
    }

    boolean cancelRoom() {
        lock.lock();
        try {
            if (isBooked) {
                isBooked = false;
                System.out.println("Room " + roomId + " booking cancelled!");
                return true;
            } else {
                System.out.println("Room " + roomId + " was not booked!");
                return false;
            }
        } finally {
            lock.unlock();
        }
    }
}

class BookingSystem {
    Hotel hotel;

    BookingSystem(Hotel hotel) {
        this.hotel = hotel;
    }

    void bookRoom(int roomId) {
        hotel.getRoom(roomId).bookRoom();
    }

    void cancelRoom(int roomId) {
        hotel.getRoom(roomId).cancelRoom();
    }
}
