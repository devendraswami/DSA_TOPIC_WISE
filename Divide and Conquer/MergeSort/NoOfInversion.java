public class NoOfInversion {  

    // Here we will calculate the No. of inversion by BruteForce Approach  
    // Time Complexity - O(n^2)
    /*Definition of inversion 
       
       arr[] - {70,50,60,10,20,30,80,15} 
        
       70 - 50,60,10,20,30,15 
       50-  10,20,30,15 
       60 - 10,20,30,15 
       10 - 
       20 - 15 
       30 - 15 
       80 - 15 
       15 - 
       Total No of inversions are 17 
     */ 

      public static int countInversion(int arr[]) {
         
        int count = 0;  
        
        for(int i = 0; i<arr.length; i++) {
            for(int j = i+1; j<arr.length; j++) {
              
                if(arr[i] > arr[j]) {
                    count++; 
                }
            }
        }

        return count; 
      }

    public static void main(String[] args) {
         
        int arr[] = {70,50,60,10,20,30,80,15}; 

        System.out.println("Total Number of Inversion are - " + countInversion(arr));
    }
    
}
