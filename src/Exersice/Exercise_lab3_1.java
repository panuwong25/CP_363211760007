package Exersice;

import com.sun.org.glassfish.external.statistics.AverageRangeStatistic;

import java.util.Scanner;

//รับค่าตัวเลขจากผู้ใช้จำนวน 5 ครั้ง จากนั้นแสดงผลรวม และค่าเฉลี่ย
public class Exercise_lab3_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double total = 0;
        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter number: ");
            double num = sc.nextDouble();
            total += num; //total = total-num
        }
        //find average value
        double avy = total / 5;

        //display
        System.out.println("Total:" + total);
        System.out.println("Average");

    }//main
}//class
