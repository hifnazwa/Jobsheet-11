import java.util.Random;
import java.util.Scanner;

public class Quiz14_1 {
    public static void main(String[] args) {
        Random random14 = new Random();
        Scanner input14 = new Scanner(System.in);
         char menu='y'; 
         do{ 
         int number = random14.nextInt(10) + 1; 
         boolean success = false; 
          do { 
          System.out.print("Tebak angka (1-10): "); 
          int answer = input14.nextInt(); 
          input14.nextLine(); 
            if (answer > number) {
                System.out.println("Angka lebih besar dari jawaban");
            } else if (answer < number) {
                System.out.println("Angka lebih kecil dari jawaban");
            }
            success = (answer == number);
          } while(!success); 
          System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?"); 
          menu = input14.nextLine().charAt(0); 
         } while(menu=='y' || menu=='Y'); 
    }
}
