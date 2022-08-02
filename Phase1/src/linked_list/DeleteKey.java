package linked_list;
class Node {
    int data;
    Node next;
};

class LinkedList {
  Node head;

  LinkedList(){
    head = null;
  }

 
  void push_back(int newElement) {
    Node newNode = new Node(); 
    newNode.data = newElement;
    newNode.next = null;
    if(head == null) {
      head = newNode;
    } else {
      Node temp = new Node();
      temp = head;
      while(temp.next != null)
        temp = temp.next;
      temp.next = newNode;
    }    
  }
  void pop_first(int key) {     
    Node temp = head;
    if(temp != null) {
      if(temp.data == key) {
        Node nodeToDelete = head;
        head = head.next;
        nodeToDelete = null;
      } else {
        while(temp.next != null) {
          if(temp.next.data == key) {
            Node nodeToDelete = temp.next;
            temp.next = temp.next.next;
            nodeToDelete = null;
            break; 
          }
          temp = temp.next;
        }
      }
    }
  } 
  void PrintList() {
    Node temp = new Node();
    temp = this.head;
    if(temp != null) {
      System.out.print("The list contains: ");
      while(temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
      }
      System.out.println();
    } else {
      System.out.println("The list is empty.");
    }
  }    
};
public class DeleteKey {
  public static void main(String[] args) {
    LinkedList MyList = new LinkedList();
    MyList.push_back(10);
    MyList.push_back(20);
    MyList.push_back(30);
    MyList.push_back(10);
    MyList.push_back(20);
    MyList.PrintList();

    

    MyList.pop_first(20);
    MyList.PrintList();    
  }
}