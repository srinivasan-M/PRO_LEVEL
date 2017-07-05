import java.util.*;
import java.lang.*;
import java.util.ArrayList;
class pro69{
    public static void main(String args[]){
        String s=args[0];
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(char c:s.toCharArray()){
            if(Character.isDigit(c))
            {
                int n=Character.getNumericValue(c);
                al.add(n);
            }
        }
        Collections.sort(al);
        int size=al.size();
        int min=al.get(0);
        int max=al.get(size-1);
        int a=0,b=0;
      for(int i=0;i<size;i++)
        {   int n=al.get(i);
            int p=max*n;
            a=a+p;
        }
       for(int j=0;j<size;j++)
        {   
            int m=al.get(j);
            int q=min+m;
            b=q;
        }
        int sum=process(a);
        int sum1=process(b);
        int o=Math.min(sum,sum1);
        System.out.print(o*o);
    }
        public static int process(int c)
        {
            int d=0;
            while(c>9)
            {
                int s=0;
                while(c>0)
                {
                    int x=c%10;
                    s=s+x;
                    c/=10;
                }
                c=s;
            }
            d=c;
            return d;
        }
}
            
