class SortedArraySquares {

    public static int[] makeSquares(int[] arr) {
        int[] squares = new int[arr.length];
       // Given a sorted array, create a new array containing squares of all the numbers of the input array in the sorted order.
      // [-2, -1, 0, 2, 3] -> [4, 1, 0, 4, 9]. 
      //get last number 3-> 9 | -1 -> 1 
      //get first number -2 -> 4 | 2 -> 4| 0
      //add the biggest to the end of the new array
      // if last pointer2 --; if pointer1 ++
  
      int p1=0;
      int p2 = arr.length-1;
      int index = squares.length-1;
  
      while(p1 <= p2){
        int num1 = arr[p1]*arr[p1];  
        int num2 = arr[p2]*arr[p2]; 
  
        if(num2 > num1){
          squares[index]= num2;
          p2--;
          index--;
        } else{
          squares[index]=num1;
          p1++;
          index--;
        }
  
      }
  
      return squares;
    }
  }
