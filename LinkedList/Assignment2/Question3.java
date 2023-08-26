package Assignment2;

public class Question3 {
    public static void main(String[] args) {
        /*Q3. Given the head of a sorted linked list, delete all duplicates such that each element
              appears only once. Return the linked list sorted as well.
              Input :  1->1->2->Null
              Output : 1->2->Null
              */  
              Question3 list = new Question3(); 
              list.addToList(1);
              list.addToList(1);
              list.addToList(2);
              list.addToList(3);
              list.addToList(3);
              list.addToList(3);
             list.addToList(4); 

              list.printList();
              list.deleteDuplicates();
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

      // Delete duplicate from the sorted List 

      public void deleteDuplicates() {  
          
        if(head == null && head.next == null) {
            return; 
        }

        
        Node currNode = head; 
       // Node nextNode = head.next; 

        while(currNode != null && currNode.next != null) {
              if(currNode.data == currNode.next.data) {
                  // Skip the duplicate element 
                  currNode.next = currNode.next.next; 
                  
                
              }  else {
               // update
               currNode = currNode.next;
              }
              
        }

      }

      

}
