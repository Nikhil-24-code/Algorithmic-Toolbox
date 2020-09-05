import java.util.Scanner;

public class Change {
	  public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        int M = s.nextInt();
	        Change ob=new Change();
	        int p=ob.getChange(M);
	        System.out.println(p);

	    }	
    int getChange(int m) {
        //write your code here
       int big= 10, medium=5, small=1;
       int coins=0;
       while(m!=0)
       {
    	 if(m>=big)
    	 {
    		 coins++;
    		 m=m-big;
    	 }
    	 else if(m>=medium)
    	 {
    		 coins++;
    		 m=m-medium;
    	 }
    	 else
    	 {
    		 coins=coins+(m/small);
    	      m=0;
       }
       }
        return coins;
    }

  
}

