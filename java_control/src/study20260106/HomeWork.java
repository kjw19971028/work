package study20260106;

import java.util.Scanner;



public class HomeWork {



	public static void main(String[] args) {

		

	//15판 진행 >>for 문으로 ㄱㄱ
	//1판 끝날때마다 출력 따로따로 누적 for 안에 조건 다 써서 승무패 나오게 하고 다시 for 위로 올리고 반복 ㄱ

    System.out.println("가위 바위 보");
    System.out.println("1.가위 2.바위 3.보");

	 int drawCount = 0;
	 int winCount = 0;
	 int loseCount = 0;

	 for(int i =1;i<=15;i++) {

		 Scanner s = new Scanner(System.in);

		 int me = s.nextInt();

		 int you =(int)(Math.random()*3+1);
		 
		 int res = you-me;

		 if(res==0) { System.out.println("무승부입니다");
          
		 drawCount++;
		 
		 }

		 else if(res ==-2||res==1) {

			 System.out.println("이겼습니다");
			 
			 winCount++;
			 
			 }
		 
		 else {

		System.out.println("졌습니다");
		
		loseCount++;
		

		 }

		
		 System.out.println(winCount+"승"+drawCount+"무"+loseCount+"패");

		System.out.println();

		

		

		

		

		

		

		

		 

		

		 

		 

		 

		 

	 }

	 

	 

	 System.out.println("=====15판 최종결과=====");

	 System.out.println();

	 System.out.println(winCount+"승"+drawCount+"무"+loseCount+"패");

	 

	

	 

	 

		

		



	}



}