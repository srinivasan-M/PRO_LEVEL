import java.util.*; 
public class pro1
 {
 public static void main(String args[])
{ 
Scanner ss=new Scanner(System.in); 
int n=ss.nextInt();
int j;
String s[]=new String[n];
 for(j=0;j<n;j++) 
{ 
s[j]=ss.next();
}
String c=" ",ch;
 if(s.length>0) 
c=s[0];
 for(int i=1;i<s.length;i++)
 {
 ch=s[i];
 for(j=0;j<Math.min(c.length(),s[i].length());j++)
 {
 if(c.charAt(j)!=ch.charAt(j))
 break;
 }
 c=s[i].substring(0,j);
 }
 System.out.println("Longest prefix is:"+c); 
}
 }
