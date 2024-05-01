import java.util.Stack;
public class RemoveStack {
public static void removeElementAtPosition(Stack&lt;String&gt; stack, int position) {
if (position &gt;= 1 &amp;&amp; position &lt;= stack.size()) {
Stack&lt;String&gt; tempStack = new Stack&lt;&gt;();
for (int i = 1; i &lt; position; i++) {
tempStack.push(stack.pop());
}
stack.pop();
while (!tempStack.isEmpty()) {
stack.push(tempStack.pop());
}
System.out.println(&quot;Element at position &quot; + position + &quot; removed successfully.&quot;);
} else {
System.out.println(&quot;Invalid position. Please provide a valid position within the stackrange.&quot;);
}
}
public static void main(String[] args) {
System.out.println(&quot;KAVYA V N\n23MCA038\n16/4/2024\n&quot;);
Stack&lt;String&gt; stack = new Stack&lt;&gt;();
stack.push(&quot;Apple&quot;);
stack.push(&quot;Grape&quot;);
stack.push(&quot;Cherry&quot;);
stack.push(&quot;Banana&quot;);
stack.push(&quot;Pappaya&quot;);
int positionToRemove = 3;
System.out.println(&quot;Before removal: &quot; + stack);
removeElementAtPosition(stack, positionToRemove);
System.out.println(&quot;After removal: &quot; + stack);
}
}
