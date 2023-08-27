import java.util.*;

class HashMapFunction {
    public static void main(String[] args) {
         
      HashMap<Integer,String> map = new HashMap<>(); 

      // put() is used to add values to the HashMap

      map.put(1, "Dinesh"); 
      map.put(2,"Devendra"); 
      map.put(3,"Rahul");
      map.put(4,"Anand"); 

      System.out.println(map);

      // get() is used to get the values of given key
       
      System.out.println(map.get(2)); 

      // containsKey() This will result in a boolean value if the given key is present aur not 

      System.out.println(map.containsKey(5));

      // remove()  This is used to remove a key-value pair  from the HashMap

      map.remove(1);
      System.out.println(map); 

      // entrySet() This method is used when we have to iterate through the map using for loop (one by one) 

      for(Map.Entry<Integer,String> ele : map.entrySet()) {
        System.out.println(ele.getKey() + " : " + ele.getValue() );
      } 





      


    }
}