import java.util.Scanner;

public class Main {
   public static void main(String args[]){
      int number;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the required new number ::");
      number = sc.nextInt();
     
      for(int j = 2; j< number; j++) {
         while(number%j == 0) {
            System.out.println(j +" ");
            number = number/j;
         }
      }
      if(number > 2) {
         System.out.println(number);
      }
   }
}
