package al;

import java.util.Scanner;

public class baek_1436 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;
        int i=0;
        while(cnt<n){ 
            i++;
            if(Integer.toString(i).contains("666"))
                cnt++;
        }
        System.out.println(i);
    }
}