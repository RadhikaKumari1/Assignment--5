import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Emplyee1> emp = new ArrayList<Emplyee1>();					// creating ArrayList of type Employee
		// Adding elements to ArrayList
		emp.add(new Emplyee1(302,"Madhu",39,50000));							
		emp.add(new Emplyee1(116,"Koyal",51,75000));
		emp.add(new Emplyee1(226,"Narayan",31,30000));
		emp.add(new Emplyee1(105,"Vanshika",22,90000));
		emp.add(new Emplyee1(122,"Nitu",33,200000));
		emp.add(new Emplyee1(421,"Kialash",34,56000));
		emp.add(new Emplyee1(429,"Deepu",26,30000));
		
		
		// Using the Override method compareTo of Comparable class
		Collections.sort(emp);
		
		// Print using for each loop
		for(Emplyee1 e: emp) {													
			System.out.println(e.id+"\t"+ e.name+"\t"+e.age+"\t"+e.salary);
		}
	}
	}


