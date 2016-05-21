import java.util.*;

public class DuplicateCharsInString {
    public static void main(String[] args) {
        DuplicateCharsInString.countDupChars("google");
    }

    public static void countDupChars(String str){
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        
        for(Character ch : chars){
            if(map.containsKey(ch))
                map.put(ch, map.get(ch)+1);
            else
                map.put(ch, 1);
        }

         Set<Character> set = map.keySet();

         for(Character ch : set){
            if(map.get(ch) > 1)
                System.out.println(ch+" ... "+map.get(ch));
         }

         // System.out.println(set);

        // System.out.println(map);
    }

}