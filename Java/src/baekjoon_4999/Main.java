package baekjoon_4999;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String doctor = sc.next();
        String jaehwan = sc.next();

        boolean isGoToHospital = doctor.length() >= jaehwan.length();

        if (isGoToHospital)
            System.out.println("go");
        else
            System.out.println("no");
    }
}
