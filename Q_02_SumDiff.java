/*Create a class which contains static methods for
 *  finding the sum and difference of two numbers */
package java_assignment2;

public class Q_02_SumDiff {

	static void sum(double num1, double num2) {
		System.out.println("Addition of " + num1 + " & " + num2 + "=" + (num1 + num2));

	}

	static void difference(double num1, double num2) {
		System.out.println("Difference between " + num1 + " & " + num2 + "=" + (num1 - num2));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q_02_SumDiff.sum(10, 20.5);
		Q_02_SumDiff.difference(0.5, 6.5);

	}

}
/*
 * OUTPUT--> Addition of 10.0 & 20.5=30.5 Difference between 0.5 & 6.5=-6.0
 */
