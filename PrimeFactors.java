import java.util.Scanner;

public class Main {
   public static void main(String args[]){
      int num;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the required new number ::");
      num = sc.nextInt();
     
      for(int j = 2; j< num; j++) {
         while(num%j == 0) {
            System.out.println(j +" ");
            num = num/j;
         }
      }
      if(num > 2) {
         System.out.println(num);
      }
   }
}
