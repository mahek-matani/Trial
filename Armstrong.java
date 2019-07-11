import java.util.Scanner;
public class Armstrong
{
 public static void main(String args[])
 {
  int num , copy , sum=0 , digit;
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter a number : ");
  num=sc.nextInt();
  copy=num;
  while(num!=0)
  {
   digit=num%10;
   sum=sum+(digit*digit*digit);
   num=num/10;
  }
 if(sum==copy)
  System.out.println("Armstrong number");
 else
  System.out.println("Not Armstrong number");
 }
}