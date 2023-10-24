import java.util.ArrayList;
import java.util.List;

class Solution {
  public static List<Integer> fiveSort(List<Integer> array) {
    // todo
    int rightPointer = array.size() -1 ; 
        
        for(int i = 0; i<rightPointer; i++){
            while(array.get(rightPointer)==5){
                rightPointer--; 
            }
            
            if(array.get(i)==5){
                array.set(i, array.get(rightPointer));
                array.set(rightPointer, 5);  
                rightPointer--; 
            }
        }
        return array;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    List<Integer> array = new ArrayList<>(List.of(12,5,1,5,12,7)); 
    List<Integer> arrayTwo = new ArrayList<>(List.of(5, 2, 5, 6, 5, 1, 10, 2, 5, 5)); 
    array = fiveSort(array); 
    arrayTwo = fiveSort(arrayTwo);

    for(Integer num: array){
        System.out.print(num + ", ");
    }

    System.out.println();

    for(Integer num: arrayTwo){
        System.out.print(num + ", ");
    }
  }
}