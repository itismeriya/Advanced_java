package collectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListEmployeeAnonymous {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 ArrayList<Employee> employees = new ArrayList<Employee>();

		 	

	        employees.add(new Employee(3,"Shraboni","Behala"));
	        employees.add(new Employee(1,"Gargy","Baghajatin"));
	        employees.add(new Employee(2,"Jimpi","Kalighat"));
	        
	        for (Employee e : employees){
	            System.out.println(e);
	        }
	    /*  
	        //delete
	        System.out.println("Enter id: ");
	        int id=sc.nextInt();
	        for(int i=0;i<employees.size();i++) {
	        	if(employees.get(i).getId()==id) {
	        		employees.remove(i);
	        		//employees.remove(employees.get(i));
	        		System.out.println("employees deleted successfully");
	        	}
	        }
	        System.out.println("After delete - the arraylist:");
	        for(Employee e:employees) {
	        	System.out.println(e);
	        }
	    */
	        
	        //update
	        System.out.println("Enter id: ");
	        int empId=sc.nextInt();
	        for(int i=0;i<employees.size();i++) {
	        	if(employees.get(i).getId(i)==empId) {
	        		sc.nextLine();
	        	
	        	System.out.println("Enter name: ");
	        	String name=sc.nextLine();
	        	System.out.println("Enter address: ");
	        	String address=sc.nextLine();
	        	employees.set(i, new Employee(empId,name,address));
	        	System.out.println("Employess details updated..");
	        	}
	        	
	}
	        System.out.println("After updation - the arraylist:");
	        for(Employee e:employees) {
	        	System.out.println(e);
	        }
	        
	        Collections.sort(employees);
	        System.out.println("After sorting - the arraylist:");
	        for(Employee e:employees) {
	        	System.out.println(e);
	        }
	}
}
