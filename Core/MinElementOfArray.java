import java.util.*;

class MinElementOfArray{
	public static void main(String[] args) {
		
		double a[] = {01, 20, .45, 16, 23, 02};

		double min = a[0];
      	for (int i = 1; i < a.length; i++) {
        	if (a[i] < min) min = a[i];
      	}
      	
      	System.out.println("min is " + min);

	}
}