


/*Q1. Given an integer array, find the kth largest element using the quickselect algorithm.
Input1:
arr[] = {1,3,2,4,5,6,7} , k = 3 
output = 5 

 */ 

public class KthLargestElement {  


    public static int  partition(int arr[], int low , int high) {
         // we are taking last element as pivot 

         int pivot = arr[high]; 
         int i = low-1; 

         for(int j = low; j<high ; j++) {
            if(arr[j] < pivot) { 
                i++; 

                // swap 
                int temp = arr[i]; 
                 arr[i] = arr[j]; 
                 arr[j] = temp; 
            }
         } 
          // increase the value of i 
          i++;  

          // Now put the pivot at its right position 

          int temp = arr[i] ; 
          arr[i] = pivot; 
          arr[high] = temp ; 
          return i ; 
    }

        
    
 public static int findKthLargest(int arr[] , int low , int high, int index) {
       
    if(low < high) { 
        int pidx = partition(arr,low,high); 
        if(pidx == index) {
             return arr[pidx]; 
        } else if(pidx > index) { 
            return findKthLargest(arr,low,pidx-1 , index); 
        } else {
             return findKthLargest(arr,pidx+1, high, index); 
        }
    } 
        return arr[low]; 
 }




     public static void main(String args[]) {
          
         int arr[] = {1,3,2,5,6,7}; 
         int k = 3;  
         int length = arr.length; 

          int element = findKthLargest(arr, 0, arr.length-1 , length-k );  

          System.out.println("The element is : " + element);

     }

}