package study20260105;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {

        int cost = 1000;     // 기본 요금
        int inc = 100;       // 추가 요금 (10분당)
        
        Scanner kbd = new Scanner(System.in);

        System.out.print("주차 시간을 입력하세요: ");
        int ptime = kbd.nextInt();

        ptime /= 10; // 10분 단위로 변환

        if (ptime >= 24) {          // 240분 이상
            cost = 2500;
            ptime -= 24;
        } else if (ptime > 3) {     // 30분 초과
            ptime -= 3;
        } else {                    // 30분 이하
            ptime = 0;
        }

        int price = cost + ptime * inc;
        System.out.println("주차 요금: " + price + "원");

        kbd.close();
    }
}