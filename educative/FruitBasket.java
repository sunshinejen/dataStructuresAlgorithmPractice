/*
You are visiting a farm to collect fruits. The farm has a single 
row of fruit trees. You will be given two baskets, and your goal
 is to pick as many fruits as possible to be placed in the given 
 baskets.

You will be given an array of characters where each character 
represents a fruit tree. The farm has following restrictions:

Each basket can have only one type of fruit. There is no 
limit to how many fruit a basket can hold. You can start with 
any tree, but you can’t skip a tree once you have started.
You will pick exactly one fruit from every tree until you 
cannot, i.e., you will stop when you have to pick from a 
third fruit type. Write a function to return the
 maximum number of fruits in both baskets.

Example 1:

Input: Fruit=['A', 'B', 'C', 'A', 'C']
Output: 3
Explanation: We can put 2 'C' in one basket and 
one 'A' in the other from the subarray ['C', 'A', 'C']

*/


class MaxFruitCountOf2Types {
  public static int findLength(char[] arr) {
   int start = 0; 
   int maxLength = 0; 
  
   Map<Character, Integer> map = new HashMap<>();

   for(int end = 0; end < arr.length; end++){
     map.put(arr[end], map.getOrDefault(arr[end], 0) +1); 
     while(map.size() > 2){
       map.put(arr[start], map.get(arr[start])-1);
       if(map.get(arr[start]) == 0){
         map.remove(arr[start]);
       }
       start++; 
     }
     maxLength = Math.max(maxLength, end-start +1);
   }
   return maxLength;
  }
}