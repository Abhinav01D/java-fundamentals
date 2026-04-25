import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer>[] bucket = new List[nums.length+1];
        for(int i:map.keySet()){
            int frequency = map.get(i);
            if(bucket[frequency] == null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(i);
        }
        int[] result = new int[k];
        int counter = 0;
        for(int i = bucket.length-1;i>=0||counter<k;i--){
            if(bucket[i]!=null){
                for(int j : bucket[i]){
                    result[counter] = j;
                    counter++;
                }
                if(counter==k){
                    return result;
                }
            }
        }
        return result;
    }
}
