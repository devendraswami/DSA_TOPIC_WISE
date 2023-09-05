 // Time Complexity = O(nlogn) 
 // spaceComplexity = O(n) 

public class MergeSortAlgorithm {  

    public static void conquer(int arr[] , int si , int mid , int ei) {
     
        int[] merged = new int[(ei-si) + 1];  
        int indx1 = si;
        int indx2 = mid+1; 
        int x = 0;
        
        while(indx1 <= mid && indx2 <= ei) {
             if(arr[indx1] <= arr[indx2] ) {
                  merged[x++] = arr[indx1++];
             } else {
                merged[x++] = arr[indx2++]; 
             }
        }
        
        while(indx1 <= mid) { 
              merged[x++] = arr[indx1++];

        }
         
        while(indx2 <= ei) {
                merged[x++] = arr[indx2++]; 
        } 
  
        for(int i = 0, j = si; i<merged.length; i++,j++) { 
            
            arr[j] = merged[i]; 
        }

    }
     
 
    public static void divide(int arr[] , int si , int ei) {
         
         
        // Base Case when the elements of array becomes single 

        if(si >= ei  ) {
            return ; 
        }



        // Lets find the mid of array and divide it by recursion till the elments of arrays becomes single  

         int mid = si + (ei - si)/2;  

          divide(arr, si , mid); 
          divide(arr,mid+1,ei);  
         
          conquer(arr, si , mid , ei); 

    }


    public static void main(String args[]) {
         
        int arr[] = {6,3,9,5,2,8}; 
        int length = arr.length;   
        int si = 0; 
        int ei = length - 1; 

        divide(arr, si, ei );  

        for(int i = 0; i<arr.length; i++ ) {
            System.out.print(arr[i] + " ");
        }

        

    }
}