import arithmetic.ArithmeticOperations;
import java.util.Scanner;
public class ArithmeticMain {
public static void main(String[] args) {
System.out.println(&quot;KAVYA V N\n&quot;);
System.out.println (&quot;23MCA038\n&quot;);
System.out.println (&quot;09/04/2024\n&quot;);
ArithmeticOperations operations = new ArithmeticOperations();
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter the first number: &quot;);
double num1 = scanner.nextDouble();
System.out.print(&quot;Enter the second number: &quot;);
double num2 = scanner.nextDouble();
System.out.println(&quot;Addition: &quot; + operations.add(num1, num2));
System.out.println(&quot;Subtraction: &quot; + operations.subtract(num1, num2));
System.out.println(&quot;Multiplication: &quot; + operations.multiply(num1, num2));
System.out.println(&quot;Division: &quot; + operations.divide(num1, num2));
}
}
