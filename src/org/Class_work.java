package org;

public class Class_work {

		public static void main(String[] args) {
		/*
			// Operation = Operand + Operator
			
			
			// Arithmatic Operator - arithmetic operation (+, -, *, /, %)
				
				//int result = 0;
				int add = 10 + 20;
				int sub = 20 - 10;
				int mul = 20 * 10;
				int div = 20 / 10;
				int mod = 20 % 2;
				
				
			// Unary Operator - int value increment/decrement (
								// increment add one value to current value 
								// decrement subtract one value from current value )
				int a = 10;
				int b = 0;
				
				// pre increment
				b = ++a;
				
				// post increment
				b = a++;
				
				
			// Assignment Operator (=, +=, -=, *=, /=) 
				
				int x = 100;			// assigning value 10 to variable x
				
				x += 10;				// addition + assignment 
				x -= 10;				// subtraction + assignment 
				
				
			// Relational Operator (>, <, ==, >=, <=, !=)
				
				int ab = 10;
				int bc = 20;
				
				boolean result = ab != bc;			// either greater than or equals to
				
			
			// Logical Operator (AND &&, OR ||, NOT !)
				
				int xy = 10;
				int yz = 20;
				
				boolean greater = xy > yz;			// false
				boolean smaller = xy < yz;			// true
				
				boolean xyz = greater || smaller; 
				boolean abc = greater && smaller;*/
			
				//using loops
				
				int z=0;
				for(int x=1; x<=5; x++, z=0)
				{
					for(int y=1; y<=5-x; y++)
					{
						System.out.print("  ");
					}
					while(z != 2*x-1 ) {
						System.out.print("* ");
						z++;
					}
					System.out.println();
				}
		}

	}

