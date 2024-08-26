package org;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	arithmetic obj=new arithmetic();
	int a;
do {  
	System.out.print("Enter value of x :");	int x=sc.nextInt();
	System.out.print("ENter value of Y :");  int y=sc.nextInt();
  System.out.println("Press enter 1 for addition--- ");
  System.out.println("Press enter 2 for multiplication--- ");
  System.out.println("Press enter 3 for subtraction--- ");
  System.out.println("Press enter 4 for division--- ");
  System.out.println("Press enter 5 for exit--- ");
  System.out.print("Enter value for given operation :  ");
	 a=sc.nextInt();
  if(a==1) {
	  System.out.println("addition of x and y : "+obj.add(x, y));
  }
  else if(a==2) {
	  System.out.println("Multiplication of x and y : "+obj.multiply(x, y));
  }
  else if (a==3) {
	  System.out.println("Subtraction of x and y : "+obj.sub(x, y));
  }
  else if(a==4) {
	  System.out.println("Divide x from y : "+obj.division(x,y));
  }
  else {
	  System.out.println("----Thanks for using calculator----");
	  break;
  }
}while(a!=5);
	}

}
