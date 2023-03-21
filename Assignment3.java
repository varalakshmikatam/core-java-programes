class Assignment3
{
public static void main(String[]agrs)

 int acount=0;
 int bcount=0;
 int amax=0;
 int bmax=0;
String s="aabbaaaab";
for(int i=0;i<s.length();i++)
{
char ch=s.charAt(i);
if(ch=='a'||ch=='b')
{
if(ch=='a')
{
acount=acount+1;
if(acount>amax)
amax=acount;
}
else
acount=0;

if(ch=='b')
{
bcount=bcount+1;
if(bcount>bmax)
bmax=bcount;
}
else
bcount=0;

}

}
if(amax>bmax)
System.out.println("a count is"+amax);
else
System.out.println("b count is"+bmax);
}
}
