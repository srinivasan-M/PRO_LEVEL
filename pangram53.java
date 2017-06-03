import java.util.Scanner;

public class pangram53 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
    	System.out.println("ENTER THE STRING");
   		String s=in.nextLine();
   		char[] c=s.toLowerCase().toCharArray();
   		int flag=1;
   		char[] c1="abcdefghijklmnopqrstuvwxyz".toCharArray();
   		for(int i=0;i<c1.length;i++)
   			{
   			for(int j=0;j<s.length();j++)
   			{
   				if(c1[i]==c[j])
   				{
   					flag++;
   					break;
   				}
   			}
   			}
   		if(flag==27)
   		{
   			System.out.println("PANAGRAM");
   		}
   		else
   		{
   			System.out.println("NOT A PANAGRAM");
   		}

	}

}

