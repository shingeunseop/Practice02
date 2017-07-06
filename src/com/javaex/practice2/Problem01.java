package com.javaex.practice2;

public class Problem01 {

	public static void main(String[] args) {
		
		int[] data= {1,3,5,8,9,11,15,19,18,20,30,33,31};
		int total=0;
		int j=0;
		
		for(int i=0;i<data.length;i++) {
			if(data[i]%3==0) {
				j++;
				total=total+data[i];}			
		}
			System.out.println("주어진 배열에서 3의 배수의 개수=>"+j);
			System.out.println("주어진 배열에서 3의 배수의 합=>"+total);
	}

}
