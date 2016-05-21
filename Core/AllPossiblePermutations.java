import java.util.*;

class AllPossiblePermutations{
	public static int counter = 0;

	public static void main(String[] args) {
		String str = "1234";
		int sz = str.length();
		int inp[] = new int[sz];

		for(int i=0; i<sz; i++)
			inp[i] = str.charAt(i)-0;

		// counter = 0;
		permute(inp, 0);
		System.out.println(counter+" no. of permutations obtained");
	}

	public static void permute(int[] input, int startindex){
		int size = input.length;
		if(size == startindex + 1){
			System.out.println(counter+" Permutation is");
			for(int i=0; i<size; i++)
				System.out.println(input[i]+" ");

			System.out.println();
			counter++;
		}else{
			for(int i=startindex; i<size; i++){
				int tmp = input[i];
				input[i] = input[startindex];
				input[startindex]= tmp;
				permute(input, startindex + 1);
			}
		}
	}

}