package study20260105;
import java.util.Scanner;
public class study3 {

	public static void main(String[] args) {
		
		/*//int dice = (int)Math.floor(Math.random()*6)+1;
		
		/*System.out.println("주사위 맟추기 게임!");
		System.out.println("1~6 중에 하나 입력:");
		int num = sc.nextInt();*/
		
		int com = (int)Math.floor(Math.random()*6+1);
		
		int user = (int)Math.floor(Math.random()*6+1);
		
		//조건 안에 조건
		
		if(user >com || (user == 1 & com == 6)) {
			
			if(user == 6 & com ==1) {
				System.out.println("나의 패배");
			}
		}
		
		
		

	}

}
