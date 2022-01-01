import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
     
     int i = 10;
     if(i++ == i){
          System.out.println(i + " is Good");
      }else{
          System.out.println(i + " is Bad");
      }
      int j = 20;
      if(++j == j){
          System.out.println(j + " is Good");
      }else{
          System.out.println(j + " is Bad");
      }
  }
  }
