package linklist;

public class DeleteinSeqUc9 {
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

    public void delete(int key){
        Node prev = null;
        Node current = head;

        while (current != null) {
            if (current.data == key) {
                if (current == head) {
                    head = head.next;
                    current = head;
                } else {
                    prev.next = current.next;
                    current = current.next;
                }
            } else {
                prev = current;
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
    	DeleteinSeqUc9 Ds9 = new DeleteinSeqUc9();
        Ds9.add(56);
        Ds9.add(30);
        Ds9.add(40);
        Ds9.add(70);
        Ds9.delete(40);
        Ds9.display();

    }
}

