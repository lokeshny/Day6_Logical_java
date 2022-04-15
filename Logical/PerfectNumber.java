package com.Bridgelab.Logical;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class PerfectNumber {
    static Scanner sc = new Scanner(System.in);
    static Logger logger = Logger.getLogger(PerfectNumber.class);
    public static void main (String[] args) {
        BasicConfigurator.configure();
        logger.info(factors());


    }
    public static Object factors()
    {
        logger.info("enter the number you want to check for perfect number ");
        int z = sc.nextInt();
        int count = 0;
        for (int i = 1;i<z;i++){

            if(z%i==0){
                logger.info(i+" ");
                count+=i;

            }

        }
        if (count==z){
            logger.info("the entered number is a perfect number its divisor sum is "+ count);
        }
        else
            logger.info("Entered number is not an perfect number its divisor sum is  "+count);

        return null;
    }
}
