package lab3;

import java.util.Scanner;
public class Example_Do_whiie {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Exnter integer: ");
            num = sc.nextInt();
        } while (num != 0);
        System.out.println("End Good Bay");
    }//main
}//class