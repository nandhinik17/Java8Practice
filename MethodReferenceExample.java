import java.util.*;
import java.util.stream.Collectors;


public class Methodref   {

    public static void main(String[] args) {
      //ClassName::methodName

    Runnable r =methodReference::referenceTest;
    r.run();
 
     
      
  }
}

public class methodReference {
  
  public static void referenceTest(){
    System.out.println("Reference Method Example...");
  }
}


