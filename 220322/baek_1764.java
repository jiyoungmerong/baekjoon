package al;

import java.util.*;
public class baek_1764 {
	public static void main(String[] args) {
		Set<String> list = new HashSet<>();
		ArrayList<String> list2 = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt(); // ���� ����
		int num2 =scanner.nextInt(); // ���� ����
		
		for(int i = 0; i<num; i++) {
			String name = scanner.next();
			list.add(name);
		}
		
		for(int i = 0; i<num2; i++) {
			String name = scanner.next();
			if(list.contains(name)) {
				list2.add(name);
			}
		}
		Collections.sort(list2);
		System.out.println(list2.size());

		for(String a : list2) {
			System.out.println(a);
		}
		
	}
}