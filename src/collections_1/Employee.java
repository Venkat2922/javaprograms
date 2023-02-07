package collections_1;

import java.util.ArrayList;

public class Employee implements Comparable{
	String name;
	int age;
	int salary;
	public Employee(String name,int age,int salary) {
		this.name=name;
		this.age=age;
		this.salary=salary;
		
	}
	@Override
	public int compareTo(Object o) {
		Employee e=(Employee)o;
		
		if (salary>e.salary) {
			return 1;
		}
		
		else if(salary<e.salary) {
		return -1;
	}
	return 0;
	}
	

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", salary=" + salary ;
	}
	public static void main(String[] args) {
		
	
		Employee e1=new Employee("Hardik", 30, 20000);
		Employee e2=new Employee("rohit", 35, 50000);
		Employee e3=new Employee("Virat", 34, 550000);
		Employee e4=new Employee("smriti", 32, 30000);
		
		ArrayList a=new ArrayList();
		a.add(e1);
		a.add(e2);
		a.add(e3);
	    a.add(e4);
	    
	    for(Object list:a) {
	    	System.out.println(list);
	    }

	
	}

}
