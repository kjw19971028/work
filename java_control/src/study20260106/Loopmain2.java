package study20260106;
import java.util.Scanner;

public class Loopmain2 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		Scanner kbd = new Scanner(System.in);

        System.out.print("7부터 21까지 중 숫자 하나 입력: ");
        int user = kbd.nextInt();
        
        int min =1;
        int max = 50;
        
        while(true) {
        	int com = (int)Math.floor(Math.random()*(max-min+1))+min;
        	
        	if(com>user) {
        		
        		System.out.println("Down");
        		max = com -1;
        	}
        	
        	if(com<user) {
        		
        		System.out.println("UP");
        		
        		min = com+1;
        	}
        	
        	if(user == com) {
        		
        		System.out.println("정답");
        		
        		break;
        	}
        }
        
        
}
}