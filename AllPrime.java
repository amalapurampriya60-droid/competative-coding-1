import java.util.*;
import java.lang.*;
class AllPrime{
public static void main(String args[]){
int n,p,j,i;
Scanner sc=new Scanner(System.in);
System.out.println("enter n value");
n=sc.nextInt();
System.out.println("prime number are");
for(i=2;i<=n;i++)
{
p=0;
for(j=1;j<=i;j++)
{
if(i%j==0)
p++;
}
if(p==2)
System.out.println(i);
}
}
}