import java.util.*;
import java.io.*;

public class CountWordFromFile{
	public static void main(String[] args) throws Exception{
		System.out.println(countWord("countWord", new File("CountWordFromFile.java")));
	}

	public static int countWord (String word, File file) throws Exception{
		int count = 0;
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()){
			String next = sc.next();
			if(next.equalsIgnoreCase(word))
				count++;
		}

		return count;
	}
}