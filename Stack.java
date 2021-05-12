
public class Stack{
    private int arr[];
    private int top;
    private int capacity;

    Stack(int size){
      arr = new int[size];
      capacity = size;
      top = -1;
    }
    public void push(int data){
      if(isFull()){
        System.out.println("It is full!");
        System.exit(1);
      }
      arr[++top] = data;

    }
    public int pop(){
      if(isEmpty()){
        System.out.println("Nothing to pop!");
        System.exit(1);
      }
      return arr[top--];
    }
    public boolean isEmpty(){
      return top == -1;
    }
    public int getSize(){
      return top + 1;
    }
    public boolean isFull(){
      return top == capacity -1;
    }
    public void displayStack(){
      for(int i = 0; i<=top; i++){
        System.out.print(arr[i]);
        if(i < top){
          System.out.print(" , ");
        }
      }
      System.out.println();
    }
    public static void main(String[] args) {
      Stack myStack = new Stack(10);

      myStack.push(2);
      myStack.push(4);
      myStack.push(5);
      myStack.push(7);

      myStack.displayStack();

      myStack.pop();
      myStack.pop();
      myStack.displayStack();
    }
}
