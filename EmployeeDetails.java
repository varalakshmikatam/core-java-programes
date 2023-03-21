import java.util.*;
class Emp10
{
int id;
String name;
double salary;
String location;
Emp10(int id,String name,double salary,String location)
{
this.id=id;
this.name=name;
this.salary=salary;
this.location=location;
}
}
class EmployeeDetails
{
public static void main(String[]args)
{

int []id={1,2,3,4,5};
String []name={"ab","bc","cd","ef","gh"};
double []salary={10000,20000,40000,60000,50000};
String []location={"hyd","banglore","chennai","hrderabad","hyd"};
List<Emp10> list=new ArrayList<Emp10>();
for(int i=0;i<id.length-1;i++)
{
Emp10 e=new Emp10(id[i],name[i],salary[i],location[i]);
list.add(e);
}
Scanner sc=new Scanner(System.in);
System.out.println("1.display all employee details");
System.out.println("2.display employee details id is 3");
System.out.println("3.display employee details belong to hyderabad");
System.out.println("4.display emp details not belong to hyd and pune");
System.out.println("5.display name of the emp where id=4");
System.out.println("6.display all employee details in reverse order");
System.out.println("7.display all employee salary between 30000 and 40000");
System.out.println("8.check the emp name is harsha is there or not");
System.out.println("9.quit");
System.out.println("enter ur choice");
int ch=sc.nextInt();


if (ch==1)
{
for(int i=0;i<list.size();i++)
{
Emp10 e1=list.get(i);
System.out.println(e1.id+","+e1.name+","+e1.salary+","+e1.location);
}
}


else if(ch==2)
{
for(int i=0;i<list.size();i++)
{
Emp10 e1=list.get(i);
if(e1.id==3)
{
System.out.println(e1.id+","+e1.name+","+e1.salary+","+e1.location);
}
}
}



else if(ch==3)
{
for( int i=0;i<list.size();i++)
{
Emp10 e1=list.get(i);
if((e1.location).equals("hyd"))
{
System.out.println(e1.id+","+e1.name+","+e1.salary+","+e1.location);
}
}
}


else if(ch==4)
{
for( int i=0;i<list.size();i++)
{
Emp10 e1=list.get(i);
if(!((e1.location).equals("hyd"))||((e1.location).equals("pune")))
{
System.out.println(e1.id+","+e1.name+","+e1.salary+","+e1.location);
}
}
}


else if(ch==5)
{
for(int i=0;i<list.size();i++)
{
Emp10 e1=list.get(i);
if(e1.id==4)
{
System.out.println(e1.name);
}
}
}


else if(ch==6)
{
for(int i=list.size()-1;i>=0;i--)
{
Emp10 e1=list.get(i);
System.out.println(e1.id+","+e1.name+","+e1.salary+","+e1.location);
}
}


else if(ch==7)
{
for(int i=0;i<list.size();i++)
{
Emp10 e1=list.get(i);
if(e1.salary<=30000 || e1.salary>=40000)
{
System.out.println(e1.id+","+e1.name+","+e1.salary+","+e1.location);
}
}
}

else if(ch==8)
{
for(int i=0;i<list.size();i++)
{
Emp10 e1=list.get(i);
if(e1.name=="harsha")
{
System.out.println(e1.id+","+e1.name+","+e1.salary+","+e1.location);
}
}
}

else if(ch==9)
{
System.out.print("end");
System.exit(1);
}
else
{
System.out.print("invalid choice");
}
}
}
