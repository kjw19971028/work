package study20260106;
import java.util.Scanner;

public class bingoban {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] bingo = new int[25];

        // ===== 1~100 랜덤 중복 없이 25개 채우기 (int만 사용) =====
        for (int i = 0; i < 25; i++) {

            int num;
            int same;

            while (true) {
                num = (int)(Math.random() * 100) + 1;
                same = 0;

                for (int k = 0; k < i; k++) {
                    if (bingo[k] == num) {
                        same = 1;
                        break;
                    }
                }

                if (same == 0) break;
            }

            bingo[i] = num;
        }

        while (true) {

            // ===== 빙고판 출력 =====
            System.out.println("|---|---|---|---|---|");
            for (int i = 0; i < 5; i++) {
                for (int k = 0; k < 5; k++) {
                    if (bingo[i * 5 + k] == 0)
                        System.out.printf("|%3c", '■');
                    else
                        System.out.printf("|%3d", bingo[i * 5 + k]);
                }
                System.out.println("|");
                System.out.println("|---|---|---|---|---|");
            }

            System.out.print("숫자 입력: ");
            int user = scan.nextInt();

            // 숫자 체크
            for (int i = 0; i < 25; i++) {
                if (bingo[i] == user) {
                    bingo[i] = 0;
                    break;
                }
            }

            int end = 0;

            // ===== 가로 / 세로 =====
            for (int i = 0; i < 5; i++) {

                int raw = 0;
                int sero = 0;

                for (int k = 0; k < 5; k++) {
                    if (bingo[i * 5 + k] == 0) raw++;
                    if (bingo[k * 5 + i] == 0) sero++;
                }

                if (raw == 5) end++;
                if (sero == 5) end++;
            }

            
            int sero2 = 0;
            for (int i = 0; i < 5; i++) {
                if (bingo[i * 5 + i] == 0) sero2++;
            }
            if (sero2 == 5) end++;

           
            

            System.out.println("현재 완성 빙고: " + end + "줄");
            
            if(end==5) {
            	System.out.println("5줄 빙고 완성");
            	break;
            }
        }
    }
}

//for(int i=0;i<=24;i=i+6)