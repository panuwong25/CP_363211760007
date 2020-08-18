package lab3;

import java.util.Scanner;
//จับค่าจำนวนเติมจากผู้ใช้ เมื่อผู้ใช้ไส่ค่า 0 ให้จบการทำงาน
public class Example_while{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num=1;

        while (num !=0){
            System.out.println();
            num = sc.nextInt();
        }
       System.out.println("End Good Bye");
    }//maim
}//class






