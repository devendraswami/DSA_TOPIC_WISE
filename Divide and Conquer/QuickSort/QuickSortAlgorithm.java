 

 // Time complextity wrostCase - O(n^2)    Wrost case pccurs when the pivot is always the smallest aur largest element 
 // Time complexity average - O(nlogn)

public class QuickSortAlgorithm { 

     public static int partition(int arr[], int low , int high) {
         
        int pivot = arr[high];  
         int i = low-1;

        
        for(int j = low; j<high; j++ ) {   // j will be less then high because at high there is pivot 

            if(arr[j] < pivot) {
                i++; 

                // swap 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] =  temp; 
            }

        } 
        i++; 

        // Place the pivot at its right place  
        
        int temp = arr[i]; 
         arr[i] = pivot; 
         arr[high] = temp; 
         
         // return the index of pivot 
        return i; 
     }
      
     public static void quickSort(int arr[] , int low, int high) {
        
        if(low<high) {
        int pidx = partition(arr,low,high); 
         
        quickSort(arr,low,pidx-1); 
        quickSort(arr, pidx+1,high);  
        }
     }

    public static void main(String[] args) {
       
        int arr[] = {6,3,9,5,2,8};   

        

        int high = arr.length - 1; 

        quickSort(arr, 0, high); 

        for(int i = 0; i<= high; i++) {
            System.out.print(arr[i] + " ");
        } 
        System.out.println();


    }
}