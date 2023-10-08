/*Write a program to print the area of a rectangle by creating a class named
 * 'Rectangle' having two methods .Constructor takes length and breadth
 *  of as parameter and second method named as 'getArea' returns the area of the rectangle*/
package java_assignment2;

public class Q_04_Rectangle {
	double length, breadth;

	public Q_04_Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public double getArea() {
		return (length * breadth);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q_04_Rectangle ob = new Q_04_Rectangle(2, 4);
		double area = ob.getArea();
		System.out.println("Area of Rectangle: " + area);
	}

}

/*
 * OUTPUT--> Area of Rectangle: 8.0
 */
