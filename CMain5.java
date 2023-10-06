package Practice;

import java.util.Scanner;

//각 달마다 며칠까지 있는지 다 다름. 월 입력받아 몇일까지 있습니다 로 출력.(2월은 28일 까지.)
//그 외에는 없는 달로.
//1월은 31일까지 있습니다. 이런식으로 나오게끔

public class CMain5 {

	static Scanner s = new Scanner(System.in);

	public static int getMonth() {

		System.out.print("찾을 월을 입력해주세요 : ");
		int i = s.nextInt();

		return i;

	}

	public static void getDay(int month) {

		int day = 0;

		switch (month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			day = 31;
			break;
		case 4:case 6:case 9:case 11:
			day = 30;
			break;
		case 2:
			day = 28;
			break;
		default:
			System.out.println("없는 달입니다 !");
			break;
		}

		if (day != 0) {
			System.out.println(month + "월은 " + day + "일 까지 있습니다.");
		} else {
			System.out.println("1과 12 사이의 숫자를 입력해주세요.");
		}

	}

	public static void main(String[] args) {

		getDay(getMonth());

	}

}
