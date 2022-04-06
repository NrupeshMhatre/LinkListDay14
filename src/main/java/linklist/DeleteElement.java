package linklist;

public class DeleteElement {


	    public Node head;
	    public Node tail;
	    static class Node {
	        int data;
	        Node next;

	        Node(int d) {
	            data = d;
	            next = null;
	        }
	    }

	    
	    public void add(int datas){
	        Node newNode = new Node(datas);
	        if(head == null) {
	            head = newNode;
	            tail = newNode;
	        }
	        else {
	            newNode.next = head;
	            head = newNode;
	        }
	    }

	   
	    public void display() {
	        Node current = head;
	        if(head == null) {
	            System.out.println("List is empty");
	        }
	        while (current != null) {
	            System.out.println(current.data +" ");
	            current = current.next;
	        }
	    }

	    
	    public void pop(){
	        Node current = head;
	        if(current == head){
	            head = head.next;
	            current = head;
	        }
	    }

	    public static void main(String[] args) {
	    	DeleteElement list = new DeleteElement ();

	        list.add(70);
	        list.add(30);
	        list.add(56);
	        list.pop();
	        list.display();
	    }
	}

