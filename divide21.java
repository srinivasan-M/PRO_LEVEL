class divide21
{
  public static void main(String args[])
  {
    int sum1=0,sum2=0;
    int[] a=new int[args.length/2];
    int[] b=new int[args.length/2];
  for(int i=0;i<args.length/2;i++)
  {
    a[i]=Integer.valueOf(args[i]);
    sum1=sum1+a[i];
  }
    for(int j=args.length/2;j<args.length;j++)
  {
    b[j]=Integer.valueOf(args[j]);
    sum2=sum2+a[j];
  }
    if(sum1==sum2)
    {
      for(int k=0;k<args.length/2;k++)
      {
        System.out.print(a[k]+" ");
      }
      for(int l=0;l<args.length/2;l++)
      {
        System.out.print(b[l]+" ");
      }
    }
  }
}
    
      
      
