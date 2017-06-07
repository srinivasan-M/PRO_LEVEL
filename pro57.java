import java.util.Scanner;

public class pro57 {

	public static void main(String[] args) {
		System.out.println("ENTER STRING 1");
		Scanner in=new Scanner(System.in);
		String s1=in.nextLine();
		int count=0;
		System.out.println("ENTER STRING 2");
		String s2=in.nextLine();
		for(int i=0;i<s2.length();i++)
		{
			for(int j=i;j<s2.length();j++)
			{
				String x=s2.substring(i, j+1);
				if(x.length()>2&&s1.contains(x))
				{
					++count;
					System.out.println("True");
					break;
				}
			}
		}
		if(count==0)
		{
			System.out.print("False");
		}

	}

}
