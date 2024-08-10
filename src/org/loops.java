package org;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[10];
		System.out.println("value is  "+arr[3]);
		arr[0]=10;
		arr[1]=11;
		arr[2]=12;
		arr[3]=13;
		arr[4]=14;
		arr[5]=15;
		arr[6]=16;
		arr[7]=17;
		arr[8]=18;
		arr[9]=19;
		
		int i=0;
		while(i<=9) {
			System.out.println(arr[i]);
			i++;
			
		}
		int b=0;
		do {
			System.out.println("Value :"+arr[b]);
			b++;
		}while(b<=9);
		
	}

}
