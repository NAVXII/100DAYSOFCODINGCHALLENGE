import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        int arrIndex = 0;
        int sum = 0;
        int heighestSum = Integer.MIN_VALUE;

        for (List<Integer> arrayRow : arr) {

            if (arr.size() > arrIndex + 2) {
                for(int arrItem = 0; arrItem < arrayRow.size(); arrItem++) {
                    if (arrayRow.size() > arrItem + 2) {
                        sum = arr.get(arrIndex).get(arrItem)
                                + arr.get(arrIndex).get(arrItem + 1)
                                + arr.get(arrIndex).get(arrItem + 2)
                                + arr.get(arrIndex + 1).get(arrItem + 1)
                                + arr.get(arrIndex + 2).get(arrItem)
                                + arr.get(arrIndex + 2).get(arrItem + 1)
                                + arr.get(arrIndex + 2).get(arrItem + 2);

                        if (sum > heighestSum) {
                            heighestSum = sum;
                        }
                    }
                }

                arrIndex++;
            }

        }

        System.out.println(heighestSum);
        bufferedReader.close();
    }
}
