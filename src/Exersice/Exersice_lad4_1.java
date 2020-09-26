package Exersice;

// 1.Triangle 5.0 * b * h
// 2. Cone = (Pi * r * l) + (Pi * r * r)
// 3. Circle = 2 * Pi * r

import java.util.Scanner;

public class Exersice_lad4_1 {
    public static final double PI = 3.141;

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        //display menu
        System .out.println("Please,select option below:");
        System .out.println("1. Find area of Triangle:");
        System .out.println("2. Find area of Cone:");
        System .out.println("3. Find area of Circle:");
        System .out.println("4. Exit:");
        System .out.println("Select:");
        int select = sc.nextInt();

        //swith-case
        switch (select){
            case 1:
                System.out.print("Enter base");
                double b = sc.nextDouble();
                System.out.print("Enter High");
                double h = sc.nextDouble();
                double area = findArea(b, h);
                System.out.println("The area of Triangle: "+area);
                break;

            case 2:
                System.out.print("Enter : รัศมีของทรงกรวย: ");
                double r = sc.nextDouble();
                System.out.print("Enter : ความสูงเอียงของทรงกรวย: ");
                double l = sc.nextDouble();
                double cone =findAeraCone(r,l);
                System.out.println("The area of Cone: "+cone);
                break;

            case 3:System.out.print("Enter : รัศมีของวงกลม: ");
                double pi = sc.nextDouble();
                double Circle = findAeraCircle (PI);
                System.out.println("The area of Circle: "+Circle);
                break;

            case 4: System.exit(1); break;
            default:System.out.println("Please,select number 1-4.");

        }

    }
    //triangle
    public static double findArea (double b, double h ){
        return 0.5 * b * h;

    }
    //Cone
    public static double findAeraCone (double r, double l){
        return (PI * r * l) + (PI * r * r);
    }
    //Circle
    public static double findAeraCircle (double r){
        return 2 * PI * r;
    }
}//class
