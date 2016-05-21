class Factorial{
	public static void main(String[] args) {
		System.out.println(getFactorial(5));
	}

	public static int getFactorial(int n){
		int fact = 1;
		for(int i=1; i<=n; i++)
			fact = fact*i;
		return fact;
	}
}