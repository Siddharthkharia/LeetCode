package algorithms.quicksort;

import java.util.Random;

import static algorithms.quicksort.quicksort_implementation.printArray;
import static algorithms.quicksort.quicksort_implementation.quickSortPartition;

public class quickselect_implementation {

    public static void main (String[] args){
        Random rand = new Random();
        int[] arr = new int[10];
        int k = 3;

        for(int i=0; i<arr.length;i++){
            arr[i] = rand.nextInt(100);
        }

        System.out.println("Before :- ");
        printArray(arr);

        System.out.println(k+"th smallest element  :- " + quickselect(arr,k-1));
        System.out.println("Array after :- ");
        printArray(arr);
    }


    public static int quickselect(int[] arr, int k){
        return quickselect(arr,0, arr.length-1,k);
    }


    public static int quickselect(int[] array, int lowIndex, int highIndex, int k){

        if(lowIndex>=highIndex){
            return array[lowIndex];
        }
        int pivot = array[highIndex];
        int leftPointer = quickSortPartition(array, lowIndex, highIndex, pivot);

        if(leftPointer == k){
            return array[leftPointer];
        }else if (leftPointer<k){
            return quickselect(array,leftPointer+1,highIndex,k);
        }else{
            return quickselect(array,lowIndex,leftPointer-1,k);
        }
    }

}
