import java.util.Scanner;
class Bill
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.print("enter bill");
double bill=s.nextDouble();
if(bill>=5000)
{
       double discount=(15/100)*bill;
       bill=bill-discount;
}
System.out.println("bill to pay :"+bill);
}
}