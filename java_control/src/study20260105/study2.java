package study20260105;
import java.util.Scanner;
public class study2 {

	public static void main(String[] args) {
		
		/*//컴퓨터와 함께 하는 가위바위보 게임
		//1 가위 2 바위 3 보
		//컴퓨터의 가위바위보는 랜덤으로
		//나의 가위바위보 갚은 키보드 입력으로
		//내가 이겼는지 졌는지 비겼는지 출력
		
		Scanner kbd = new Scanner(System.in);
		
		int com = (int)(Math.random()*3+1);
		
		
		System.out.println("1.가위 2.바위 3.보");
		System.out.println("선택하세요");
		int user=kbd.nextInt();
		
		if(com == user) {
			
			System.out.println("비겼습니다");
			
		}
		
		else if((com == 1 && user == 2)||(com == 2 && user ==3)||(com ==3 && user == 1)) {
			
			System.out.println("이겼습니다");
		}
		
		else {
			
			System.out.println("졌습니다");
		}
		
		
		
		int res = user - com;
		if(res == 0) {
			
			System.out.println("비김");
			
			else if(res == -2||res ==1) {
				
				System.out.println("패배")
			}
		}
	//여러 관점으로 보기	*/

	}

}
