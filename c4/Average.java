import java.util.Scanner;
class NegException extends Exception{
public NegException(String s){
super(s);
}
}
public class Average {
public static void main(String[] args){
System.out.println(&quot;KAVYA V N\n23MCA038\n15/04/2024\n&quot;);
System.out.println();
int i;
double sum=0,avg=0;
Scanner sc=new Scanner(System.in);
System.out.println(&quot;Enter n numbers:&quot;);
int n=sc.nextInt();
for(i=1;i&lt;=n;i++){
try{
System.out.println(&quot;Enter number&quot;+i);
int a=sc.nextInt();
if(a&lt;0){
i--;
throw new NegException(&quot;Negative numbers not allowed,Try again&quot;);
}
else{
sum=sum+a;
}
}
catch(NegException e){
System.out.println(&quot;NEGETIVE EXCEPTION OCCURED:&quot;+e);
}
}
avg=sum/n;
System.out.println(&quot;Average is &quot;+avg);
sc.close();
}
}
