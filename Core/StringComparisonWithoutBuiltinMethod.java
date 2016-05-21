import java.util.*;

class StringComparisonWithoutBuiltinMethod{
	public static void main(String[] args) {
		Boolean flag = false;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter first String : ");
		String s1 = sc.next();
		System.out.println("enter second String : ");
		String s2 = sc.next();

		int sz1 = s2.length();
		int sz2 = s2.length();

		char[] a = new char[50];
		char[] b = new char[50];

		for(int i=0; i<sz1; i++){
			a[i] = s1.charAt(i);
		}

		for(int i=0; i<sz2; i++){
			b[i] = s2.charAt(i);
		}

		for(int i=0; i<sz1; i++){
			if(sz1 != sz2)	break;
			if(a[i] != b[i])	break;
			flag = true;
		}

		if(flag)	System.out.println("Equal");
		if(!flag)	System.out.println("Not Equal");
	}	
}