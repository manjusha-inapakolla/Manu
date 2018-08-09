import java.util.*;
import java.lang.*;
import java.util.Scanner.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
  public static void main (String[] args) throws java.lang.Exception
  {
    int n,a,d,val=0;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    a=sc.nextInt();
    d=sc.nextInt();
    val=(n*(2*a+(n-1)*d))/2;
    System.out.println(val);
    }
}
