import java.util.Random;
import java.util.Scanner;

public class Quiz14 {
    public static void main(String[] args) {
        Random random14 = new Random();
        Scanner input14 = new Scanner(System.in);
         char menu='y' ; 
         do{ 
         int number = random14.nextInt(10) + 1; 
         boolean success = false; 
            do { 
              System.out.print("Tebak angka (1-10): "); 
              int answer = input14.nextInt(); 
              input14.nextLine(); 
              success = (answer == number); 
            } while(!success); 
              System.out.print("Apakah Anda ingin mengulang permainan (y/T)?"); 
              menu = input14.nextLine().charAt(0); 
         } while(menu=='y' || menu=='T'); 
    }
}
