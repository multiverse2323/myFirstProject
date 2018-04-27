import java.util.Scanner;
public class TestLinkedList {

	public static void main(String[] args) {
		
 Scanner in = new Scanner(System.in);
 
 LinkedListOfEmployees list = new LinkedListOfEmployees();
 
 Employee e1 = new Employee(434343, "Ahmad", "Male", 23);
 Employee e2 = new Employee(384756, "Mishal", "Male", 70);
 Employee e3 = new Employee(434343, "Khaled", "Female", 56);

 list.insertAtFront(e1);
 list.insertAtFront(e2);
 list.insertAtFront(e3);

while(true) {
 System.out.println("To add a new employee, Enter 1 \n"
 	+ "To get the number of employees o f a given gender, Enter 2\n"
 	+ "To get and display the oldest employee, Enter 3 \n"
	+ "To get and display all employees of a given gender, Enter 4 \n"
 	+ "To view all Male employees in the Linked List, Enter 5\n"
 	+ "To Exit, Enter 0 \n"
 	+ "Please Enter Your option: ");
      int choice = in.nextInt();
 
     
 switch(choice) {
 
 case 0:
	 break;
 
 case 1:
	 
	 System.out.println("Enter the id, name, gender and age of your employee");
	
	 Employee employee = new Employee(in.nextInt(),in.next(),in.next(),in.nextInt());
	 
	 list.insertAtFront(employee);
	 break;
	 
 case 2:
	 
	 System.out.println("Enter the gender that you want the number of: "); 
	 String gender = in.next();
	System.out.println( "The number is: " + list.countEmployees(gender));
	 break;
	 
 case 3:
	 
	 list.getOldestEmployee().displayEmployeeInfo();
	 break;
	 
 case 4:
	 
	System.out.println("Please enter the desired gender: ");
	String gender1 = in.next();
	list.getEmployees(gender1).display();
	break;
	
 case 5:
	 
	System.out.println("The Male employees are: ");
	 list.getEmployees("Male").display();
	 
	 default:
		 System.out.println("Please enter a valid choice");
	 continue;
 }
	 
 }
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
