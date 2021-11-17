package Project;

import java.util.List;
import java.util.Scanner;

public class TamaService {
	int exp = 0;
	int hp = 50;
	int lv = 1;

	Scanner sc = new Scanner(System.in);

	// 로그인 체크 메서드
	// 메서드이름:loginCheck
	// 리턴타입: List<LoginDTO>
	// 매개변수: joinList
	void idLogin() {
		System.out.print("id: ");
		String id = sc.nextLine();
		System.out.print("pw: ");
		String pw = sc.nextLine();
		System.out.println("로그인성공! 환영합니다!");
	}

	// 캐릭터 선택 메서드
	void Character() {
		System.out.println("---------------------------");
		System.out.println("1.파이리 | 2.꼬부기 | 3.치코리타");
		System.out.println("---------------------------");
		System.out.print("선택> ");
		int Character = sc.nextInt();
			if (Character == 1) {
				System.out.println("파이리를 선택 하셨습니다");
			} else if (Character == 2) {
				System.out.println("꼬부기를 선택 하셨습니다");
			} else if (Character == 3) {
				System.out.println("치코리타를 선택 하셨습니다");
			} else {
				System.out.println("잘못입력하셨습니다.");
			}
	}

	// 밥먹기 메서드
	public List<TamaDTO> eat(List<TamaDTO> tamaList) {
		// 밥먹기
		hp += 30;
		System.out.println("호로록!! hp Up!");
		System.out.println("hp + 25!!");
		return tamaList;
	}

//잠자기 메서드
	public List<TamaDTO> sleep(List<TamaDTO> tamaList) {
		// 잠자기
		hp += 10;
		System.out.println("쿠우울Zzz...hp Up!");
		System.out.println("hp + 10!!");
		return tamaList;
	}

//놀아주기 메서드
	public List<TamaDTO> play(List<TamaDTO> tamaList) {
		Scanner sc = new Scanner(System.in);
		int comNumber = (int) (Math.random() * 3) + 1;
		System.out.println("가위바위보 게임!");
		System.out.println("--------------------");
		System.out.println("1.가위 | 2.바위 |3.보 ");
		System.out.println("--------------------");
		System.out.print("선택>");
		int myNumber = sc.nextInt();

		// 컴퓨터
		System.out.println("몬스터가 ");
		if (comNumber == 1) {
			System.out.println("가위");
		} else if (comNumber == 2) {
			System.out.println("바위");
		} else {
			System.out.println("보");
		}
		System.out.println("를 냈습니다.");

		// 사용자
		System.out.println("내가 ");
		if (myNumber == 1) {
			System.out.println("가위");
		} else if (myNumber == 2) {
			System.out.println("바위");
		} else {
			System.out.println("보");
		}
		System.out.println("를 냈습니다.");

		// 결과
		if (comNumber == myNumber) {
			// 같은 값을 냈을때
			System.out.println("비겼습니다.");
		} else if ((comNumber == 1 && myNumber == 2) || (comNumber == 2 && myNumber == 3)
				|| (comNumber == 3 && myNumber == 1)) {
			// 이겼을때
			System.out.println("이겼습니다.");
		} else {
			System.out.println("졌습니다.");
		}

		hp -= 30;
		exp += 30;
		System.out.println("체력방전...hp Down");
		System.out.println("exp Up!");
		System.out.println("hp -30 + exp +30");
		return tamaList;
	}

	// 정보창 확인 메서드
	public List<TamaDTO> printInfo(List<TamaDTO> tamaList) {
		System.out.println("==================");
		System.out.println("    캐릭터 정보창    ");
		System.out.println("  exp: " + exp);
		System.out.println("  hp: " + hp);
		System.out.println("  lv: " + lv);
		System.out.println("===================");
		return tamaList;
	}

}
