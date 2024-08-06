package org;
import java.util.Scanner;
public class Operators {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
// Using arithmetic operators(+,-,%,*,/)
		int a=50;
		int b=40;
		int addition = a+b;System.out.println("Addition of a and b: "+addition);
		int subtraction = b-a;System.out.println("Subtraction a from b :"+subtraction );
		int c=2;
		int multiplication=a*b*c;System.out.println("Multiplication of a,b and c : "+multiplication);
		int division = a/c;System.out.println("Division of a by c : "+division);
		int modulus=a%b;System.out.println("modulus of a%b : "+modulus);//it gives remainder value 
//Using unary operator(++,--)
		int num1=2;
		int num2=num1++;// Using num1++, means to assign num1 value to num2 first then increment by 1 in num1 value
		System.out.println("Value of num2: "+num2);
		int num3=5;
		int num4=++num3;// Using ++num3, means to increment value first by 1 in num3 then assign it to num4
		System.out.println("Value of num4: "+num4);
		int x=15;
		int y=x--;
		System.out.println("value of x : "+x);
		int z=y--;
		System.out.println("value of y :"+y);
//Using assignment operator(=,+=,-=,*=,/=)
		int M=90;
		M += 10;System.out.println("Updated value of M : "+M);
		int N=50;
		N -=40;System.out.println("Value of N : "+N);
		int O=250;
		O *=5;System.out.println("Value of O : "+O);
		int P=50;
		P /=2;System.out.println("Value of P : "+P);
//Using relational operator(>,<,==,>=,<=,!=)	
		System.out.print("Enter value of n1 : ");int n1=sc.nextInt();
		System.out.print("Enter value of n2 : ");int n2=sc.nextInt();
		boolean result =n1>n2;System.out.println("n1 is greater than n2 : "+result);
		boolean result_2=n1>=n2;System.out.println("n1 is greater than or equal to n2  : "+result_2);
		boolean result_3=n1==n2;System.out.println("n1 is equal to n2 : "+result_3);
		boolean result_4=n1<=n2;System.out.println("n1 is less than or equal to n2 : "+result_4);
		boolean result_5=n1 !=n2;System.out.println("n1 is not  equal to n2 : "+result_5);
//using Logical operator("&&,||,!)	
		System.out.print("Enter number of sub1 : ");float sub1=sc.nextFloat();
		System.out.print("Enter number of sub2 : ");float sub2=sc.nextFloat();
		System.out.print("Enter number of sub3 : ");float sub3=sc.nextFloat();
		boolean check=sub1>sub2 && sub2>sub3;System.out.println("we check given condition sub1>sub2  && sub2>sub3 :"+check);
		boolean check_next=sub1!=sub2 || sub2>=sub3;System.out.println("we check given condition sub1!=sub2  || sub2>=sub3 :"+check_next);
		
		
		
	}

}
