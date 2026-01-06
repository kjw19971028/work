package study20260106;

import java.util.Scanner;

public class Loopmain3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("=====숫자 야구=====");

        
        int com1 = (int)(Math.random() * 9) + 1;

        int com2;
        
        while (true) {
            com2 = (int)(Math.random() * 9) + 1;
            if (com2 != com1) 
            	
            	break;
        }

        int com3;
        
        while (true) {
            com3 = (int)(Math.random() * 9) + 1;
            if (com3 != com1 && com3 != com2)
            	
            	break;
        }

        while (true) {
        	
        	int strike = 0;
            int ball = 0;
            int out = 0;

            System.out.println("1~9 숫자 3개를 입력 : ");
            int user1 = scan.nextInt();
            int user2 = scan.nextInt();
            int user3 = scan.nextInt();
            
            if (user1 == com1) strike++;
            if (user2 == com2) strike++;
            if (user3 == com3) strike++;

            
            if (user1 == com2 || user1 == com3) ball++;
            if (user2 == com1 || user2 == com3) ball++;
            if (user3 == com1 || user3 == com2) ball++;

            
            if (strike == 0 && ball == 0) {
                out = 1;
            }

            
            System.out.println(strike + "스트 " + ball + "볼 " + out + "아웃");
            
            
        }
    }
}
