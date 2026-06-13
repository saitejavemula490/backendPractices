package practiceJava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streams1 {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
				 new Student("Rahul", "Sharma", "Hyderabad", 8.38, 19, "Civil"),
				 new Student("Amit", "Verma", "Delhi", 8.4, 21, "IT"),
				 new Student("Suresh", "Reddy", "Chennai", 7.5, 20, "Civil"),
				 new Student("Kiran", "Patel", "Mumbai", 9.1, 20, "IT"),
				 new Student("Arjun", "Naidu", "Bengaluru", 7.83, 20, "Civil")
				);

		
		//1. Find students from Hyderabad with a grade greater than 8.0
		List<Student> FROMHyd = students.stream().filter(x->x.getAddress().equalsIgnoreCase("Hyderabad") && x.getCGPA()>8.0).collect(Collectors.toList());
		
		
		
		//2. Find the student with the highest grade
		Student highgrade = students.stream().max(Comparator.comparingDouble(Student::getCGPA)).orElseThrow();
		
				//		3. Count the number of students in each department
		Map<String,Long> EachDep = students.stream().collect(Collectors.groupingBy(Student::getDepartment,Collectors.counting()));
//		4. Find the average grade per department
		
		Map<String, Double> EachDepAvg = students.stream().collect(Collectors.groupingBy(Student::getDepartment,Collectors.averagingDouble(Student :: getCGPA)));
//		5. List students sorted by age and then by grade
		//List<Student> sortageGrade = students.stream().sorted(Comparator.comparingInt(Student::getAge).thenComparingDouble(Student::getCGPA)).collect(Collectors.toList());
//		6. Create a comma-separated list of student names
		//String names = students.stream().map(Student::getFirstName).collect(Collectors.joining(","));
//		7. Check if all students are above 18
//		8. Find the department with the most students
//		9. Divide students into those who have grades above 8.0 and below
//		10. Find the student with the longest full name
		
		
		
		
		System.out.println(EachDepAvg);
		
	}

}
