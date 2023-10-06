package Practice;

import java.util.Scanner;

public class FMain2 {
	
	static int result = 0;
	
	public static int insertNum(int i) {
			
		System.out.print(i+" ");
		
		result = result+i;
		return (i>1)?insertNum(i-1):result;
		
	}
	
	public static int insertNum2(int i) {
		
		return (i==1)?1:(i+insertNum2(i-1));
		
	}
	
	public static int mul(int i) {
		
		System.out.print((i>1)?i+" * ":i+" = ");
		return (i==1)?1:(i*mul(i-1));
		
	}
	
	public static int fibo(int i) {
		
		return (i<3)?1:(fibo(i-1)+fibo(i-2));
		
	}
	
	public static void print() {
		
		Scanner s = new Scanner(System.in);
		System.out.print("재귀호출 테스트에 사용될 숫자 : ");
		int i = s.nextInt();
		System.out.print(i+" = ");
		
		System.out.println("\n총 합 = "+insertNum(i));
		s.close();
		
	}
	
	public static void main(String[] args) {
		
		//print();
		System.out.println(insertNum2(10));
		System.out.println(mul(5));
		System.out.println(fibo(6));
		
	}

}
