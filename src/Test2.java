//John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
//
// For example, there are  socks with colors . There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .
//
// Function Description
//
// Complete the sockMerchant function in the editor below. It must return an integer representing the number of matching pairs of socks that are available.
//
// sockMerchant has the following parameter(s):
//
// n: the number of socks in the pile
// ar: the colors of each sock
// Input Format
//
// The first line contains an integer , the number of socks represented in .
// The second line contains  space-separated integers describing the colors  of the socks in the pile.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Test2 {

    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int key = ar[i];
            Integer value = hashMap.get(key);
            if (value == null) {
                hashMap.put(key, 1);
            } else {
                hashMap.put(key, value + 1);
            }

        }
        int numberOfPairs=0;
        for (HashMap.Entry<Integer, Integer> set : hashMap.entrySet()){
            int key = set.getKey();
            int value = set.getValue();
            numberOfPairs = numberOfPairs + value/2;
        }

        return numberOfPairs;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


