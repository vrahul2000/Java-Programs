package com.company;
import java.util.Scanner;
public abstract class Student {
    public  abstract double result();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] s = str.split("[|]");
        double result1= 0.0;
        double result2=0.0;
        int c1=0;int c = 0;
        for (int i=0;i<s.length;i++) {
            if (i==0) {
                String[] a = s[i].split(",");
                for (int k=0;k<a.length;k++) {
                    String[] b=a[k].split(" ");
                    int marks = Integer.parseInt(b[0]);
                    int credits = Integer.parseInt(b[1]);
                    c = c + credits;
                    result1 = result1 + result(marks,credits);

                }
            }
            else{
                    String [] abc =(s[i].split(","));
                    int one = Integer.parseInt(abc[0]);
                    int two = Integer.parseInt(abc[1]);
                    int three = Integer.parseInt(abc[2]);
                    c1=c1+three;
                    if(one==1){
                        result2 = result2 + result(two,three);
                    }

            }
        }
        System.out.println(result1);
        System.out.println(result2);
        System.out.println((c));
        System.out.println((c1));
        c=20;
        c1=0;
        if(result1==0) {
            System.out.println((result1) / (c));
        }else{
            System.out.println((result1 + result2) / (c+c1));
        }
    }public static  double result(int marks, int credits) {
        double sum = 0;
        if (marks >= 75) {
            int dif = marks - 75;
            double g = 9.0 + (dif * 0.04);
            sum += (g * credits);
        } else if (marks >= 60 && marks<=74) {
            int dif = marks - 60;
            double g = 8.0 + (dif * 0.07142857143);
            sum += (g * credits);
        } else if (marks >= 50 && marks <= 59) {
            int dif = marks - 50;
            double g = 7.0 + (dif * 0.1);
            sum += (g * credits);
        } else if (marks >= 40 && marks <= 49) {
            int dif = marks - 40;
            double g = 6.0 + (dif * 0.1);
            sum += (g * credits);
        } else {
            sum += (0);
        }
        return sum;
    }


}

