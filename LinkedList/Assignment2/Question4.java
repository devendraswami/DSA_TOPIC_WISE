package Assignment2;

public class Question4 {
      
     public static void main(String[] args) {
        /*Q4. Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
              Input : head = [1,2,2,1]
              Output : true
         */ 
      
         Question4 list = new Question4(); 
         list.addToList(1);
         list.addToList(2); 
         list.addToList(3);
         list.addToList(2);
         list.addToList(1);
          
         boolean palindrome = list.isPalindrome(list); 

         if(palindrome) {
            System.out.println("Given list is Palindrome");
         } else {
            System.out.println("given list in not a Palindrome");
         }
         

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
        while(currNode.next != null) { 
            System.out.print(currNode.data + " -> ");
            currNode= currNode.next; 
        } 
        System.out.println("Null");
        
    }  

    // Reverse List 
      
     public Node reverseSecondHalf(Node head) { 

        Node pre = null; 
        Node curr = head;  

        while(curr != null) { 
         Node nextNode = curr.next; 
         curr.next = pre; 

         pre = curr; 
         curr = nextNode; 
        }  


        return pre; 

     }    
     
     // check the list the palindromic is Or not 

     public boolean isPalindrome(Question4 list) { 
      
        boolean flag = true;  
        
        Node firstHalf = list.head;
        
         Node middle = list.findMiddle();
          
         Node reverseHalf = list.reverseSecondHalf(middle); 

          while(reverseHalf != null)  {
              if(reverseHalf.data != firstHalf.data ) {
                 return false; 
              } 
               reverseHalf = reverseHalf.next; 
               firstHalf = firstHalf.next; 
          }
        

        return flag;
     } 

     public Node findMiddle() {
          
        Node slow = head; 
        Node fast = head;

        while(fast != null && fast.next != null ) {
            slow = slow.next; 
            fast = fast.next.next; 
        } 
        return slow; 

     }

}
