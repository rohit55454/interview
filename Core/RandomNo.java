import java.util.*;

class RandomNo{
	public static void main(String[] args) {
		Random r = new Random();
		
		for(int i=0; i<=9; i++)
			System.out.println(r.nextInt());

		System.out.println("----------------------");

		for(int i=0; i<=9; i++)
			System.out.println(Math.random());
	}
}