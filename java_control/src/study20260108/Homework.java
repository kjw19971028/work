package study20260108;
import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
	
		{

		        Scanner kbd = new Scanner(System.in);

		        int[] seat = new int[50]; 

		        
		        System.out.print("예약 인원 수 : ");
		        int people = kbd.nextInt();

		        int start = -1;  //.시작위치 여기로 하기
		        int count = 0;      //연속된 빈좌석수 체크하기

		        //for 하나씩 검사
		        for (int i = 0; i < seat.length; i++) {

		            if (seat[i] == 0) {  //빈 좌석일때
		                count++;

		                if (count == people) {
		                    start = i - people + 1;
		                    break;
		                }

		            } else {   
		                count = 0;
		            }
		        }

		        
		        if (start != -1) {

		           
		            for (int i = start; i < start + people; i++) {
		                seat[i] = 1;//연속좌석 1체크
		            }

		            System.out.println(
		                   people + "석 예약 완료입니다/ " +
		                    (start + 1) + "번부터 " +
		                    (start + people) + "번"
		            );

		        } else {
		            System.out.println("연속 좌석이 없습니다");
		        }

		        
		        System.out.println("현재 좌석 상태는");
		        for (int i = 0; i < seat.length; i++) {
		            System.out.print(seat[i] + " ");
		        }
		    }
		}

	}



