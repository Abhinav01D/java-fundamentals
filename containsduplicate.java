import java.util.HashSet;
import java.util.Set;

public class containsduplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set1 = new HashSet<>();
        for(int i : nums){
            if(set1.contains(i)){
                return true;
            }
            set1.add(i);
        }
        return false;
    }
}

