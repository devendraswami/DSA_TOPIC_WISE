 // Here we are going to find the Kth smallest element by QuickSort Algorithm  in  ab Array  
 // We will find it by partition algorith 
 // By taking last element as pivot 

import java.util.Scanner;

public class KthSmallestElement {   

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place the pivot at its right place
        int temp = arr[i + 1];
        arr[i + 1] = pivot;
        arr[high] = temp;

        // return the index of pivot
        return i + 1;
    }

    public static int findSmallest(int arr[], int low, int high, int index) {
        if (low < high) {
            int pidx = partition(arr, low, high);
            if (pidx == index) {
                return arr[pidx];
            } else if (pidx > index) {
                return findSmallest(arr, low, pidx - 1, index);
            } else {
                return findSmallest(arr, pidx + 1, high, index);
            }
        }
        return arr[low]; // If low == high, return the element at the index
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 2, 5, 9, 8, 7 }; 
        
        // Take the input which smallest element you want to find 
         
        Scanner scan = new Scanner(System.in );    
         
        System.out.println("Entere the smallest element which you want to find : "); 

        int n = scan.nextInt();

        int element = findSmallest(arr, 0, arr.length - 1, n - 1);

        System.out.println("The element is : " + element);
    }

    
}
