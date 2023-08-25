 



 class LL {  
     
   Node head; 
   private int size; 

    LL() { 
      this.size = 0; 

    }



    class Node {
        
      String data; 
      Node next; 

      Node(String data) {
         this.data = data; 
         this.next = null;  
         size++;
      }


    } 


    // addFirst 

    public void addFirst(String data) {
     
      Node newNode = new Node(data); 

      // check  If the Linked List do exist(before) then Node 
     
      if(head == null) {

         head = newNode; 
         newNode = head; 
         return; 
      }
       
      newNode.next = head; 
      head = newNode; 


    } 


    // add Last   


     public void addLast(String data) {
       
       Node newNode = new Node(data); 

       if(head == null) {
         head = newNode; 
         newNode = head; 
         return; 
       } 

        Node currNode = head; 

        while(currNode.next  != null) {
         
         currNode = currNode.next; 
        } 

        currNode.next = newNode; 

        

     } 

     // Print 

     public void printList() {  

      if(head == null) {
         System.out.println("List is Empty ");
      }


        Node currNode = head; 

        while(currNode != null) {
            
         System.out.print(currNode.data + " -> "); 
         currNode = currNode.next; 
        } 
        
        System.out.print("Null"); 
        System.out.println();

     }  

     
   // Delete first 

     public void deleteFirst() { 
       
         if(head == null) {
            System.out.println("List is empty cann't delete"); 
            return; 
         }  
         
         
         head = head.next;  
         size--; 

     }  


     // delete last 

     public void deleteLast() {
        
      
         if(head == null) {
            System.out.println("List is empty cann't delete"); 
            return;
         } 

             
         size--; 

         // if there is only one node present in the list then Last node will be null and it will show error 
           
         if(head.next == null) {
             head = null; 
             return; 
         }
          
         
         Node secondLast = head; 
         Node lastNode = head.next;         

         while(lastNode.next != null) {
             
            lastNode = lastNode.next; 
            secondLast = secondLast.next;

         }

         secondLast.next = null; 

         
         

     } 

     public int getSize() 
     {
      return size; 
     }
 

     // Reverse a linkelist 

     public void reverseIteratively() { 

      if(head == null || head.next == null) {
        return; 
      }
         
      Node preNode =head;  
      Node currNode = head.next; 
       
      while(currNode != null) {
        Node nextNode = currNode.next; 

          currNode.next = preNode; 


          // update 
            preNode  = currNode; 
           currNode = nextNode;  
          
      } 
     
      head.next = null;  
      head = preNode; 
       

     } 



     public Node reverseListRecursive(Node head) {
      //empty node || last node or only one node
      if(head == null || head.next == null) {
          return head;
      }


      Node newHead = reverseListRecursive(head.next);
     
      head.next.next = head;
      head.next = null;
      return newHead;
  }

    
  // We have to find the middle of the linkedlist if the number is odd then simply return the middle one if the numbers of nodes in the linked list is even the return the second one 
   
 // Two pointer approach 

 public void findMiddle() {
        
  Node slowPtr = head; 
  Node fastPtr = head ;

   while(fastPtr != null && fastPtr.next != null) {
       
     slowPtr = slowPtr.next; 
     fastPtr = fastPtr.next.next; 
   }  

   System.out.println("Middle of the list is : " + slowPtr.data );


 } 



 // Cycle detection in a linkedList  
 //  Floyd's Algorithm 

 public void detectCycle() {
        
  Node slow = head; 
  Node fast = head;   
   int flag = 0; 
  
   while(slow.next != null && fast != null && fast.next != null) {
      
    slow = slow.next; 
    fast = fast.next.next;  

     if(slow == fast) {
         flag = 1;  
         break; 
     }  
   } 

   if(flag != 0) {
       System.out.println("Loop Detected in the List ");
   } else {
    System.out.println("Loop is not detected in the list ");
   }

 }
   



    public static void main(String[] args) {
       
      LL list = new LL(); 

      list.addFirst("a");
      list.addFirst("is");
      list.addFirst("This");  

      //list.addLast("List"); 

      list.printList();   

     // list.reverseIteratively();

      
     // list.findMiddle();   

    // This to crete a cylcle in the linkedList 

    /*  

     Node temp = list.head; 

     while(temp.next != null) {
        temp = temp.next; 
     }  

     temp.next = list.head;   

     */


     list.detectCycle();











     




    }
 }