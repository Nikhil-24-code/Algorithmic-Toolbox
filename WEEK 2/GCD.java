import java.util.*;

public class GCD {    

	 public static void main(String[] args) {

	        int num1, num2;
	       
	        Scanner scanner = new Scanner(System.in);
	         num1 = (int)scanner.nextInt();
	        
	         num2 = (int)scanner.nextInt();
	        
	        //closing the scanner to avoid memory leaks
	        scanner.close();
	        while (num1 != num2) {
	        	if(num1 > num2)
	                num1 = num1 - num2;
	            else
	                num2 = num2 - num1;
	        }

        System.out.println(num2);
    }
}
