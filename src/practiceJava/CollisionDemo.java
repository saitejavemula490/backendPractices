package practiceJava;

import java.util.*;

import java.util.HashMap;
import java.util.Objects;

class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Overriding hashCode to force collision
    @Override
    public int hashCode() {
        return id % 16; // very simple, causes collisions easily
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        Employee other = (Employee) obj;
        return this.id == other.id && Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}

public class CollisionDemo {
    public static void main(String[] args) {
        HashMap<Employee, String> map = new HashMap<>();

        Employee e1 = new Employee(1, "Teja");
        Employee e2 = new Employee(17, "Ravi"); // 1 % 16 == 17 % 16 → collision
        Employee e3 = new Employee(33, "Arjun"); // also collides (33 % 16 == 1)

        map.put(e2, "Backend Dev");
        map.put(e2, "Frontend Dev");
        map.put(e3, "Fullstack Dev");

        // Retrieval
        System.out.println("e1 → " + map.get(e1));
        System.out.println("e2 → " + map.get(e2));
        System.out.println("e3 → " + map.get(e3));

        System.out.println("\nComplete Map: " + map);
    }
}


