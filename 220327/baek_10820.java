package al;

import java.io.*;

public class baek_10820 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = "";

		while ((str = br.readLine()) != null) {
			int arr[] = new int[4];

			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
					arr[0] += 1; // 소문자
				}
				if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
					arr[1] += 1; // 대문자
				}
				if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
					arr[2] += 1; // 숫자
				}
				if (str.charAt(i) == ' ') {
					arr[3] += 1; // 공백
				}
			}
			for (int i : arr) {
				bw.write(i + " ");
			}
			bw.write('\n');
			bw.flush();
		}
	}
}