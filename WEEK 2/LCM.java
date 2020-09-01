import java.util.*;

public class LCM {
	static long gcd(long a, long b) 
    { 
    if (a == 0) 
        return b;  
    return gcd(b % a, a);  
    } 
      
   
    static long lcm(long a, long b) 
    { 
        return (a*b)/gcd(a, b); 
    } 
      
    // Driver method 
    public static void main(String[] args)  
    { 
    	Scanner sc= new Scanner(System.in);
        long a= sc.nextInt();
        long b= sc.nextInt();
        System.out.println(lcm(a, b)); 
    } 
} 
