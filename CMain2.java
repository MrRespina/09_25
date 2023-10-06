package Practice;

import java.util.Scanner;

public class CMain2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("점수를 입력해주세요 : ");
		int i = s.nextInt();

		if (i >= 90) {
			System.out.println("x 는 90과 같거나 크다.\n[A 등급입니다]");
		} else {
			System.out.println("x 는 90보다 작다.\n[B 등급입니다]");
		}

		System.out.println("=============================");
		System.out.print("점수를 입력해주세요 : ");
		i = s.nextInt();
		if (i < 4) {
			int y = 20;
			System.out.println("[y는 " + y + "]");
		} else if (i < 10) {
			int y = 10;
			System.out.println("[y는 " + y + "]");
		}

		s.close();

	}

}
