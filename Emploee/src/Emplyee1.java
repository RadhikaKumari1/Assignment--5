
public class Emplyee1 implements Comparable<Emplyee1> {

	String name;
	int age;
	double salary;
	int id;
	
	Emplyee1(int id, String name, int age, double salary){	// Constructor of Employee class
		this.name = name;
		this.age = age;
		this.id = id;
		this.salary = salary;
	}
		
		@Override	
		public int compareTo(Emplyee1 emp) {					// overriding the compareTo method of Comparable class
			if(salary == emp.salary)
				return 0;
			else if(salary > emp.salary)
				return 1;
			else
				return -1;
		}
}
