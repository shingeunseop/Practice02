package com.javaex.practice2;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
			int total=0;
			int[] arry= new int[5];
			
		for(int j=0;j<arry.length;j++) {
			arry[j]=sc.nextInt();
			total=arry[j]+total;
		}
		System.out.println("평균은 "+total/5+"입니다.");
		
		sc.close();

	}

}
