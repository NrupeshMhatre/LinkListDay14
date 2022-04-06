package linklist;

public class InsertSeqUc8 {
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
            tail.next = newNode;
            tail = newNode;
        }
    }

    
    public void insert(int c){
        Node newNode = new Node(c);
        Node temp = head;
        boolean b = true;
        while(b) {
            if(temp.data == 30){
                newNode.next = temp.next;
                temp.next=newNode;
                break;
            }
            temp = temp.next;
            b =true;
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
    	InsertSeqUc8 IsU = new InsertSeqUc8();

        IsU.add(56);
        IsU.add(30);
        IsU.add(70);
        IsU.insert(40);

        IsU.display();
    }
}
