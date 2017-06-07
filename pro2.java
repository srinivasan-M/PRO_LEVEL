import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class pro2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("ENTER THE VALUE");
		int n=in.nextInt();
		String s=String.valueOf(n);
		System.out.println("ENTER THE SIZE TO BE REMOVED");
		int n1=in.nextInt();
		int size=s.length()-n1;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
			if(s.substring(i, j+1).length()==size)
			{
				al.add(Integer.valueOf(s.substring(i, j+1)));
			}
			}
		}
		System.out.print(al.get(0));
		

	}

}
