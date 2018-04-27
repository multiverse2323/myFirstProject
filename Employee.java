
public class Employee {
private int employeeid;
private String name;
private String gender;
private int age;

Employee(int id, String name, String gender, int age) {
	this.employeeid=employeeid;
	this.name=name;
	this.gender=gender;
	this.age=age;
	
}

public String getName(){
	return name;
}

public int getEmployeeId(){
	return employeeid;
}

public String getGender(){
	return gender;
}

public int getAge(){
	return age;
}

public void displayEmployeeInfo(){
	System.out.println(employeeid +" "+ name +" "+ gender +" "+ age);
}

}
