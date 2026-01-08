package study20260108;

import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {

        int[] seats = {
            1,0,0,0,0,0,0,0,1,1,
            1,0,1,0,0,1,0,0,1,1,
            0,1,1,0,0,0,0,1,0,0,
            0,0,0,0,0,1,0,0,0,0,
            0,1,1,1,0,0,0,0,0,0
        };

        Scanner sc = new Scanner(System.in);

        while (true) {

            
            System.out.println("좌석 상태입니다");
            for (int i = 0; i < seats.length; i++) {
                System.out.print(seats[i] + " ");
                if ((i + 1) % 10 == 0) System.out.println();
            }

            System.out.print("\n예약 인원 수 입력: ");
            int people = sc.nextInt();

            if (people > 0 && people <= 50) {

                int start = -1;

                for (int i = 0; i <= seats.length - people; i++) {

                    int c = 0;

                    for (int j = i; j < i + people; j++) {
                        if (seats[j] == 0) {
                            c++;
                        }
                    }

                    if (c == people) {
                        start = i;
                        break;
                    }
                }

                if (start == -1) {
                    System.out.println("연속 좌석이 없습니다");
                } else {
                    for (int k = start; k < start + people; k++) {
                        seats[k] = 1;
                    }

                    System.out.println(
                        people + "석 예약 완료 (" +
                        (start + 1) + "번 ~ " +
                        (start + people) + "번)"
                    );
                }

            } else {
                System.out.println("잘못된 인원 수입니다");
            }

            System.out.println();
        }
    }
}
