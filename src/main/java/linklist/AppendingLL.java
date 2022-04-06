package linklist;

public class AppendingLL {


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

	    
	    public void add(int datac){
	        Node newNode = new AppendingLL.Node(datac);
	        if(head == null){
	            head = newNode;
	            tail = newNode;
	        }
	        else {
	            tail.next = newNode;
	            tail = newNode;
	        }
	    }

	    
	    public void display() {
	        Node current = head;
	        if(head == null) {
	            System.out.println("List is empty");
	        }
	        while (current != null) {
	            System.out.println(current.data);
	            current = current.next;
	        }
	    }

	    public static void main(String[] args) {
	    	AppendingLL  list = new AppendingLL();

	        list.add(56);
	        list.add(30);
	        list.add(70);
	        list.display();

	    }
	}

