package generics;
public class MyNode <K extends Comparable> implements INode<K>{
    private K key;
    private INode next;

    public MyNode(K key){
        this.key = key;
        this.next = null;
    }
    // Getter and setter
    public K getKey(){
        return key;
    }
    
    public void setKey(K key){
        this.key = key;
    }
   
    public INode<K> getNext(){
        return next;
    }
   
    public void setNext(INode next){
        this.next = (MyNode<K>) next;
    }
}
