package al;

import java.util.Scanner;

public class baek_1065 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(num(scanner.nextInt()));
	}

	public static int num(int a) {
		int cnt = 0; // �Ѽ� ����

		if (a < 100)
			return a; // 100 ���ϱ����� ��� ��������

		else {
			cnt = 99;
			if (a == 1000)
				a = 999;

			for (int i = 100; i <= a; i++) {
				int hun = i / 100; // ���� �ڸ���
				int ten = (i / 10) % 10; // ���� �ڸ���
				int one = i % 10;

				if ((hun - ten) == (ten - one))
					cnt++;
			}
			return cnt;
		}

	}
}