class divide21
{
  public static void main(String args[])
  {
	int x=0;
    int sum1=0,sum2=0;
    int[] a=new int[args.length/2];
    int[] b=new int[args.length/2];
  for(int i=0;i<args.length/2;i++)
  {
    a[i]=Integer.valueOf(args[x]);
    sum1=sum1+a[i];
	x++;
  }
    for(int j=0;j<args.length/2;j++)
  {
    b[j]=Integer.valueOf(args[x]);
    sum2=sum2+b[j];
	x++;
  }
    if(sum1==sum2)
    {
      for(int k=0;k<args.length/2;k++)
      {
        System.out.print(a[k]+" ");
      }
	   System.out.print("\n");
      for(int l=0;l<args.length/2;l++)
      {
        System.out.print(b[l]+" ");
      }
    }
  }
}
    
      
      
