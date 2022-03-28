package al;
import java.io.*;
import java.util.Stack;

public class baek_9935 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String bomb = br.readLine();
		String answer = a(str, bomb);
		System.out.println((answer.length() == 0) ? "FRULA" : answer);
	}

	public static String a(String str, String bomb) {
		Stack<Character> stack = new Stack<>();
		int len = bomb.length();

		for (int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
			if (stack.size() >= len) {
				boolean tf = true;
				for (int j = 0; j < len; j++) {
					if (stack.get(stack.size() - len + j) != bomb.charAt(j)) {
						tf = false;
						break;
					}
				}
				if (tf) {
					for (int j = 0; j < len ; j++) 
						stack.pop();
				}
			}
		}
		StringBuilder sb = new StringBuilder();

		for (Character character : stack) 
			sb.append(character);
		
		return sb.toString();
	}
}