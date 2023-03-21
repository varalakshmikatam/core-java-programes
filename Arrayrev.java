class Arrayrev
{
public static void main(String[]args)
{
int arr[]={2,1,6,7,8,5,4,9};
for(int i=arr.lenth-1;i>=0;i++)
{
if(arr[i]%2!=0)
{
System.out.print(arr[i]);
}
}
}
}