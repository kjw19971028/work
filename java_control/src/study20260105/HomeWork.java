package study20260105;


import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.print("주차 시간을 입력하세요: ");
        int time = kbd.nextInt();

        int sum= 0;
        int uptime;

      
        if (time >= 240)
        {
        	
        	
            sum = 2500;
            uptime = time - 240;
          } else {
            sum = 3000;
            uptime = time - 30;
            
         }

        
        if (uptime < 0) {
        	
            uptime = 0;
        }

      
        if (uptime > 0) {
            sum += (uptime / 10) * 100;
        }

        System.out.println("요금은 " + sum + "원 입니다.");
    }
}