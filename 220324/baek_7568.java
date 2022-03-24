package al;

import java.util.Scanner;

public class baek_7568 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner .nextInt();
		int arr[][] = new int[num][2];
 
		for(int i = 0; i < num ; i++) {
			arr[i][0] = scanner.nextInt(); // ¸ö¹«°Ô
			arr[i][1] = scanner.nextInt(); // Å°
		}

		for(int i = 0; i < num ; i++) {
			int count = 1;
			for(int j = 0; j < num ; j++) {
				if(i == j) 
                    continue;
				if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) 
					count++;
			}
			System.out.print(count + " ");
		}
	}
}