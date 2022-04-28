package CodeChallenges.Challenge28;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        int[] arr = {8,4,23,42,16,15};
        int[] arr2 = {20,18,12,8,5,-2};
        int[] arr3 = {5,12,7,5,5,7};
        int[] arr4 = {2,3,5,7,13,11};


        System.out.println("Before Sort -> "+ Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println("After Sort -> "+Arrays.toString(arr));
        System.out.println("************************************");
        System.out.println("Before Sort -> "+Arrays.toString(arr2));
        quickSort(arr2,0,arr.length-1);
        System.out.println("After Sort -> "+Arrays.toString(arr2));
        System.out.println("************************************");
        System.out.println("Before Sort -> "+Arrays.toString(arr3));
        quickSort(arr3,0,arr.length-1);
        System.out.println("After Sort -> "+Arrays.toString(arr3));
        System.out.println("************************************");
        System.out.println("Before Sort -> "+Arrays.toString(arr4));
        quickSort(arr4,0,arr.length-1);
        System.out.println("After Sort -> "+Arrays.toString(arr4));
    }

    public static int[] quickSort(int[] arr, int left, int right){
        int position;

        if (left<right){

            position = partition(arr,left,right);
            quickSort(arr,left,position-1);
            quickSort(arr,position+1,right);

        }

        return arr;
    }

    public static int partition(int[] arr, int left, int right){

        int pivot,low;

        pivot = arr[right];
        low = left-1;

        for (int i = left; i <=right ; i++) {

            if (arr[i]<pivot){
                low++;
                swap(arr,i,low);
            }
        }
        swap(arr,right,low+1);
        return low+1;
    }

    public static void swap(int[] arr, int i, int low){
        int temp;

        temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;
    }

}
