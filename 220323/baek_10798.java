package al;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek_10798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char arr[][] = new char[5][15]; // ���� 5 ���� �ִ� 15
		
		for(int i = 0; i<arr.length; i++) {
			String str = br.readLine();
			
			for(int j = 0; j<str.length(); j++) {
				arr[i][j] = str.charAt(j); // ���ڿ��� �迭�� ����
			}
		}
		
		for(int i = 0; i<15; i++) {
			for(int j = 0; j<5; j++) {
				if(arr[j][i]==' '||arr[j][i]=='\0') { // �����̰ų� null ���̸� continue
					continue;
				}
				else
					System.out.print(arr[j][i]);
			}
		}
	}
}