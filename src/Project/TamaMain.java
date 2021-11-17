package Project;

import java.util.*;


public class TamaMain {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		List<TamaDTO> monster = new ArrayList<TamaDTO>();
		boolean run = true;
		TamaService ts = new TamaService();
		
		while (run) {
			System.out.println("------------------------------------------------------------------");
			System.out.println("1.로그인 | 2.캐릭터선택 | 3.밥주기 | 4.재우기 | 5.놀아주기 | 6.정보확인 | 7.종료");
			System.out.println("------------------------------------------------------------------");
			System.out.print("고르시오!> ");
			int num = scan.nextInt();

			if (num == 1) {
				ts.idLogin();
			} else if (num == 2) {
				ts.Character();
			} else if (num == 3) {
				monster = ts.eat(monster);
			} else if (num == 4) {
				monster = ts.sleep(monster);
			} else if (num == 5) {
				monster = ts.play(monster);
			} else if (num == 6) {
				monster = ts.printInfo(monster);
			} else if(num == 7){
				System.out.println("종료합니다.");
				run = false;
			}else {
				System.out.println("다시 선택해주세요.");
				
			}

		}
	}

}
