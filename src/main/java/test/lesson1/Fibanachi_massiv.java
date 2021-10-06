package test.lesson1;

public class Fibanachi_massiv {
    public static void main(String[] args) {
       long [] numbers = fibanachi1(10);
       for(int i = 0; i < numbers.length; i++){
           System.out.println(numbers[i]);
       }
    }
    private static long[] fibanachi1 (int n){
        long[] numbers = new long[n + 1];
        numbers[0]=0;
        numbers[1]=1;
        for(int i = 2; i <= n; i++ ) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        return numbers;
    }
}

