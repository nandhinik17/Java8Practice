import java.util.*;

public class ConvertUpperCase {
    public static void main(String[] args) {
    List<String> words = Arrays.asList("java", "c", "python");
    words.stream().map(n -> n.toUpperCase()).forEach(System.out::println);
     
  }
}
