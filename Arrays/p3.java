package Arrays;

import java.util.*;
public class p3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        //print array
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
        
        
        // largest element in array
        int largest = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("\nLargest element: " + largest);
    }
    
}
