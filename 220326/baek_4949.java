package al;

import java.io.*;
import java.util.Stack;

public class baek_4949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while(true) {
			String str = br.readLine();
			if(str.equals("."))
				break;

			sb.append(problem(str)).append('\n');
		}
		System.out.println(sb);		
	}
	
	public static String problem(String s) {
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i); 

			if(c == '(' || c == '[') 
				stack.push(c);

			else if(c == ')') {
				if(stack.empty() || stack.peek() != '(') 
					return "no";
				
				else 
					stack.pop();
			}
			
			else if(c == ']') {
				if(stack.empty() || stack.peek() != '[') 
					return "no";
				
				else 
					stack.pop();
			}
		}

		if(stack.empty()) 
			return "yes";
		
		else 
			return "no";
	}
}