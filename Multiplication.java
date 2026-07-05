// Write a program to generate multiplication table for a given number in the
// format
// 3*1=3
// 3*2=6

import java.util.*;
public class Multiplication
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.printf("Enter the number: ");
        n = sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.printf("%d x %d = %d\n",n,i,n*i);
        }
    }
}