package functinal.interfaces;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
	String name;
	double salary;

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
}

public class PredicateExam {
	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("Sundeep", 25000));
		l.add(new Employee("Raksha", 26000));
		l.add(new Employee("Ajay", 24000));
		l.add(new Employee("rakesh", 22000));
		l.add(new Employee("Shadab", 27000));
	
		Predicate<Employee> p=e->e.salary>23000;
	 for(Employee e1:l) {
		if(p.test(e1)) {
			System.out.println(e1.name+":"+e1.salary);
		}
	}
	}
}