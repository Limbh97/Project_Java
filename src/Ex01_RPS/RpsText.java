package Ex01_RPS;

import java.util.Scanner;

public class RpsText {

	public static void main(String[] args) {
//		Rock, Scissor, Paper
		Scanner sc = new Scanner(System.in);
		String[] ran = { "가위", "바위", "보" };

		for (int i = 0; i < 1; i++) {
			System.out.print("가위, 바위, 보: ");
			String me = sc.nextLine();

			int tmp = (int) (Math.random() * 3);
			System.out.println(ran[tmp]);

			while (me.equals("가위")) {
				if (tmp == 0) {
					System.out.println("Draw!");
					break;
				}
				if (tmp == 1) {
					System.out.println("You Win!");
					break;
				}
				if (tmp == 2) {
					System.out.println("You lose!");
					break;
				}

				while (me.equals("바위")) {
					if (tmp == 0) {
						System.out.println("Draw!");
						break;
					}
					if (tmp == 1) {
						System.out.println("You Win!");
						break;
					}
					if (tmp == 2) {
						System.out.println("You lose!");
						break;
					}
					
					while (me.equals("보")) {
						if (tmp == 0) {
							System.out.println("Draw!");
							break;
						}
						if (tmp == 1) {
							System.out.println("You Win!");
							break;
						}
						if (tmp == 2) {
							System.out.println("You lose!");
							break;
						}

					}
				}
			}

		}
	}
}
