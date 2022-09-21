package org.assign;

public class DuplicateStr {
	public static void main(String[] args) {
		String a[] = {"Ram","Sam","Tom","Mass","Tom","Ram","CSK" };
	System.out.println("Duplicate String in Array:");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i]==a[j])
					System.out.println(a[i]);
}
}
	}	}