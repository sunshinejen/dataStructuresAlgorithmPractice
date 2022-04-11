/* 
https://leetcode.com/problems/climbing-stairs/ 

*/

package leetcode;

public class climbingStairs {
    class Solution {
        public int climbStairs(int n) {
            if (n <= 2){
                return n;
            }
            int firstStep = 1;
            int secondStep = 2; 
            
            for( int i = 2; i<n; i++){
                int current = firstStep + secondStep;
                firstStep = secondStep;
                secondStep= current; 
                
            }
         return secondStep;   
        }
    } 
}
