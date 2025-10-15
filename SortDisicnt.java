import java.util.*;
import java.util.stream.Collectors;


public class Test   {

    public static void main(String[] args) {
    
     List<Integer> list = Arrays.asList(5, 2, 0, 10, 10, 100, 100);
     
     List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
     
     List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());
     
     System.out.println(sortedList);
     System.out.println(distinctList);
      System.out.println("Count "+ distinctList.stream().count());
     
      
  }
}


