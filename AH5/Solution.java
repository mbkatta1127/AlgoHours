import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static char mostFrequentChar(String s) {
      Map<Character,Integer> hashMap = new HashMap<>();
      
      for(int i = 0; i< s.length(); i++){
        char c = s.charAt(i);
        if(hashMap.containsKey(c)) hashMap.replace(c,hashMap.get(c)+1);
        else hashMap.put(c, 1);
      }

      int frequency = 0; 
      char mostFreqentChar = 0;  
      for(int i = 0; i< s.length(); i++){
        if(hashMap.get(s.charAt(i))>frequency){
          frequency = hashMap.get(s.charAt(i)); 
          mostFreqentChar = s.charAt(i); 
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
