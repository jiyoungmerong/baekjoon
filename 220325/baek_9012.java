package al;

import java.util.Scanner;
import java.util.Stack;

public class baek_9012 {

	public static String mark(String str) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '(')
				stack.push(c);

			else if (stack.empty())
				return "NO";

			else
				stack.pop();
		}

		if (stack.empty())
			return "YES";

		else
			return "NO";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		for (int i = 0; i < num; i++)
			System.out.println(mark(scanner.next()));
	}
}
