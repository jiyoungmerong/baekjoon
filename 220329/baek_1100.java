package al;

import java.util.Scanner;
public class baek_1100 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char [][] chess = new char[8][8];
		int num = 0;
		for(int i = 0; i<8; i++) {
			String str = scanner.next();
			for(int j = 0; j<8; j++) {
				chess[i][j] = str.charAt(j);
				
				if ((i + j) % 2 == 0 && chess[i][j] == 'F') {
		            num++;
				}
			}
		}
        System.out.println(num);
	}
}