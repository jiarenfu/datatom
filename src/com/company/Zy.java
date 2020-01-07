package com.company;
import java.io.IOException;
import java.util.Scanner;

public class Zy {

    public static void main(String[] args) throws IOException {
        int n;
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        char[] input=new char[n];
        for(int i=0;i<n;i++)
        {
            char c=(char)System.in.read();
            input[i]=c;
        }
        long count=0;
        for(int i=0;i<input.length-2;i++)
        {
            i++;
            if((input[i]>='A'&& input[i]<='Z')&&(input[i+1]>='A'&& input[i+1]<='Z'))
            {

                count+=4;
            }
            if((input[i]>='A'&& input[i]<='Z')&&(input[i+1]>='a'&& input[i+1]<='z'))
            {
                count+=3;
            }
            if((input[i]>='a'&& input[i]<='z')&&(input[i+1]>='A'&& input[i+1]<='Z'))
            {
                count+=3;
            }
            //if((input[i]>='a'&& input[i]<='z')&&(input[i+1]>='a'&& input[i+1]<='z'))
            else
            {
                count+=2;
            }
/*                if((input[i]>='A'&& input[i]<='Z')&&(input[i+1]>='a'&& input[i+1]<='z'))
                {
                    count+=3;
                }*/

        }

        System.out.println(count);


    }



}
