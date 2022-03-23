package al;

import java.util.Scanner;

public class baek_2789 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char arr[] = { 'C', 'A', 'M', 'B', 'R', 'I', 'D', 'G', 'E' };
		String str = scanner.next();
		String answer = "";

		for (int i = 0; i < str.length(); i++) {
			boolean tf = true;
			for (int j = 0; j < arr.length; j++) {
				if (str.charAt(i) == arr[j]) {
					tf = false;
					break;
				}
			}
			if (tf)
				answer += str.charAt(i);
		}
		System.out.println(answer);
	}
}