import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSeries {
    static class Result{
        public static List<Integer> fibonacciSeries(int seriesLength){
            List<Integer> fibonacci=new ArrayList<>();
            int temp=0;
            for(int i=0;i<seriesLength;i++){
                if(fibonacci.size()>2){
                    temp=fibonacci.get(i-1)+fibonacci.get(i-2);
                    fibonacci.add(temp);
                }
                else
                if(fibonacci.size()==2){
                    fibonacci.add(i-1);
                }
                else{
                    fibonacci.add(i);
                }
            }

            return fibonacci;
        }

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of fibonacci series");
        int seriesLength= sc.nextInt();
        System.out.println(Result.fibonacciSeries(seriesLength));
    }
}