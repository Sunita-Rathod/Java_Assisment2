/*Demonstrate methods in String and StringBuilder classes*/
package java_assignment2;

public class Q_08_StringBuilder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Demonstrate methods in the String class
		String str1 = "Hello, ";
		String str2 = "world!";
		String str3 = "Hello, World!";

		// Concatenation using the + operator
		String concatenatedString = str1 + str2;
		System.out.println("Concatenation using + operator: " + concatenatedString);

		// Length of a string
		int strLength = str3.length();
		System.out.println("Length of str3: " + strLength);

		// Substring
		String substring = str3.substring(7);
		System.out.println("Substring of str3: " + substring);

		// Index of a character
		int indexOfW = str3.indexOf('W');
		System.out.println("Index of 'W' in str3: " + indexOfW);

		// Demonstrate methods in the StringBuilder class
		StringBuilder sb = new StringBuilder("StringBuilder ");

		// Append
		sb.append("is a mutable class.");
		System.out.println("Appended StringBuilder: " + sb.toString());

		// Insert
		sb.insert(0, "Java ");
		System.out.println("Inserted StringBuilder: " + sb.toString());

		// Delete
		sb.delete(5, 8);
		System.out.println("Deleted StringBuilder: " + sb.toString());

		// Reverse
		sb.reverse();
		System.out.println("Reversed StringBuilder: " + sb.toString());
	}
}

/*
 * OUTPUT--> Concatenation using + operator: Hello, world! Length of str3: 13
 * Substring of str3: World! Index of 'W' in str3: 7 Appended StringBuilder:
 * StringBuilder is a mutable class. Inserted StringBuilder: Java StringBuilder
 * is a mutable class. Deleted StringBuilder: Java ingBuilder is a mutable
 * class. Reversed StringBuilder: .ssalc elbatum a si redliuBgni avaJ
 */
