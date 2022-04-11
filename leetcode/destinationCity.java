/*
https://leetcode.com/problems/destination-city/
 */
package leetcode;

public class destinationCity {
    class Solution {
        public String destCity(List<List<String>> paths) {
            
            //Map to keep paths organized 
           
             Map<String, String> cityMap = new HashMap<>();
    
            for (List<String> path : paths) {
                //for each loop for <List<String>> 
                //path.get(0), path.get(1) returns below
                //["London","New York"]
                //["New York","Lima"]
                //["Lima","Sao Paulo"]
                //  0          1 
                cityMap.put(path.get(0), path.get(1));
            // cityMap = {New York=Lima, Lima=Sao Paulo, London=New York}
            }
            
            
            String destinationCity = paths.get(0).get(1); 
            //gets element in List at index (0)(1) = New York
            // after 1st iteration of while loop -> destinationCity = Lima 
            // after 2nd iteration of while loop -> destinationCity = Sao Paulo 
            
            while (cityMap.get(destinationCity) != null) { 
                //cityMap.get(key) -> returns value associated with key
                //1st iteration destinationCity= New York , cityMap.get(New York) -> returns Lima
                //2nd iteration destinationCity= Lima, cityMap.get(Lima) -> returns Sao Paulo 
                //3rd iteration destinationCity= Sao Paulo, cityMap.get(Sao Paulo) -> returns null-> exit while loop  
                destinationCity = cityMap.get(destinationCity);
            
            }
            return destinationCity; //destinationCity = Sao Paulo 
            
        }
    }
    
}
