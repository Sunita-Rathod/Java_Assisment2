/*Create a Class named 'Employee' with String variable 'name' 
and integer variable 'id' . Create two objects with id and 
name initialized and print these details*/

package java_assignment2;

public class Q_01_Employee { // Class
	String name;
	int id;

	public Q_01_Employee(String name, int id) // Parameterized Constructor of Class
	{
		this.name = name;
		this.id = id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Employee 1 Deatails
		System.out.println("Employee 1 Deatails: ");
		Q_01_Employee ob1 = new Q_01_Employee("Sunita", 4786);
		System.out.println("Employee name is " + ob1.name + " having ID: " + ob1.id);
		// Employee 2 Deatails
		System.out.println("Employee 2 Deatails: ");
		Q_01_Employee ob2 = new Q_01_Employee("Rathod", 4568);
		System.out.println("Employee name is " + ob2.name + " having ID: " + ob2.id);
	}

}
/*
 * OUTPUT--> Employee 1 Deatails: Employee name is Sunita having ID: 4786
 * Employee 2 Deatails: Employee name is Rathod having ID: 4568
 */