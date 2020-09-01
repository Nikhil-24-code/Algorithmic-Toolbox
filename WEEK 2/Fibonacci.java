import java.util.Scanner;
class Fibonacci { 

	
	static int fib(int n) 
	{ 

		int fi[] = new int[n + 2]; 

		int i; 

		fi[0] = 0; 
		fi[1] = 1; 

		for (i = 2; i <= n; i++) { 

			
			fi[i] = fi[i - 1] + fi[i - 2]; 
		} 

		// Nth Fibonacci Number 
		return fi[n]; 
	} 

	public static void main(String args[]) 
	{ 
		
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt(); 
		
		
			System.out.print(fib(N) ); 
	}
} 
