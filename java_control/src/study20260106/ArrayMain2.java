package study20260106;

public class ArrayMain2 {

	public static void main(String[] args) {
		String[]fruits = {"사과","딸기","배","수박","바나나","복숭아","파인애플","아보카도"};
		
		//문제1. 배열에서 과일이름이 3자 이상인것만 출력하세요 length
		
		for (int i = 0; i < fruits.length; i++) {

		    if (fruits[i].length() >= 3) {
		        System.out.println(fruits[i]);

	}

		}
		
		//문제 2 furit 배열에서 딸기와 수박은 제외하고 출력하세요
		
		//for (int i = 0; i < fruits.length; i++) {
		    //if (fruits[i] != "딸기" && fruits[i] != "수박") {
		        //System.out.println(fruits[i]);
		    //}
		//}
		
		for(String fruit:fruits) {
			
			if(fruit.equals("딸기")||fruit.equals("수박")) {
				
				System.out.println(fruit);
				
				//과일을 한줄에 4개씩 세줄로 출력할 것이다
				
				for(int i = 0;i<fruits.length;i++) {
					
					if(i%4==0) {
						System.out.println();
					}
					
					System.out.println(fruits[i]+"");
				}
				
				
			}
		}
	}
}
