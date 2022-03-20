package al;

import java.util.Scanner;

public class baek_17496 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int T = scanner.nextInt();
        int C = scanner.nextInt();
        int P = scanner.nextInt();

        int num = 0;
        int day = 1+T;

        while(day<=N) {
            num+=C;
            day+=T;
        }
        
        System.out.println(num*P);
    }
}