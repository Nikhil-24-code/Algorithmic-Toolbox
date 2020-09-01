import java.util.*;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return n;

        int previous = 0;
        int current  = 1;
        
        int tmp_previous=0;					
        
        for (int i = 0; i < n - 1; ++i) {
             tmp_previous = (previous+current)%10;
            previous = current;
            current = tmp_previous;
        }
        
		return tmp_previous;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }
}

