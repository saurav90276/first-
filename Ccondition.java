package JAVA;

import java.util.Scanner;

public class Ccondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score > 100){
            System.out.println("Insufficient Data");
        }
        else if (101 > score & score > 90) {
            System.out.println("Grade A");
        }
        else if (90 > score & score > 75) {
            System.out.println("Grade B");
        }
        else if (75 > score & score > 50) {
            System.out.println("Grade C");
        }
        else {
            System.out.println("Fail");
        }
    }
}
