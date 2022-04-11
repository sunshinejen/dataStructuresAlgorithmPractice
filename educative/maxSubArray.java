package educative;
/* 
Given an array of positive numbers and a positive number ‘k,’ find the maximum sum of any contiguous sub-array of size ‘k’.

Example 1:
Input: [2, 1, 5, 1, 3, 2], k=3 
Output: 9
Explanation: Sub-array with maximum sum is [5, 1, 3].
*/




public class maxSubArray {
    public static int findMaxSumSubArray(int k, int[] arr) {
        int sum=0;
        int max=0; 
        int count = 0; 
        int end= 0; 
    
        for( int start= 0; start < arr.length-k; start++){
          while( count != k){
            sum += arr[end];
            end++;
            count++; 
          }
    
          if( sum > max){
            max = sum; 
          } 
          
          sum -= arr[start];
    
          count--;
        }
    
    
        return max;
      }
}
