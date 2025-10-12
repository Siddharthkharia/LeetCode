package algorithms.binarySearch;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

import static algorithms.quicksort.quicksort_implementation.printArray;
import static algorithms.quicksort.quicksort_implementation.quicksort;

public class binarySearch {


    public static void main (String[] args){
        Random rand = new Random();
        int[] arr = new int[10];

        for(int i=0; i<arr.length;i++){
            arr[i] = rand.nextInt(10);
        }

        int find = 4;

        System.out.println("Array :- ");
        quicksort(arr);
        printArray(arr);

        System.out.println("index of the element --> " + binarySearch_absolute(arr, find));

        System.out.println("index of the element less than or equal to --> " + binarySearch_FirstLessOrEqual(arr, find));
    }


    public static int binarySearch_absolute(int[] array, int find){
        int left = 0;
        int right = array.length-1;
        int mid=0;
        while (left<=right){
            mid = left + (right-left)/2;
            if (array[mid]==find){
                return mid;
            }
            if(array[mid]<find){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }

    public static int binarySearch_FirstLessOrEqual(int[] array, int find){
        int left = 0;
        int right = array.length-1;
        int mid=0;
        int ans=-1;
        while (left<=right){
            mid = left + (right-left)/2;
            if(array[mid]<=find){
                ans = mid;
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return ans;
    }

}
