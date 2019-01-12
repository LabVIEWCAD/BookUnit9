package cn.itcast.booktest;

import java.util.HashMap;
import java.util.Map;

import cn.itcast.domain.Employee;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Employee> staff = new HashMap<>();
		staff.put("144",new Employee("Amy"));
		staff.put("567",new Employee("Harry"));
		staff.put("157",new Employee("Gary"));
		staff.put("456",new Employee("Cruz"));
		
		//print all entries
		System.out.println(staff);
		
		//remove all entries
		staff.remove("567");
		
		//replace an entries
		staff.put("456", new Employee("Miller"));
		
		//look up a value
		System.out.println(staff.get("157"));
		
		//iterate through all entries
		staff.forEach((k,v)->System.out.println("key="+k+",value="+v));
	}

}
