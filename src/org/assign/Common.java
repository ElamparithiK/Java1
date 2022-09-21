package org.assign;

public class Common {
	public static void main(String[] args) {
		String s1[] = {"Elam","Sam","Tom","Ram","Mass" };
		String s2[]= {"Sam","Ram","Mass","Vasa","Dina"};
		System.out.println("Common String is:");
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i].equals(s2[j])) {
					System.out.println(s1[i]);

				}
			}

		}
	}

}
