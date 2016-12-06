import java.io.*;
class SumNumbers
{
public static void main(String args[])
{
int i,sum=0,sumo=0;
for(i=1;i<=15;i++)
{
sum=sum+i;
}
for(i=15;i<=45;i++)
{
if((i%2)!=0)
{
sumo=sumo+i;
}
}
System.out.println(sum);
System.out.println(sumo);
}
}
