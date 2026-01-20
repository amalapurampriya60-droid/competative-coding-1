//To print given number is even or odd
import java.util.Scanner;
class Even
{
public static void main(String args[])
{
int a;
Scanner sc =new Scanner(System.in);
System.out.println("Enter a number");
a=sc.nextInt();
if(a%2==0)
{
System.out.println("the number is even:"+a);
}
else
{
System.out.println("the number is odd:"+a);
}
}
}