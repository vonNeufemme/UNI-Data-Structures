import jeliot.io.*;

public class Maximum {
    public static void main() {
    	int i = 20;
    	int j = 15;
    	int k = 10;
    	if (i < j)
    		if (j < k)
    			System.out.println(k);
    		else
    		   	System.out.println(j);
    	else if (i < k)
    		System.out.println(k);
		else
    		System.out.println(i);		
    }
}
