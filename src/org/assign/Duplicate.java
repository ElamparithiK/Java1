package org.assign;

public class Duplicate {
	public static void main(String[] args) {
		int a[] = { 10,20,30,40,10,40,20 };
		System.out.println("duplicate elements:");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j])
					System.out.println(a[i]);
			}
		}
	}

}
