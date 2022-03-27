package al;

import java.io.*;

public class baek_1157{
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();		
		int[] arr = new int[26];		
		int max=0; // 가장 많은 알파벳				
		int idx=0; // 가장 많이 나온 알파벳 인덱스 번호
		
		for(int i = 0 ; i < str.length(); i ++)
		{
			int alpha = str.charAt(i);		
			arr[alpha-65]++;		
		}						
		
		for(int i = 0 ; i < arr.length; i ++)	
		{
			if(max < arr[i]) 		
			{
				max = arr[i];		
				idx = i+65;			
			}
			else if(max == arr[i])	
				idx = '?';
		}
		System.out.println((char)idx);		
	}
}