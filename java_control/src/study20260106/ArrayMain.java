package study20260106;

public class ArrayMain {

	public static void main(String[] args) {
		
		int[]arr = new int[5];
		
		//arr은 참조변수이다.참조변수는 메모리주소를 저장할 수 있는 변수이다
		//배열의 인덱스는 0부터 시작이다
		
		arr[0]=30;
	    arr[1]=60;
	    arr[2]=70;
	    arr[3]=40;
	    arr[4]=50;
		
		
		for(int num :arr)
		//arr이라는곳에 있는거 하나씩 뽑아서 변수 num에 저장//향상된 for문
			{
			if(num>50) {
				
				System.out.println(num);
			}
			
			
		}
	
			
		
	}

}
