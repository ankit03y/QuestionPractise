package arrays;

public class Test3 {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int valley = 0;
        int level = 0;
        for (int i = 0; i < s.length(); i++) {
            char step = s.charAt(i);
            if (step == 'U') {
                level++;
            } else {
                level--;
            }
            if (step == 'U' && level == 0) {
                valley++;

            }
        }

        return valley;


    }
    public static void main(String[] args){
        String input = "UDUUDUDDDUDUUD";
        int valleyCount = countingValleys(input.length(), input);
        System.out.println(valleyCount);
    }
}
