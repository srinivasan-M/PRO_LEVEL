import java.util.*;
class pro68
{
public static void main(String args[])
{
ArrayList<String> al=new ArrayList<String>();
String fname=args[0];
String lname=args[1];
al.add(fname);
al.add(lname);
String pin=args[2];
int n=Integer.parseInt(args[3]);
String longer="",smaller="";
Collections.sort(al);
if(fname.length()>lname.length())
{
	longer=fname;
	smaller=lname;
}
else if(lname.length()>fname.length())
{
	longer=lname;
	smaller=fname;
}
else{
	longer=al.get(1);
	smaller=al.get(0);
}
System.out.print(longer.charAt(0)+""+smaller+""+pin.charAt(n-1));
StringBuffer sb=new StringBuffer(pin);
sb.reverse();
System.out.print(sb.charAt(n-1));	
}
}
