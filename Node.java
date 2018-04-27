
public class Node {
private Employee data;
private Node next;

Node(Employee e){
	data=e;
	next=null;
}

public Employee getData(){
return data;
}

public void setData(Employee e){
	this.data=e;
}

public Node getNext(){
	return next;
}

public void setNext(Node n){
	this.next=n;
}






}
