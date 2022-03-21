package al;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class baek_10814 {
	public static class Person {
		int age;
		String name;

		public Person(int age, String name) {
			this.age = age;
			this.name = name;
		}

		@Override
		public String toString() {
			return age + " " + name + "\n";
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		Person[] arr = new Person[num];

		for (int i = 0; i < num; i++)
			arr[i] = new Person(scanner.nextInt(), scanner.next());

		Arrays.sort(arr, new Comparator<Person>() {
			@Override
			public int compare(Person arr1, Person arr2) {
				return arr1.age - arr2.age;
			}
		});

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < num; i++)
			sb.append(arr[i]);

		System.out.println(sb.toString());
	}
}
