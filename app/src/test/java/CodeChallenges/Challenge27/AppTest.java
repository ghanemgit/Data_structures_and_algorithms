package CodeChallenges.Challenge27;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    @DisplayName("Merge sort Test")
    void mergeSortTest(){

        int[] arr={8,4,23,42,16,15};
        int[] arr1 = {20, 18, 12, 8, 5, -2};
        int[] arr2 = {5, 12, 7, 5, 5, 7};
        int[] arr3 = {2, 3, 5, 7, 13, 11};

        App.mergeSort(arr);
        App.mergeSort(arr1);
        App.mergeSort(arr2);
        App.mergeSort(arr3);




        int[] exp={4,8,15,16,23,42};
        int[] exp1={-2, 5, 8, 12, 18, 20};
        int[] exp2={5, 5, 5, 7, 7, 12};
        int[] exp3={2, 3, 5, 7, 11, 13};

        assertEquals(Arrays.toString(exp), Arrays.toString(arr));
        assertEquals(Arrays.toString(exp1), Arrays.toString(arr1));
        assertEquals(Arrays.toString(exp2), Arrays.toString(arr2));
        assertEquals(Arrays.toString(exp3), Arrays.toString(arr3));



    }


}
