package Practice;

import java.util.Scanner;

public class FMain3 {

	// 1. 3보다 작은 정수를 하나 입력받아 다른곳에서 사용할 함수(3보다 큼 = 재입력 해야함)
	static Scanner s = new Scanner(System.in);

	public static int numCheck() {

		System.out.print("3 미만 정수 입력 : ");
		int num = s.nextInt();
		return (num < 3) ? num : numCheck();

	}

	public static int oddCheck() {

		System.out.print("홀수 입력 : ");
		int i = s.nextInt();
		return (i % 2 == 1) ? i : oddCheck();

	}

	public static int numCheck2() {

		System.out.print("1~100 까지의 정수 입력 : ");
		int i = s.nextInt();
		return (i>=1&&i<=100) ? i : numCheck2();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("3 미만 정수 " + numCheck() + " 입력 성공!");
		System.out.println("홀수 " + oddCheck() + " 입력 성공!");
		System.out.println("1~100 까지의 정수 " + numCheck2() + " 입력 성공!");
		s.close();

	}

}
