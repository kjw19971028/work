package study20260105;

import java.util.Scanner;

public class LoopMain2 {

	public static void main(String[] args) {
		
		
			//동전앞면뒷면 맞추기 게임 게임을 총 10판 진행하기 게임에서 내가 맞춘횟수는 총 몇번인지 출력하기 
		
		Scanner kbd = new Scanner(System.in);

        int count = 0; // 맞춘 횟수 맟출때마다 추가하기 안맞추면 넘기기

        for (int i = 1; i <= 10; i++) {

            System.out.println(i+"번째판입니다");
            
            
            System.out.print("앞면은 0, 뒷면은 1을 입력하세요 ");
            
            

            int my = kbd.nextInt(); 
            int co = (int)(Math.random() * 2); //0이나 1로 만들기

            if (co == 0) {
                System.out.println("앞면");
                
                
                } else {
                	
                	
                System.out.println("뒷면");
            }

            if (my == co) {
                System.out.println("정답");
                count++; //맞추면 횟수 추가
                
                
            } else {
                System.out.println();
            }

            System.out.println();
        }

        System.out.println("게임 종료");
        System.out.println("내가 맞춘 횟수: " + count + "번 맞췄습니다");
		
		
		}
		
}
	


/*가위바위보 총 15판 진행
 * 게임을 진행하면 1판 끝날때마다 몇승 몇패 몇무 출력하기
 * 
 */

