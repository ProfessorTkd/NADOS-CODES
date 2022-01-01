import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();

      if(n%3 == 0){
          System.out.println("3k");
      }
      else if(n%3 == 1){
          System.out.println("3k+1");
    }else{
          System.out.println("3k+2");
    }
     
   }
  }
  
