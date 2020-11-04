package arrays;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        int a;
        int b;
        int answer;
        String operator;


        System.out.print("Enter operator; ");
        operator = sc.nextLine();
        System.out.print("Enter first number: ");
        a= sc.nextInt();
        System.out.print("Enter second number; ");
        b= sc.nextInt();

        if(operator.equals("+")) {
            Addition additionObject = new Addition();
            answer = additionObject.additionAnswer(a, b);
        }
        else if (operator.equals("/")) {

            Division divisionObject = new Division();
            answer = divisionObject.divisionAnswer(a, b);
        }

        else if (operator.equals("*")) {
            Multiplication multiplicationObject = new Multiplication();
            answer = multiplicationObject.multipiliationAnswer(a, b);
        }

        else if (operator.equals("-")) {
            Substraction substractionObject = new Substraction();
            answer = substractionObject.substractionAnswer(a, b);
        }
        else {

            System.out.println("you neeed to choose and operator and numbers");
            answer = 0;
        }
        sc.close();

        int abcd = answer;
        System.out.println("your answer is: "+ abcd);


    }
}

class Addition{
    public int additionAnswer(int a, int b){
        int answer = a + b;

        return answer;
    }
}

class Division{
    public int divisionAnswer(int a, int b){
        int answer = a / b;

        return answer;
    }
}

class Multiplication{
    public int multipiliationAnswer(int a, int b){
        int answer = a * b;

        return answer;
    }
}

class Substraction{
    public int substractionAnswer(int a, int b){
        int answer = a - b;

        return answer;
    }
}