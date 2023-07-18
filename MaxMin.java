import java.lang.*;
import java.util.*;
public class MaxMin
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int n=sc.nextInt();
		int a[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            System.out.printf("Enter the array element %d:",i+1);
            a[i]=sc.nextInt();
        }
         int max=a[0];
         int min=a[0];
        for(i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println(max);
	  System.out.println(min);
}}
