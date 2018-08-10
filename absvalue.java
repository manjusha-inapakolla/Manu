import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int h1=sc.nextInt();
		int m1=sc.nextInt();
		int h2=sc.nextInt();
		int m2=sc.nextInt();
		int d1=h1-h2;
		int d2=m1-m2;
		if(d1<=0&&d2<=0)
		System.out.println(-d1+" "+-d2);
		else if(d1<=0&&d2>=0)
		System.out.println(-d1+" "+d2);
		else if(d1>=0&&d2<=0)
		System.out.println(d1+" "+-d2);
		else
		System.out.println(d1+" "+d2);
	}
}
