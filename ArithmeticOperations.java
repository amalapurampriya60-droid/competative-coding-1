//to find all mathematical operations(+,-,*,/,%)
import java.util.Scanner;
class ArithmeticOperations{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter first number");
double num1=sc.nextDouble();
System.out.println("enter second number");
double num2=sc.nextDouble();
double sum=num1+num2;
double multiplication=num1*num2;
double difference=num1-num2;
if(num2!=0){
double quotient=num1/num2;
double madulo=num1%num2;
System.out.println("addition:"+sum);
System.out.println("multiplication:"+multiplication);
System.out.println("subtraction:"+difference);
System.out.println("division:"+quotient);
System.out.println("modulo division:"+madulo);
}
else{
System.out.println("division:cannot divided by zero");
System.out.println("modulo division:cannot perform modulo by zero");
}
}
}
