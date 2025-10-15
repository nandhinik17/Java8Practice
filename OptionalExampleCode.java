import java.util.*;
import java.util.stream.Collectors;


public class OptionalExampleCode   {

    public static void main(String[] args) {
    String val= "Nandhini" ;
    Optional<String> value = Optional.ofNullable(val);
    value.ifPresent(v-> System.out.println("Value was "+ v));
    
    String res = value.orElse("Default Value----");
     
      
  }
}


