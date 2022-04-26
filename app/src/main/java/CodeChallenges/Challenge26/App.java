package CodeChallenges.Challenge26;


import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        
        int[] arr = {8, 4, 23, 42, 16, 15};
        int[] arr2 = {20, 18, 12, 8, 5, -2};
        int[] arr3 = {5, 12, 7, 5, 5, 7};
        int[] arr4 = {2, 3, 5, 7, 13, 11};

        System.out.println(Arrays.toString(insertionSort(arr)));
        System.out.println(Arrays.toString(insertionSort(arr2)));
        System.out.println(Arrays.toString(insertionSort(arr3)));
        System.out.println(Arrays.toString(insertionSort(arr4)));



    }

    public static int[] insertionSort(int[] arr) {


        for (int i = 1; i < arr.length; ++i) {
            int j = i - 1;
            int temp = arr[i];


            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }
}

