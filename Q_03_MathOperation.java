/*Create a class which contains 2 instance variable a, b.Write instance methods 
 * for finding the sum and difference of 2 variables */
package java_assignment2;

public class Q_03_MathOperation {
	double a, b;

	public void sum(double num1, double num2) {
		a = num1;
		b = num2;
		System.out.println("Addition of " + num1 + " & " + num2 + "=" + (num1 + num2));

	}

	public void difference(double num1, double num2) {
		a = num1;
		b = num2;
		System.out.println("Difference between " + num1 + " & " + num2 + "=" + (num1 - num2));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q_03_MathOperation ob = new Q_03_MathOperation();
		ob.sum(10.5, 0.5);
		ob.difference(20, 5);

	}

}
/*
 * OUTPUT--> Addition of 10.5 & 0.5=11.0 Difference between 20.0 & 5.0=15.0
 */
