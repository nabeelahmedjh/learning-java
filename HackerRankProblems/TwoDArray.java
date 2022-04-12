package HackerRankProblems;

import java.util.*;
import java.io.*;

public class TwoDArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int hourGlassSum = 0;
        int maxHourGlassSum = -99;
        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        bufferedReader.close();
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                hourGlassSum = arr.get(i - 1).get(j - 1) + arr.get(i - 1).get(j) + arr.get(i - 1).get(j + 1)
                        + arr.get(i).get(j)
                        + arr.get(i + 1).get(j - 1) + arr.get(i + 1).get(j) + arr.get(i + 1).get(j + 1);

                if (maxHourGlassSum < hourGlassSum)
                    maxHourGlassSum = hourGlassSum;

                hourGlassSum = 0;
            }

        }

        System.out.println(maxHourGlassSum);

    }

}
