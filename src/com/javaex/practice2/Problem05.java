package com.javaex.practice2;

public class Problem05 {

	public static void main(String[] args) {
		
		int[] arry= new int[6];
		int i=0;
		for(i=0;i<arry.length;i++) {
			arry[i]=(int)(Math.random()*45)+1;
			for(int j=1;j<i;j++) {
				if(arry[i]==arry[j])
					while(true){
					arry[i]=(int)(Math.random()*45)+1;
					if(arry[i]!=arry[j])
						break;
					}
			}
			System.out.print(arry[i]+" ");
			
		}
		
	}
}
