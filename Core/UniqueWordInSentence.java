import java.util.*;
import java.io.*;

public class UniqueWordInSentence{
	public static void main(String[] args) throws Exception{
		Map<String, Integer> map = new HashMap<>();
		System.out.println("enter a sentence");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		// System.out.println(sentence);

		// System.out.println("--------");
		
		String[] sarr = sentence.split(" ");
		for(String s : sarr){
			// System.out.println(s);
			if(map.containsKey(s))
				map.put(s, map.get(s)+1);
			else
				map.put(s, 1);
		}

		System.out.println("unique Words :");

		Set<String> set = map.keySet();
		for(String c : set){
			if(map.get(c) == 1)
				System.out.println(c);
		}

		// System.out.println(map);

	}
}

// "google hello hai hi hi"

/*
	read String
	break into sub-strings (extract words)
	put them into hashMap with key(words) and values(occurance)
	store values in Set
	print values and occurance that is equal to 1. 
*/