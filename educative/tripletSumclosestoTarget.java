import java.util.*;
/*
Given an array of unsorted numbers and a target number, find a triplet 
in the array whose sum is as close to the target number as possible, return 
the sum of the triplet. If there are more than one such triplet, return the sum of
the triplet with the smallest sum.

Input: [-2, 0, 1, 2], target=2
Output: 1
Explanation: The triplet [-2, 1, 2] has the closest sum to the target.
*/
class TripletSumCloseToTarget {

  public static int searchTriplet(int[] arr, int targetSum) {
      //bug searchTriplet([1, 0, 1, 1], 100)	should return ->3	 but returns->99
      //Input: [0, 1, 1, 1], target=100
    Arrays.sort(arr);
    int p1=0; //0
    int p2=arr.length-1; //3 
    int closeSum = 10000; 

    Map<Integer,Integer> map = new HashMap<>();

    for(int i =0; i< arr.length; i++){
      map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
    }

    while(p1 < p2){
      
      int sum = arr[p1]+ arr[p2]; 
      System.out.println("arr[p1]: " +arr[p1] + " arr[p2]: "+ arr[p2]+" = " + sum );
    

      int z = sum; 
      if( sum < 0 ){
         z = Math.abs(sum);
      }

      if(map.containsKey(z)){
        closeSum= Math.min(targetSum - z, closeSum);
        p2--; 
        p1++; 
       
      } else{
        if( sum < targetSum && p2-1 != p1){ 
          closeSum = Math.min(closeSum, sum+arr[p2-1]);
          System.out.println(sum+arr[p2-1] + " sum of array");
          p1++;
        } else if(sum > targetSum && p1+1 != p2) {
          closeSum = Math.min(closeSum, sum+arr[p1+1]);
          p2--;
        }
        p2--;
        p1++;
      }
    }
    return closeSum;
  }
}