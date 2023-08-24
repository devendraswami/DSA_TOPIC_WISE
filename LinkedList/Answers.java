  
  import java.util.*;


 //   Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.
 


class Answer {
   
    public static void main(String[] args) {
         
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


    }

}