import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hp = new HashMap<>();
        for(int i = 0 ; i<nums.length;i++){
            int curr = nums[i];
            int comp = target - nums[i];
            if(hp.containsKey(comp)){
                int index = hp.get(comp);
                return new int[]{index , i};
            }
            else{
                hp.put(curr,i);
            }
        }
        return new  int[]{-1,-1};
    }
}
