package HackerRankProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        int negativeSum = 0;
        Scanner scan = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4 };
        List<List<Integer>> subArrays = new ArrayList<>();

        List<Integer> tempSubArray = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                tempSubArray.add(arr[j]);

                subArrays.add(new ArrayList<>(tempSubArray));

                if (j == arr.length - 1) {
                    tempSubArray.clear();
                }
            }
        }

        System.out.println(subArrays);
    }
}
