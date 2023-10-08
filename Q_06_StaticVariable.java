/*write a program to demonstrate static variable*/

package java_assignment2;

public class Q_06_StaticVariable {
	static int count = 0;

	public void StaticVariableIncrement() {
		count++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("For 1st object of class :");
		Q_06_StaticVariable ob1 = new Q_06_StaticVariable();
		System.out.println("Count initial value is :" + Q_06_StaticVariable.count);
		ob1.StaticVariableIncrement();
		System.out.println("After incrementing Count value is : " + Q_06_StaticVariable.count);

		System.out.println("For 2nd object of class :");
		Q_06_StaticVariable ob2 = new Q_06_StaticVariable();
		ob2.StaticVariableIncrement();
		System.out.println("Count value: " + Q_06_StaticVariable.count);

		// NOTE:allowing for the sharing of data and behavior among all objects of a
		// class.

	}

}
/*
 * OUTPUT--> For 1st object of class : Count initial value is :0 
 *After incrementing Count value is : 1 
 *For 2nd object of class : 
 *Count value: 2
 */
