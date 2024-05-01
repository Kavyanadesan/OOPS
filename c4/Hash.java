import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Hash {
public static void main(String[] args) {
System.out.println(&quot;KAVYA V N\n23MCA038\n16/4/2024\n&quot;);
System.out.println();
Set&lt;Integer&gt; set1 = new HashSet&lt;&gt;();
Set&lt;Integer&gt; set2 = new HashSet&lt;&gt;();
Scanner scanner = new Scanner(System.in);
// Input for Set 1
System.out.print(&quot;Enter the number of elements in Set 1: &quot;);
int numElements1 = scanner.nextInt();
System.out.println(&quot;Enter the elements for Set 1:&quot;);
for (int i = 0; i &lt; numElements1; i++) {
int element = scanner.nextInt();
set1.add(element);
}
// Input for Set 2
System.out.print(&quot;Enter the number of elements in Set 2: &quot;);
int numElements2 = scanner.nextInt();
System.out.println(&quot;Enter the elements for Set 2:&quot;);
for (int i = 0; i &lt; numElements2; i++) {
int element = scanner.nextInt();
set2.add(element);
}
// Comparison
boolean isEqual = set1.equals(set2);
// Output
System.out.println(&quot;Set 1: &quot; + set1);
System.out.println(&quot;Set 2: &quot; + set2);
if (isEqual) {
System.out.println(&quot;Set 1 and Set 2 are equal.&quot;);
} else {
System.out.println(&quot;Set 1 and Set 2 are not equal.&quot;);
}
scanner.close();
}
}
