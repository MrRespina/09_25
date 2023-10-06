package Practice;

import java.util.Scanner;

public class CMain1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int i = s.nextInt();

		if (i == 10) {
			System.out.println("숫자 : 10");
		} else if (i == 5) {
			System.out.println("숫자 : 5");
		} else {
			System.out.println("조건 불일치");
		}

		s.close();

	}

}
