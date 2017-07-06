package com.javaex.practice2;

public class Problem05 {

	public static void main(String[] args) {
		
		int[] arry= new int[6];
		int i=0;
		for(i=0;i<arry.length;i++) {
			arry[i]=(int)(Math.random()*45)+1;
			for(int j=5;j>=1;j--) {
				if(arry[i]==arry[j])
					arry[i]=(int)(Math.random()*45)+1;
				
			}
			System.out.print(arry[i]+" ");
			
		}
		
	}
}
