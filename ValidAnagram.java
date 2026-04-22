import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hp = new HashMap<>();

        if(s.length()!=t.length()){
            return false;
        }

        for(int i = 0 ;i<s.length();i++){
            char c = s.charAt(i);
            hp.put(c,hp.getOrDefault(c,0)+1);
        }

        for(int i = 0 ;i<t.length();i++){
            char c = t.charAt(i);
            if(!hp.containsKey(c) || hp.get(c) == 0){
                return false;
            }

            hp.put(c , hp.get(c)-1);
        }

        return true;
    }
}
