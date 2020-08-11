package Exersice;

import java.util.Scanner;

//triangle area = 0.5*base*high
public class Exersicse_lab2_2 {


        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("ระบุความยาวของฐานสามเหลี่ยม :");
            double base = scanner.nextDouble();
            System.out.print("ระบุความยาวของฐานสามเหลี่ยม:");
            double high = scanner.nextDouble();

            double area = 0.5*base*high;
            System.out.println("พื้นที่สสามเหลี่ยม คือ " +area);
    }

}
