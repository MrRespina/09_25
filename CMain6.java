package Practice;

import java.util.Scanner;

// if문 사용해서 bmi 만들기 (함수로 기능 분할.)
// 1. 이름을 입력받는 함수
// 2. 키를 입력받는 함수 >> 애초에 m만 입력할 수 있게 . cm로 입력하면 다시 입력해야하게끔.
// 3. 몸무게 입력받는 함수
// 4. bmi 계산 식 ( bmi = 몸무게 / ( 키 * 키) )
// 5. bmi 판정 함수(if 사용) bmi < 18.5 저체중 , bmi >= 18.5 정상 , bmi >= 25 과체중 , bmi >= 30 경도비만 , bmi >= 35 중등도비만 , bmi >= 40 고도비만
// 6. 결과 출력하는 함수.(이름,키,몸무게,bmi,bmi 판정 결과)
public class CMain6 {

	static Scanner s = new Scanner(System.in);

	public static String getName() {

		System.out.print("이름을 입력해주세요 : ");
		String name = s.nextLine();
		return name;

	}

	public static Double getHeight() {

		boolean b = true;
		Double height = 0.0;

		while (b == true) {

			System.out.print("키를 입력해주세요(m 단위 소숫점) : ");
			height = s.nextDouble();

			if (height <= 0.5 || height >= 2.5) {
				System.out.println("제대로 된 숫자를 입력해주세요!");
			} else {
				b = false;
			}

		}

		return height;

		// return (height<=0.5||height>=2.5)?getHeight():height;

	}

	public static Double getWeight() {

		System.out.print("몸무게를 입력해주세요 : ");
		Double weight = s.nextDouble();
		return weight;

	}

	public static Double calcBMI(Double height, Double weight) {

		Double bmi = weight / (height * height);
		return bmi;

	}

	public static String checkBMI(Double bmi) {

		String bmiResult;

		if (bmi >= 40) {
			bmiResult = "고도비만";
		} else if (bmi >= 35) {
			bmiResult = "중등도비만";
		} else if (bmi >= 30) {
			bmiResult = "경도비만";
		} else if (bmi >= 25) {
			bmiResult = "과체중";
		} else if (bmi >= 18.5) {
			bmiResult = "정상";
		} else {
			bmiResult = "저체중";
		}

		return bmiResult;

	}

	public static void print(String name, Double height, Double weight, Double bmi, String bmiResult) {

		System.out.println("=============================");
		System.out.println("\t이름 : " + name);
		System.out.println("\t키 : " + height + "m");
		System.out.println("\t몸무게 : " + weight + "kg");
		System.out.printf("\tbmi 지수 : %.2f%%\n", bmi);
		System.out.println("\tbmi 판정 결과 : " + bmiResult);
		System.out.println("=============================");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name, bmiResult;
		Double height, weight, bmi;

		name = getName();
		height = getHeight();
		weight = getWeight();
		bmi = calcBMI(height, weight);
		bmiResult = checkBMI(bmi);

		print(name, height, weight, bmi, bmiResult);
		s.close();

	}

}
