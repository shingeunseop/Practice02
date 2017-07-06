package com.javaex.practice2;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int div=0;
		int i=sc.nextInt();
		int[] a= {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		
		for(int j=0;j<a.length;j++) {
			div=i/a[j];
			System.out.println(a[j]+"¿ø±Ç:"+div+"°³");
			i=i-(a[j]*div);
		}
		sc.close();
		

	}

}
