package Practice;

import java.util.Random;
import java.util.Scanner;

public class FMain_01 {

	public static int randomizeNumber() {

		return new Random().nextInt(100) + 1;

	}

	public static String checkNum(int rand) {

		return (rand % 2 == 0) ? "짝수" : "홀수";

	}

	public static String insertString() {
		//while 구문 예외처리
		Scanner s = new Scanner(System.in);
		boolean b = false;
		String insert = "";

		while (b == false) {

			System.out.print("홀수일까요 짝수일까요 ? : ");
			insert = s.next();

			if (insert.equals("홀수") || insert.equals("짝수")) {

				b = true;
				break;

			} else {

				System.out.println("정확한 값을 입력해주세요 !");

			}

		}

		s.close();
		return insert;

	}
	
	public static String insertString2() {
		//재귀 호출
		Scanner s = new Scanner(System.in);
		System.out.print("홀수일까요 짝수일까요 ? : ");
		String insert = s.next();
		boolean b = insert.equals("홀수")||insert.equals("짝수");
		String tr = (b==true)?insert:insertString2();
		s.close();
		return tr;

	}

	public static String checkRequest(String num, String num2) {

		return (num.equals(num2)?"[정답]":"[오답]");

	}

	public static void printRequest(int i, String com, String my, String b) {

		System.out.println("=====================");
		System.out.println("컴퓨터가 생성한 값 = " + i);
		System.out.println("컴퓨터가 판단한 값 = " + com);
		System.out.println("내가 입력한 값 = " + my);
		System.out.println("======= "+b+" =======");
		System.out.println("=====================");

	}

	public static void main(String[] args) {

		int i = randomizeNumber();
		String com = checkNum(i);
		String my = insertString2();
		String b = checkRequest(com, my);
		printRequest(i, com, my, b);

	}

}
