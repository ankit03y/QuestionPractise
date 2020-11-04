package arrays;

public class NewTest {

    public static void main(String[] args) {
        // NewTest obj = new NewTest();
        // obj.solution();
    }

     private static void solution(int n) {
        String msg=String.format("value of n: %s", n);
        System.err.println(msg);
        if (n % 2 == 0) {
            if ((n >= 2 && n <= 5) || (n > 20)) {
                System.out.println("Not Weird");
            }
            if(n>=6 && n<=20){
                System.out.println("Weird");

            }
        }
        else {
            System.out.println("Weird");
        }
     }
}


