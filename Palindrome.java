public class Palindrome
{
public static void main (String args[])
{
 int num=1221;
int n=num;
int reverse=0;
while(num>0)
{
int remainder=num%10;
reverse=(reverse*10)+remainder;
num=num/10;
}

if(n==reverse)
{
System.out.println(n+ "is a palindrome number");
}
else{
System.out.println(n+ "is not a palindrome number");
}
}
}
 
