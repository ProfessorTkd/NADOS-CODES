import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here  
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int k = sc.nextInt();
       int temp = n;// temporarily storing the value of n
       int nod = 0;// no. of digits
       while(temp > 0){
           temp = temp / 10;
           nod++;
       }
       k = k % nod;//case3 (k larger than nod)
       if(k < 0){//case2(-ve)
           k = k + nod;
       } 
       int div = 1;
       int mult = 1;
       for(int i = 1; i <= nod; i++){//case1 (+ve)
           if(i <= k){
               div = div * 10;
           }else{
               mult = mult * 10;
           }
       }

       int q = n / div;//extracting the quotient
       int r = n % div;//extracting the remainder
       int rot = r * mult + q;
       System.out.println(rot);
    }
   }
