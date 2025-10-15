import java.util.*;

public class Test   {
  //   @Override
  // public void run(){
  //     System.out.println("run");
  //   }
    public static void main(String[] args) {
    
      MyRunnable t = ()-> System.out.println("Running with Lambda!");
      t.run();
  }
}


@FunctionalInterface  
interface MyRunnable {
    public void run();  
}
