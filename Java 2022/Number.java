/*A Class called Number has been defined to find the frequency of each digit
present in it and the sum of the digits and to display the results. Some
 members of the class number are given below:
Data Member
        num = long integer type
functions
Number Constructor to assign
Number (long n) Constructor to assign n to num
void digitfrequency () to find the frequency of each digit and to display it
int sumdigits() to return the sum of digits of the number*/

import java.util.*;
public class Number
{
    long num;
    Number()
    {
        num=0;
    }
    Number(long n)
    {
        num=n;
    }
    int sumDigits()
    {
        int  sum =0;
        long n=num;
        while(n>0)
        {
            sum= (int) (sum+n%10);
            n=n/10;
        }
        return sum;
    }
    void digitFrequency()
    {
        for (int i=0;i<=9;i++)
        {
            long n=num,c=0;
            while(n>0)
            {
                long digit=n%10;
                if(digit==i)
                    c=c+1;
                n/=10;
            }
            if(c>0)
            System.out.println("Frequency of digit"+i+"is=\t"+ c);

        }
    }

    public static void main(String[] args) {
        Number obj=new Number();
        Scanner scr=new Scanner(System.in);
        System.out.println("enter the number");
        long s=scr.nextLong();
        Number obj1=new Number(s);
        System.out.println("Sum of digits is "+(obj1.sumDigits()));
        obj1.digitFrequency();
    }
}