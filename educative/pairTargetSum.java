class PairWithTargetSum {

    public static int[] search(int[] arr, int targetSum) {
      // variables pointer2
      //loop through array 
      // if arr[i] + arr[pointer2] = target -> return and add i & pointer2 (index);
      //if number is greater than target sum -> decrease pointer2 
      // if number is less than targer sum -> continue loop or increament pointer1
      int pointer2 = arr.length-1; 
      int pointer1 = 0; 
  
      while( pointer1 < pointer2){
        int sum = arr[pointer1] + arr[pointer2]; 
        System.out.println(sum);
  
        if(sum == targetSum){
          break;
        } else if( sum > targetSum){
          pointer2--;
        } else if( sum < targetSum){
          pointer1++;
        }
  
      }
      return new int[] {pointer1, pointer2};
    }
  }