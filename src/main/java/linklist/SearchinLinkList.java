package linklist;

public class SearchinLinkList {
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
    
    public int search(int element) {
        if (head == null) {
            return -1;
        }
        int ind = 0;
        Node temp = head;

        while (temp != null) {
            if (temp.data == element) {
                return ind;
            }
            ind++;
            temp = temp.next;
        }
        return -1;
    }

    public static void main(String[] args) {
    	SearchinLinkList  Sll = new  SearchinLinkList();

        Sll.add(56);
        Sll.add(30);
        Sll.add(70);

        int Searchelement = 56;
        int ans = Sll.search(Searchelement);
        if (ans == -1) {
            System.out.println("Element not found in the Linked List");
        }
        else
            System.out.println("Element found in the Linked List at "+ans);
    }
}