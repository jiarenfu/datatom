package com.company;
import java.util.Scanner;

public class Tes {

    public static void main(String[] args) {
        System.out.println("s输入一个字符");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringBuffer stb = new StringBuffer();
        char[] c = str.toCharArray();
        System.out.println("打印出其中所有的数字:");
        for (int i = 0; i < c.length; i++) {
            if (Character.isDigit(c[i])) {//判断是否为包含数字
                stb.append(c[i]);


            }
        }
        System.out.println(stb);
    }
}
