package CodeChallenges.Challenge26;


import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        int[] arr = {8,4,23,42,16,15};

        System.out.println(Arrays.toString(insertionSort(arr)));


    }

    public static int[] insertionSort(int[] arr){


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

