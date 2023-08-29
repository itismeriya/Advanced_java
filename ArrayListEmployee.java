package collectionDemo;
import java.util.ArrayList;
public class ArrayListEmployee {

    public static void main(String[] args) {

       
        
        Employee emp1 = new Employee(1,"Koyel","Kolkata");
        Employee emp2 = new Employee(2,"Ani","Bangalore");
        Employee emp3 = new Employee(3,"Prashanth","Hyderabad");
        
        ArrayList<Employee> employees = new ArrayList<Employee>();


        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        for (Employee e : employees){
            System.out.println(e);
        }
       
    }
}
