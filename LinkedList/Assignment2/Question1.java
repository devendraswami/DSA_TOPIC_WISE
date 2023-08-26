package Assignment2;




  class Question1 {
    public static void main(String[] args) { 


        /*       

Q1. Given a linked list and a key ‘X‘ in, the task is to check if X is present in the linked list or not.
Examples:
14->21->11->30->10, X = 14
Yes
Explanation: 14 is present in the linked list.  



*/




     Question1 list = new Question1(); 
     
     list.AddToList(14);
     list.AddToList(21);
     list.AddToList(11);
     list.AddToList(30);
     list.AddToList(10);

     list.checkIfPreset(14); 




     

        
        
    } 



     

// Node creation 
    Node head; 

    class Node 
    {
        int data;
        Node next; 

        Node(int data)
        {
            this.data = data; 
            this.next = null; 
        } 
    } 
 
    // Add Node to the list 

    public void AddToList(int data)
    {
        Node newNode = new Node(data); 
        if(head == null)
        {
           head = newNode; 
           return; 
        } 

        Node currNode = head; 
        while(currNode.next != null )
        {
            currNode = currNode.next;
        } 
        currNode.next = newNode; 
        newNode.next = null;
    } 
 
    //  Check if the Node is present in the list 

    public void checkIfPreset(int x)
    { 
        boolean flag = false; 
       Node currNode = head;  
       while(currNode != null )
       { 

         if(currNode.data == x)
         {
             flag = true; 
             
         }  

        currNode = currNode.next;
       } 
    
       if(flag == true) 
       {
        System.out.println("Element X is present in the list");
       } 
       else{
        System.out.println("Element X is not present in the list");
       }
           
    }
 



  }