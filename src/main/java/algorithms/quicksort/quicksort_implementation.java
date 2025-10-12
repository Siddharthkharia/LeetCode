package algorithms.quicksort;

import java.util.Random;

public class quicksort_implementation {

    public static void main (String[] args){
    Random rand = new Random();
    int[] arr = new int[10];

    for(int i=0; i<arr.length;i++){
        arr[i] = rand.nextInt(100);
    }

        System.out.println("Before :- ");
        printArray(arr);
        quicksort(arr);
        System.out.println("After :- ");
        printArray(arr);
    }

    public static void printArray(int[] array){
        for(int i : array){
            System.out.println(i);
        }
    }

    public static void quicksort(int[] arr){
        quicksort(arr,0,arr.length-1);
    }

    public static void quicksort(int[] array, int lowIndex, int highIndex){

        if(lowIndex>=highIndex){
            return;
        }
        int pivot = array[highIndex];
        int leftPointer = quickSortPartition(array, lowIndex, highIndex, pivot);
        quicksort(array,lowIndex,leftPointer-1);
        quicksort(array,leftPointer+1,highIndex);
    }

    static int quickSortPartition(int[] array, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer<rightPointer){

            while(array[leftPointer]<= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while(array[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }
            swap(array,leftPointer,rightPointer);
        }
        swap(array,leftPointer, highIndex);
        return leftPointer;
    }

    public static void swap(int[] array, int index1, int index2){
        int temp= array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
