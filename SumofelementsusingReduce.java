import java.util.*;

public class SumofelementsusingReduce {
    public static void main(String[] args) {
    List<Integer> num = Arrays.asList(1, 2, 3);
    int sum = num.stream().reduce(0, (a, b)-> a+b);
    System.out.println(sum);
     
  }
}
