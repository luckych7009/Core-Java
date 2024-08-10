package org;
import java.util.Scanner;
public class Scannerclass {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int lucky[]=new int[6];
		System.out.print("Enter index 0 element : ");lucky[0]=sc.nextInt();
		System.out.print("Enter index 1 element : ");lucky[1]=sc.nextInt();
		System.out.print("Enter index 2 element : ");lucky[2]=sc.nextInt();
		System.out.print("Enter index 3 element : ");lucky[3]=sc.nextInt();
		System.out.print("Enter index 4 element : ");lucky[4]=sc.nextInt();
		System.out.print("Enter index 5 element : ");lucky[5]=sc.nextInt();
	
		int x=5;
		while(x>=0) {
			System.out.println("elements of lucky in decrement order: "+lucky[x]);
			x--;
		}
		
		int y=0;
		do {
			System.out.println("elements of lucky in increment order:"+lucky[y]);
			y++;
		}while(y<=5);
	}

}
