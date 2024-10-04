import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Result{
    public static List<Integer> fibonacciSeries(int seriesLength, List<Integer> fibonacciFirstTwoElements, Boolean isCustomStartingNumbers) {
        List<Integer> fibonacci = new ArrayList<>();
        int temp = 0;
        if (!isCustomStartingNumbers) {
            for (int i = 0; i < seriesLength; i++) {
                if (fibonacci.size() > 2) {
                    temp = fibonacci.get(i - 1) + fibonacci.get(i - 2);
                    fibonacci.add(temp);
                } else if (fibonacci.size() == 2) {
                    fibonacci.add(i - 1);
                } else {
                    fibonacci.add(i);
                }
            }

            return fibonacci;
        }
        else {
            fibonacci.addAll(fibonacciFirstTwoElements);
            for(int i=2;i<seriesLength;i++){
                temp=fibonacci.get(i-1) + fibonacci.get(i-2);
                fibonacci.add(temp);
            }
            return fibonacci;

        }

    }
}
public class FibonacciSeries {


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Do you want to go with custom starting two values with Fibonacci series(Y/N)");
        Boolean customValue=sc.next().equals("Y");
        System.out.println("Enter the length of fibonacci series");
        int seriesLength= sc.nextInt();
        List<Integer> fibonacciSeries= new ArrayList<>();
        if (customValue){
            System.out.println("Enter first two elements of fibonacci series");
            fibonacciSeries=List.of(sc.nextInt(), sc.nextInt());
        }
        System.out.println(Result.fibonacciSeries(seriesLength,fibonacciSeries,customValue));
    }
}