package educative;
class MinSizeSubArraySum {
    
  
/* Given an array of positive numbers and a positive number ‘S,’ find the length of
 //the smallest contiguous sub-array whose sum is greater than or equal to ‘S’. Return 0 
  //no such sub-array
 
Example 1:
Input: [2, 1, 5, 2, 3, 2], S=7 
Output: 2
Explanation: The smallest sub-array with a sum greater than or equal to '7' is [5, 2].
 
*/
  public static int findMinSubArray(int S, int[] arr) {
    int start=0; 
    int minLength= arr.length; 
    int length = 0;
    int sum = 0; 

    for( int end =0; end < arr.length; end++){ 
      sum += arr[end];                               

      while( sum >= S){ 
        length = end- start + 1; 
        sum -= arr[start]; 
        start++; 
        
        if( length < minLength ){
          minLength = length; 
        }

      }

    }
    return minLength;
  }
}


