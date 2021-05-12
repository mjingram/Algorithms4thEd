import java.util.*;
public class Queue {
  int size;
  int items[];
  int front;
  int rear;
  public Queue(int size){
    this.size = size;
    // System.out.println(size);
    items = new int[size];
    front = -1;
    rear = -1;
  }
  public void enQueue(int data){
    // System.out.println(items.length);
    if(isFull()){
      System.out.println("The Queue is Full!");

    }
    else{
      if(front == -1){
        front = 0;
      }
      rear++;
      items[rear] = data;
      System.out.println("Insert " + data);
    }
  }

  public boolean isFull(){
    if(front == 0 && rear == size-1){
      return true;
    }else{
      return false;
    }
  }
  public boolean isEmpty(){
    if(front == -1){
      return true;
    }
    else{
      return false;
  }}

  public int deQueue(){
    int element;
    if(isEmpty()){
      System.out.println("The Queue is empty");
      return -1;
    }
    else{
      element = items[front];
      if(front >= rear){
      front = -1;
      rear = -1;
      }
      else{
      front++;
      }
    System.out.println(element + " deleted.");
    return element;
  }}
  void display() {
    int i;
    if (isEmpty()) {
      System.out.println("Empty Queue");
    }
    else {
      // display the front of the queue
      System.out.println("\nFront index-> " + front);

      // display element of the queue
      System.out.println("Items -> ");
      for (i = front; i <= rear; i++)
        System.out.print(items[i] + "  ");

      // display the rear of the queue
      System.out.println("\nRear index-> " + rear);
        }
      }
  public static void main(String[] args) {

          // create an object of Queue class
          Queue q = new Queue(7);

          // try to delete element from the queue
          // currently queue is empty
          // so deletion is not possible
          q.deQueue();

          // insert elements to the queue

          for(int i = 1; i < 6; i ++) {
                  q.enQueue(i);
                }


          // 6th element can't be added to queue because queue is full
          q.enQueue(6);

          q.display();

          // deQueue removes element entered first i.e. 1
          q.deQueue();

          // Now we have just 4 elements
          q.display();

        }
}
