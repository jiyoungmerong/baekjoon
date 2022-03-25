package al;

import java.util.Scanner;

public class baek_1065 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(num(scanner.nextInt()));
	}

	public static int num(int a) {
		int cnt = 0; // 한수 개수

		if (a < 100)
			return a; // 100 이하까지는 모두 등차수열

		else {
			cnt = 99;
			if (a == 1000)
				a = 999;

			for (int i = 100; i <= a; i++) {
				int hun = i / 100; // 백의 자릿수
				int ten = (i / 10) % 10; // 십의 자릿수
				int one = i % 10;

				if ((hun - ten) == (ten - one))
					cnt++;
			}
			return cnt;
		}

	}
}