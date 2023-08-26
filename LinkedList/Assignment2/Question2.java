package Assignment2;

public class Question2 { 

    public static void main(String[] args) {
        
        /*Q2. Insert a node at the given position in a linked list. We are given a pointer to a node, and the
              new node is inserted after the given node.

              Input :   LL = 1 -> 2 -> 4 -> 5 -> 6	pointer = 2	    value =  3.

              Output :  1 -> 2 -> 3 -> 4 -> 5 -> 6     */ 
         
              Question2 list = new Question2(); 
              
              list.addToList(1);
              list.addToList(2);
              list.addToList(4);
              list.addToList(5);
              list.addToList(6);

              list.printList();

              list.insertNode(2, 3); 

              list.printList();




    } 

    // Node creation 

    Node head;  

    class Node {

        int data; 
        Node next; 

        Node(int data) {
            this.data = data; 
            this.next = null; 
        } 

    } 

    // Add Node to the list 

    public void addToList(int data) {

        Node newNode = new Node(data); 

        if(head == null) {
            head = newNode; 
            newNode = head; 
            return; 
        } 

        Node currNode = head; 
        while(currNode.next != null) {
            currNode= currNode.next; 
        } 

        currNode.next = newNode; 
    }

     
    // Print the list 

    public void printList() {
         
          if(head == null) {
            System.out.println("List is empty");
            return; 
        } 

        Node currNode = head; 
        while(currNode != null) { 
            System.out.print(currNode.data + " -> ");
            currNode= currNode.next; 
        } 
        System.out.println("Null");
        
    } 


    // Insert the Node after the Given Node 

    public void insertNode(int pointer , int value) {

         Node newNode = new Node(value); 
         Node preNode = head; 
         Node nextNode = preNode.next; 
        
         while(preNode.data != pointer) {
              preNode = preNode.next; 
              nextNode = nextNode.next; 
         }  
         preNode.next = newNode; 
         newNode.next = nextNode; 
        
    }
 
    
}
