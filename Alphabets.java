import java.util.Scanner;
class Alphabets
{
public static void main(String[]args)
{
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("enter alphabet is");
ch=sc.next().charAt(0);
if(ch>='A'&& ch<='Z')
System.out.println("the alphabet upper case ");
else
System.out.println("not");
}
}