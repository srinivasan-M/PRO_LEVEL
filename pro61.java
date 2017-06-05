import java.util.Scanner;

public class pro61 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s1=in.nextLine();
		String s2=in.nextLine();
		for(int i=0;i<s1.length();i++)
		{
			int a=(int)s1.charAt(i)+10;
			System.out.print((char)a);
		}System.out.print(" ");
		for(int j=0;j<s2.length();j++)
		{
			if(j==0)
			System.out.print(s2.charAt(j));
			else if(j==s2.length()-1)
				System.out.print(s2.charAt(j));
			else if(j==1)
			{
				int b=(int)s2.charAt(j)+10;
				System.out.print((char)b);
			}
			else
			{
				int b=(int)((s2.charAt(j)+10)-26);
				System.out.print((char)b);
			}
			
		}
		

	}

}

