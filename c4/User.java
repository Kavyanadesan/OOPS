import java.util.Scanner;
class authException extends Exception
{
public authException(String s) {
super(s);
}
}
public class User
{
public static void main(String[] args) {
System.out.println(&quot;KAVYA V N\n23MCA038\n15/4/2024\n&quot;);
System.out.println();
String username = &quot;student&quot;;
String passcode = &quot;student123&quot;;
String user_name,password;
Scanner sc = new Scanner(System.in);
try
{
System.out.println(&quot;Enter the username:&quot;);
user_name = sc.nextLine();
System.out.println(&quot;Enter the password:&quot;);
password = sc.nextLine();
if(username.equals(user_name) &amp;&amp; passcode.equals(password))
{
System.out.println(&quot;Authentication successful...&quot;);
}
else
throw new authException(&quot; Invalid user credentials &quot;);
}
catch(authException e)
{
System.out.println(&quot;Exception caught &quot;+e);
}
}
}
