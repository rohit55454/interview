import java.util.*;

class MaxElementOfArray{
	public static void main(String[] args) {

		double a[] = {01, 20, 45, 16, 23, 0200};
		
		double max = a[0];
      	for (int i = 1; i < a.length; i++) {
        	if (a[i] > max) max = a[i];
      	}
      	
      	System.out.println("max is " + max);
	}
}