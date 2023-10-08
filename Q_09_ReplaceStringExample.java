/*If string1 ="Hello World" string2= "Java" , check using 
 *string methods ,if 'W' is present in first string . if present ,
 *replace word beginning with W with string2. Output should be "Hello Java"
 */
package java_assignment2;

public class Q_09_ReplaceStringExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string1 = "Hello World";
		String string2 = "Java";

		// Check if 'W' is present in string1
		if (string1.contains("W")) {
			// Replace the word beginning with 'W' with string2
			string1 = string1.replaceFirst("\\bW\\w*", string2);
		}

		System.out.println(string1);
	}
}