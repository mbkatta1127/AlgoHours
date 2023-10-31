import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static char mostFrequentChar(String s) {
      Map<Character,Integer> hashMap = new HashMap<>();
      
      //Add letters into hashmap w/ frequency 
      for(int i = 0; i< s.length(); i++){
        char c = s.charAt(i);
        if(hashMap.containsKey(c)) hashMap.replace(c,hashMap.get(c)+1);
        else hashMap.put(c, 1);
      }

      //Iterate over string to get the most frequent letter 
      int frequency = 0; 
      char mostFreqentChar = 0;  
      for(int i = 0; i< s.length(); i++){
        char c = s.charAt(i);
        if(hashMap.get(c)>frequency){
          frequency = hashMap.get(c); 
          mostFreqentChar = c; 
        }
      }
      
      return mostFreqentChar;
    }
  
    public static void main(String[] args) {
      // Try out your test cases:
      System.out.println(Solution.mostFrequentChar("bookeeper")); // -> 'e'
      System.out.println(Solution.mostFrequentChar("david")); // -> 'd'
      System.out.println(Solution.mostFrequentChar("mississippi")); // -> 'i'
      System.out.println(Solution.mostFrequentChar("eleventennine")); // -> 'e'
    }

  }
