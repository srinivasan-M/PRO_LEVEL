import java.util.Arrays;
import java.util.Scanner;

public class pro15{

	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
			String s=Integer.toBinaryString(a[i]);
			b[i]=s.length()-s.replaceAll("1","").length();
		}
		int[] c=new int[n];
		System.arraycopy(b,0,c,0,b.length);
		Arrays.sort(b);
		for(int j=n-1;j>=0;j--)
		{
			for(int k=0;k<n;k++)
			{
				if(b[j]==c[k])
				{
					System.out.print(a[k]+" ");
					break;
				}
			}
		}
	}
}





