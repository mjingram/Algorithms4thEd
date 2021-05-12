public class SinglyLinkedListV2{
  class Node{
    int data;
    Node next;

    public Node(int data){
      this.data = data;
      this.next = null;
    }
  }
  //Represent the head and tail
  public Node head = null;
  public Node tail = null;

  //addNode() will add new Node to the LinkedList
  public void addNode(int data){
    Node newNode = new Node(data);

    if(head == null){
      head = newNode;
      tail = newNode;
    }
    else{
      tail.next = newNode;
      tail = newNode;
    }
  }
  public void display(){
    Node current = head;
    if(head == null){
      System.out.println("List is empty");
      return;
    }
    System.out.println("Nodes of singly linked list: ");
    while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
  }
  public static void main(String[] args) {
    SinglyLinkedListV2 sList = new SinglyLinkedListV2();

    sList.addNode(1);
    sList.addNode(2);
    sList.addNode(3);

    sList.display();
  }
}
