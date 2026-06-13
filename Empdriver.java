package practiceJava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Empdriver {

	public static void main(String[] args) {
		List<Emp> list = Arrays.asList(
				new Emp("saiteja",1,"BackendENg",100000),
				new Emp("teja",2,"joulin",90000),
				new Emp("chand",3,"sales",80000),
				new Emp("gouri",4,"accouts",12200),
				new Emp("kholi",5,"account",19000),
				new Emp("rohith",6,"sales",15000),
				new Emp("asjwin",7,"sales",80000),
				new Emp("siraj",8,"Front",100000),
				new Emp("sindhu",9,"Front",100000));
		
//        for(Emp e:list) {
//        	System.out.println(e);
//        }
        List<Emp> asc = list.stream().filter(e->e.getsalary()>15000).collect(Collectors.toList());
        for(Emp e:asc) {
       	System.out.println(e);
       	
       	double  avg = list.stream().mapToDouble(Emp::getsalary).average().orElse(0);
       	System.out.println(avg);
       	
    	double  max = list.stream().mapToDouble(Emp::getsalary).max().getAsDouble();
       	System.out.println(max);
       	
       	double min = list.stream().mapToDouble(Emp::getsalary).min().getAsDouble();
       	
       }
	}

}
