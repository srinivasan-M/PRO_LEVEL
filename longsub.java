import java.util.*;
class longsub
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
String s=ss.nextLine();
ArrayList<String> al=new ArrayList<String>();
ArrayList<Integer> al1=new ArrayList<Integer>();
for(int i=0;i<s.length();i++)
{
for(int j=i;j<s.length();j++)
{
al.add(s.substring(i,j+1));
}
}
System.out.println(al);
for(String s1:al)
{
al1.add(s1.length());
}
System.out.println("Longest Substring is:"+s);
}
}
