package Practice;

import java.util.Scanner;

public class FMain1 {

	public static void numCheck() {

		Scanner s = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = s.nextInt();

		if (num % 2 == 0) {

			System.out.println("입력된 숫자 : " + num + "이므로 짝수입니다.");

		} else {

			System.out.println("입력된 숫자 : " + num + "이므로 홀수입니다.");
		}

		s.close();

	}

	public static void main(String[] args) {

		numCheck();

	}

}
