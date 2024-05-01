public class RemoveLinklist{
public static void main(String[] args){
System.out.println(&quot;KAVYA V N\n23MCA038\n16/4/2024\n&quot;);
System.out.println();
LinkedList&lt;String&gt; L=new LinkedList&lt;&gt;();
L.add(&quot;Gold&quot;);
L.add(&quot;Silver&quot;);
L.add(&quot;Bronze&quot;);
L.add(0,&quot;Olympics Medals&quot;);
System.out.println(L);
L.remove(&quot;Bronze&quot;);
System.out.println(L);
L.remove(2);
System.out.println(L);
L.removeLast();
System.out.println(L);
L.removeFirst();
System.out.println(L);
}
}
