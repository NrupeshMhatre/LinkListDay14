package linklist;

public class AscendingOrder {
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

    public void sortList() {
        Node current = head, temp = null;
        int index;
        if (head == null) {
            System.out.println("LinkedList is Empty");
        }
        else {
            while (current != null) {
                temp = current.next;

                while (temp != null) {
                    if (current.data > temp.data) {
                        index = current.data;
                        current.data = temp.data;
                        temp.data = index;
                    }
                    temp = temp.next;
                }
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
    	AscendingOrder as = new AscendingOrder();
        as.add(56);
        as.add(30);
        as.add(40);
        as.add(70);
        as.sortList();
        as.display();
    }

}

