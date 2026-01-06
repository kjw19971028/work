package study20260105;
import java.util.Scanner;
public class study1 {

	public static void main(String[] args) {
		
		Scanner kbd = new Scanner(System.in);
		
		
		
		
		
		int coin = (int)Math.floor((Math.random()*2))+1;
		
		System.out.println((coin));
		
		
		System.out.println("동전 앞면 뒷면 맞추기");
		System.out.print("1=앞면, 2-뒷면  입력");
		
		int user = kbd.nextInt();
		
		if(user == coin) {
			
			System.out.println("맞추기 성공");
			
			
		}
		
		else {
			
			System.out.println("실패..");
		}

	}

}
