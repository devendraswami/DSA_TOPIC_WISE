 



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

    
     
   



    public static void main(String[] args) {
       
      LL list = new LL(); 

      list.addFirst("a");
      list.addFirst("is");
      list.addFirst("This");  

      list.addLast("List"); 

      list.printList();   

      list.reverseIteratively();

      list.printList();   









     




    }
 }