import java.util.Scanner;

public class Square14_2 {
    public static void main(String[] args) {
        Scanner sc14 = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc14.nextInt();
        for (int iOuter=1; iOuter<=N; iOuter++){
           for(int i=0; i<=N; i++) {
            System.out.print("*");
           }
        System.out.println();
        }
    }
}
