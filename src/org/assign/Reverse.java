package org.assign;

public class Reverse {
	public static void main(String[] args) {
		int[] a = new int[] { 111, 222, 333, 444, 555, 666, 777 };
		System.out.println("array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("Reverse array: ");

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
	}

}
