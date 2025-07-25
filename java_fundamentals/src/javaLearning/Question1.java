import java.util.Scanner;

import org.w3c.dom.Node;
class node{
	int data;
	Node next;
	Node(int data);
	this.data=data;
	this.next=null;
}
public class Question1{
	Node head;
	public void insert(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next();
			
		}
		temp.next=newNode;
		
		
	}
	public void display(){
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data + " -> ");
			temp=temp.next();
			}
		System.out.println("null");
		}
public class void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	LinkedList list=new LinkedList();
	System.out.print("enter number of nodes: ");
	int n=sc.nextInt();
	for(int i=0;i<=n;i++) {
		System.out.print("enter data for node "+ i + " : ");
		int data=sc.nextInt();
		list.insert(data);
	}
	System.out.print("LinkedList: ");
	list.display();
	sc.close();
	
	
	
	
}
}