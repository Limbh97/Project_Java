package Ex01_RPS;

import java.util.Scanner;

public class RpsText_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int comNumber = (int) (Math.random() * 3) + 1;
		
		System.out.println("1.가위 | 2.바위 |3.보 ");
		int myNumber = sc.nextInt();
		
		//컴퓨터
		System.out.println("컴퓨터가 ");
		if(comNumber == 1) {
			System.out.println("가위");
		}else if(comNumber == 2) {
			System.out.println("바위");
		}else {
			System.out.println("보");
		}
		System.out.println("를 냈습니다.");
		
		//사용자
		System.out.println("사용자가 ");
		if(myNumber == 1) {
			System.out.println("가위");
		}else if(myNumber == 2) {
			System.out.println("바위");
		}else {
			System.out.println("보");
		}
		System.out.println("를 냈습니다.");
		
		//결과
		if(comNumber == myNumber) {
			//같은 값을 냈을때
			System.out.println("비겼습니다.");
		}else if((comNumber == 1 && myNumber==2) || (comNumber==2 && myNumber ==3) || (comNumber == 3 && myNumber ==1)) {
			//이겼을때
			System.out.println("이겼습니다.");
		}else {
			System.out.println("졌습니다.");
		}
		
	}
	


}
