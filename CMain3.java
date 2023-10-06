package Practice;

import java.util.Random;

public class CMain3 {

	public static void main(String[] args) {

		/*
		 * Scanner s = new Scanner(System.in); System.out.print("x : "); int num =
		 * s.nextInt();
		 * 
		 * switch (num) { case 1: System.out.println("1 입니다."); break;
		 * 
		 * case 2: System.out.println("2 입니다."); break;
		 * 
		 * case 3: System.out.println("3 입니다."); break;
		 * 
		 * default: System.out.println("그 외 나머지 입니다."); break; }
		 * 
		 * s.close();
		 */
		
		int r = new Random().nextInt(3)+1;
		switch (r) {
		case 2:
			System.out.println(r+"은 소수입니다.");
			break;
		case 3:
			System.out.println(r+"은 소수입니다.");
			break;
		default:
			System.out.println(r+"은 소수가 아닙니다.");
			break;
		}

	}

}
