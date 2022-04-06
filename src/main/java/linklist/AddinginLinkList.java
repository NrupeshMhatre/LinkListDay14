package linklist;

public class AddinginLinkList {
	
	

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
	        if(head == null){
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
	    public static void main(String[] args) {
	    	AddinginLinkList  st = new AddinginLinkList();

	        st.add(70);
	        st.add(30);
	        st.add(56);
	        st.display();

	    }
	}  
        
    

