package study20260102;

import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
		
	Scanner kbd = new Scanner(System.in);
	
	System.out.println("키를 입력하세요");
	
	
	
	int tall = kbd.nextInt();
	
	if(tall >=145) {
		
		System.out.println("탑승 가능합니다");
	}
	
	else {
		System.out.println("탑승 불가합니다");

		
	}
	
	
			
		

	}

}

