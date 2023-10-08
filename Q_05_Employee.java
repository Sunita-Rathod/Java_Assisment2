/*Create a class Called Employee , with an ID , name , salary. 
 * The method increseSalary(percent) increament the salary by the given percentage . 
 * Write the Employee class.
 * */
package java_assignment2;

public class Q_05_Employee {
	int ID;
	String name;
	double salary;

	public Q_05_Employee(int ID, String name, double salary) {
		this.ID = ID;
		this.name = name;
		this.salary = salary;
	}

	public void increaseSalary(double percent) {
		if (percent > 0) {
			double increaseAmount = (percent / 100) * salary;
			salary += increaseAmount;
		}
	}

	public void display() {
		System.out.println("Employee ID : " + ID);
		System.out.println("Employee Name : " + name);
		System.out.println("Employee salary : " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q_05_Employee ob = new Q_05_Employee(1, "SUNITA", 45000);
		System.out.println("Employee details before incrementing the Salary-->");
		ob.display();

		System.out.println(" ");

		System.out.println("Employee details After incrementing the Salary by 5% -->");
		ob.increaseSalary(5);
		ob.display();

	}

}
/*
 * OUTPUT--> Employee details before incrementing the Salary--> Employee ID : 1
 * Employee Name : SUNITA Employee salary : 45000.0
 * 
 * Employee details After incrementing the Salary by 5% --> Employee ID : 1
 * Employee Name : SUNITA Employee salary : 47250.0
 */
