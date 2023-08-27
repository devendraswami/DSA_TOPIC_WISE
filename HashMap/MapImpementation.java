import java.util.*; 

/*
  Map - 1. HashTable  
                       load factor = n/m  n is the no of values present in the hashTable  and m is the size of table 

        2. HashMap - Order of inseration is not preserved 
                     

        3. LinkedHashMap - Order of insertation is preserved 
        4. TreeMap -       gives sorted order on the bases of key 

 */


 class MapImplementation {
    public static void main(String[] args) {
         
        // HashMap implementation 

        HashMap<Integer , String> map = new HashMap<>();  
        map.put(5, "Dinesh"); 
        map.put(7,"Anand"); 
        map.put(3,"Rahul"); 
        map.put(8,"Ravindra"); 
        map.put(4, "Devendra "); 
        map.put(5,"Ram"); 

        System.out.println("Hash Map implementation is : "+map); 

        // LinkedHashMap implementation  


         LinkedHashMap<Integer , String> map1 = new LinkedHashMap<>();  
        map1.put(5, "Dinesh"); 
        map1.put(7,"Anand"); 
        map1.put(3,"Rahul"); 
        map1.put(8,"Ravindra"); 
        map1.put(4, "Devendra "); 
        map1.put(5,"Ram"); 

        System.out.println("LinkedHashMap implementation is : "+map1); 


        // TreeMap implementation 
         

         TreeMap<Integer , String> map2 = new TreeMap<>();  
        map2.put(5, "Dinesh"); 
        map2.put(7,"Anand"); 
        map2.put(3,"Rahul"); 
        map2.put(8,"Ravindra"); 
        map2.put(4, "Devendra "); 
        map2.put(5,"Ram"); 

        System.out.println("TreeMap implementation is : "+map2); 


    }
 }