package study20260106;

import java.util.Scanner;



public class HomeWorknew {



	public static void main(String[] args) {

		

	//15판 진행 >>for 문으로 ㄱㄱ
	//1판 끝날때마다 출력 따로따로 누적 for 안에 조건 다 써서 승무패 나오게 하고 다시 for 위로 올리고 반복 ㄱ

    System.out.println("가위 바위 보");
    System.out.println("1.가위 2.바위 3.보");

	 int count = 0;
	 int count2 = 0;
	 int count3 = 0;

	 for(int i =1;i<=15;i++) {

		 Scanner s = new Scanner(System.in);

		 int me = s.nextInt();

		 int you =(int)(Math.random()*3+1);

		 if(me==you) { System.out.println("무승부입니다");
          
		 count++;
		 
		 }

		 else if(me==1&&you==3||me==2&&you==1||me==3&&you==2) {

			 System.out.println("이겼습니다");
			 
			 count2++;
			 
			 }
		 
		 else {

		System.out.println("졌습니다");
		
		count3++;
		

		 }

		
		 System.out.println(count2+"승"+count+"무"+count3+"패");

		System.out.println();

		

		

		

		

		

		

		

		 

		

		 

		 

		 

		 

	 }

	 

	 

	 System.out.println("=====15판 최종결과=====");

	 System.out.println();

	 System.out.println(count2+"승"+count+"무"+count3+"패");

	 

	

	 

	 

		

		



	}



}