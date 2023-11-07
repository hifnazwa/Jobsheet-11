import java.util.Scanner;

public class Triangle14_1 {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc14.nextInt();
        int i = 0;
        while (i <= N) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println(); //Bagian yang perlu ditambahkan
            i++;
        }
    }
}
