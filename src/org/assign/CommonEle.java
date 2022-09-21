package org.assign;

public class CommonEle {
	public static void main(String[] args) {
		int a1[]= {22,44,66,77,33,88,55,99};
		int a2[]= {55,77,99,11,56,98,45,67};
		System.out.println("common element is:");
		for (int i = 0; i < a1.length; i++) {
	     for (int j = 0; j < a2.length; j++) {
	    	if (a1[i]==a2[j]) {
				System.out.println(a2[j]);
			}
			}
			
		}		
		}
	}


