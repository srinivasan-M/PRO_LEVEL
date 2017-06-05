import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class pro62 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		ArrayList<String> al=new ArrayList<String>();
		ArrayList<Integer> al1=new ArrayList<Integer>();
		String s1=in.nextLine();
		int i1=0;
		for(int i=0;i<=s1.length();i++)
		{
			for(int j=i;j<=s1.length();j++)
			{
				StringBuffer sb=new StringBuffer(s1.substring(i, j));
				sb.reverse();
				String str=new String(sb);
				if(str.equals(s1.substring(i, j)))
				{
					if(str.length()!=1)
					{
						al.add(str);
						al1.add(str.length());
					}
				}
			}
	    }
		Collections.sort(al1);
		int f=al1.get(al1.size()-1);
		int[] gu=new int[i1];
		for(String str1:al)
		{
			if(str1.length()==f)
			{
				System.out.println(str1);
				break;
			}
		  
		}
	}

}
