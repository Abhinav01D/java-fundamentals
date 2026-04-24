import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String ,List<String>> map = new HashMap<>();
        for(String s :strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String st = new String(ch);
            map.computeIfAbsent(st, f-> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
