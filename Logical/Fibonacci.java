package com.Bridgelab.Logical;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class Fibonacci {
    static Logger logger = Logger.getLogger(Fibonacci.class);
    public static void main (String[] args){
        BasicConfigurator.configure();

        Scanner sc = new Scanner(System.in);
        logger.info("enter the position of element you want to find");
        int n = sc.nextInt();
        logger.info(fibo(n));

    }

    public  static  int  fibo(int n){
        if (n==1) return 0;//for index1
        if (n==2) return 1;//fro index 2
        else {
            return fibo(n - 1) + fibo(n - 2);//recursion

        }
    }
}
