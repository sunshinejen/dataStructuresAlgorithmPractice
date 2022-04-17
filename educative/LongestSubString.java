class LongestSubstringKDistinct {

    /*Given a string, find the length of the longest substring 
    in it with no more than K distinct characters.
    
    Input: String="araaci", K=2
    Output: 4
    Explanation: The longest substring with no more than '2' 
    distinct characters is "araa".
    */
    public static int findLength(String str, int k) {
  
      int maxLength = 0;  
      int start=0; 
      Map<Character, Integer> map = new HashMap<>();                                            
      for(int end = 0; end < str.length(); end++){
  
        char rightChar = str.charAt(end);
        map.put(rightChar, map.getOrDefault(rightChar, 0)+1);
  
        while(map.size() > k){
          char leftChar = str.charAt(start);
          map.put(leftChar, map.get(leftChar)-1);
          if( map.get(leftChar) == 0){
            map.remove(leftChar);
          }
          start++;
        }
        maxLength = Math.max(maxLength, end- start + 1);
      }
      return maxLength;
    }
  }