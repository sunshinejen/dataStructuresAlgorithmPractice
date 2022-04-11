/*https://leetcode.com/problems/two-sum/ */

package leetcode;

public class twoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            //use pointers to loop through array 
            Map<Integer,Integer> indxs = new HashMap<>();
            
            for(int i = 0; i<nums.length; i++){
                int current = nums[i];
                int x = target - current;
                
                if(indxs.containsKey(x)){
                    return new int[] {indxs.get(x), i};
                }
                indxs.put(current, i);
            }
         
            return null;
        }
    }
}
