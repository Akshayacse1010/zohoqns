import java.util.*;
//https://leetcode.com/problems/group-anagrams/
public class Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s:  strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sw = new String(c);
            if(!map.containsKey(sw)){
                map.put(sw , new ArrayList<>());
            }
            map.get(sw).add(s);
        }
        return new ArrayList<>(map.values());

    }
}