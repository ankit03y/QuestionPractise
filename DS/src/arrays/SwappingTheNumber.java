package arrays;
import java.util.*;
//There is an array  of numbers.
// Print the first 3 numbers as it is and then swap next two numbers
// and print and again next 3 numbers as it is and so on.

public class SwappingTheNumber {
    public static void main(String[] args) {
        SwappingTheNumber obj = new SwappingTheNumber();
        int[] myArr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,15};
        obj.printArr(myArr);
    }

    public void printArr(int[] arr){
        int c = 1;
        for(int i = 0; i<arr.length; i++){
            if (swappable(c)){
                if(i < arr.length-1) {
                    System.out.println(arr[i+1]);
                }
                System.out.println(arr[i]);
                i=i+1;
            }
            else{
                System.out.println(arr[i]);
                // i=i+1;
            }
            if(c == 4){
               c=1;
            }
            else{
                c++;
            }
        }
    }

    public Boolean swappable(int count){
        if (count == 4){
            return true;

        }
        else{
            return false;
        }

    }
}

