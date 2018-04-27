
public class LinkedListOfEmployees {
private Node head;



LinkedListOfEmployees(){
	head= null;
}

public void insertAtFront(Employee e){
	Node n = new Node(e);
	n.setNext(head);
	head = n;
}


public void insertAtBack(Employee e){
	Node n = new Node(e);
	
	while(n != null)
	n=n.getNext();
	
	n.setNext(n);
	
	
	
	
}



public int countEmployees(String g) {
	
	int count=0;
	Node cur=head;
	
	while(cur!=null){
		if(cur.getData().getGender().equalsIgnoreCase(g))
		count++;
		cur=cur.getNext();	
	}
	
	return count;
}

public Employee getOldestEmployee(){
	Node cur = head;
	Employee e = cur.getData();
	cur=cur.getNext();
	
	while(cur != null){
		if(cur.getData().getAge()>e.getAge())
			e=cur.getData();
		cur=cur.getNext();
		
	}
	return e;
	
}

public LinkedListOfEmployees getEmployees(String g) {
	
	LinkedListOfEmployees list = new LinkedListOfEmployees();
	
	Node cur= head;
	
	while(cur != null) {
		if(cur.getData().getGender().equalsIgnoreCase(g))
			list.insertAtFront(cur.getData());
		cur = cur.getNext();
	}
	return list;
}

public void splitEmployees(LinkedListOfEmployees male, LinkedListOfEmployees female){
	
	Node cur = head;
	
	while(cur!=null) {
		
		if(cur.getData().getGender().equalsIgnoreCase("Male"))
			male.insertAtFront(cur.getData());
		else
			female.insertAtBack(cur.getData());
		cur =cur.getNext();
		
	}
	
}


public void display(){
	Node cur = head;
	
while(cur!=null) {
cur.getData().displayEmployeeInfo();
cur=cur.getNext();
	
}



}





















}
