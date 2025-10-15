import java.util.*;

public class Test   {
  //   @Override
  // public void run(){
  //     System.out.println("run");
  //   }
    public static void main(String[] args) {
    
      Myinterface t = ()-> System.out.println("Running with Lambda!");
      t.run();
      t.testRun();
  }
}



interface Myinterface {
    public void run();  
    default void testRun(){
      System.out.println("This is the defaullt method used in interface---Java 8 feature");
      
    }
}
