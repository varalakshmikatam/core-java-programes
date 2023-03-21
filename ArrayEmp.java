import java.util.*;
class Array
{
int id;
String name;
double salary;
Array(int id,String name,double salary)
{
this.id=id;
this.name=name;
this.salary=salary;
}
}
class ArrayEmp
{
public static void main(String[]args)
{
List<Array> list=new ArrayList<Array>();
Scanner sc=new Scanner(System.in);
while(true)
{
System.out.println("enter emp details");
int a=sc.nextInt();
String b=sc.next();
double sal=sc.nextDouble();
Array e=new Array(a,b,sal);
list.add(e);
System.out.println("do y want to add recors(y/N)");
char ch=sc.next().charAt(0);
if(ch=='n')
{
break;
}
}
System.out.println("enter emp details are");

for (Array arr:list)
{

System.out.println(arr.id+","+arr.name+","+arr.salary);
}
}
}



