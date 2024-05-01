import package_graphics.*;
import java.util.Scanner;
public class Area
{
public static void main(String []args)
{
package_graphics testObj = new package_graphics();
int l,h,r,a,c,d;
Scanner s=new Scanner(System.in);
System.out.println(&quot;KAVYA V N\n23MCA038\n09/04/2024&quot;);
System.out.println(&quot;Enter the length for rectangle&quot;);
l=s.nextInt();
System.out.println(&quot;Enter the breadth for rectangle&quot;);
h=s.nextInt();
System.out.println(&quot;Enter the radius of circle&quot;);
r=s.nextInt();
System.out.println(&quot;Enter the side for Square&quot;);
a=s.nextInt();
System.out.println(&quot;Enter the breadth for triangle&quot;);
c=s.nextInt();
System.out.println(&quot;Enter the height for triangle&quot;);
d=s.nextInt();
System.out.println(&quot;Area of rectangle=&quot;+testObj.recArea(l,h));
System.out.println(&quot;Area of circle=&quot;+testObj.cirArea(r));
System.out.println(&quot;Area of square=&quot;+testObj.squArea(a));
System.out.println(&quot;Area of triangle=&quot;+testObj.triArea(c,d));
}
}
