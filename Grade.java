// Write a program to display the grade
// above 90=grad A1
// between 80 to 90-grade a2
// between 70 to 79-grade b1
// between 60 to 69-grade b2
// between 50 to 59-grade c1
// between 40 to 49-grade c2
// below 40-grade d

import java.util.*;
public class Grade
{
    public static void main(String args[])
    {
        String grade;
        Scanner sc = new Scanner(System.in);
        int marks;
        System.out.printf("Enter your marks: ");
        marks = sc.nextInt();
        if ( marks>90)
        {
            grade="a1";
        }
        else if (marks>80)
        {
            grade="a2";
        }
        else if (marks>70)
        {
            grade="b1";
        }
        else if (marks>60)
        {
            grade="b2";
        }
        else if (marks>50)
        {
            grade="c1";
        }
        else if (marks>40)
        {
            grade="c2";
        }
        else
        {
            grade="d";
        }
        System.out.printf("Grade: %s",grade);
    }
}
