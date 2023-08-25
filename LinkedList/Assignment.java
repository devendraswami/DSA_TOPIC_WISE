  
  import java.util.*;


class Assignment {
   
    public static void main(String[] args) { 

         //  1.  Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.
         
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(5);
        list.add(7); 
        list.add(3); 
        list.add(8);
        list.add(2); 
        list.add(3);

        System.out.print(list);  
        System.out.println();

        int index = list.indexOf(7);

        if(index != -1) {
            System.out.println("The index of 7 is : " + index);
        } else {
             System.out.println(" The 7 is not present in the list ");
        }
 

     
        // 2.   Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.
         
        System.out.println("Question Number 2 ");
         
        Scanner scan = new Scanner(System.in); 
        LinkedList<Integer> list2 = new LinkedList<Integer>(); 

        System.out.println("Enter the number of elements you want to enter: "); 
        int n = scan.nextInt();  

        System.out.println("Enter numbers in the range of 1-50: ");

        for (int i = 0; i < n; i++) { 
            int num = scan.nextInt(); 
            list2.add(num);
        }
  
        System.out.println("List Entered by the user: " + list2);  
 
        int size = list2.size();  
        System.out.println(size);

        // Iterate in reverse to safely remove elements
        for (int i = size - 1; i >= 0; i--) {
            int num = list2.get(i); 
            if (num > 25) {
                list2.remove(i); 
            }
        } 

        System.out.println("List after removing elements greater than 25: " + list2);
        

    }

}