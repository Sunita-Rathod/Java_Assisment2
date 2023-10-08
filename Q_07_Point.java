/*Create class Ponit with following instance variable and methods
 * 1] Instance Variable :int x,y
 * 2] Constructor: public Point(), Point(int x, int y)
 * 3]Methods: public void setX(int x) setY(int y), setXY(int x,int y)
 * 4]Create 2 Point objects and compare if the points are overlapping */
package java_assignment2;

public class Q_07_Point {
	int x, y; // instance variable

	public Q_07_Point() // default constructor
	{

	}

	public Q_07_Point(int x, int y) // parameterized constructor
	{

	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Method to check if two points are overlapping
	public boolean isOverlapping(Q_07_Point otherPoint) {
		return this.x == otherPoint.x && this.y == otherPoint.y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Q_07_Point point1 = new Q_07_Point(4, 3);
		Q_07_Point point2 = new Q_07_Point(7, 3);

		// Compare if the points are overlapping
		boolean overlapping = point1.isOverlapping(point2);
		if (overlapping) {
			System.out.println("Points are overlapping!");
		} else {
			System.out.println("Points are NOT overlapping!");
		}
	}
}

/*
 * OUTPUT--> Points are overlapping!
 */
