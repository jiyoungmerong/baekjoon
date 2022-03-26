package al;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class baek_2751 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<num; i++) 
			list.add(Integer.parseInt(br.readLine()));
		
		Collections.sort(list);
		
		for(int a : list)
			sb.append(a).append('\n');
		
		System.out.println(sb);
	}
}