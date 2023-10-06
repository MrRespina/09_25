package Practice;

import java.util.Scanner;

public class CMain4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("직업 입력 : ");
		String get = s.nextLine();
		

		System.out.print("가능 업무 : ");
		switch (get) {	
		case "DBA": case "dba": case "데이터베이스관리자":
			System.out.print("전원 관리,백업/복구,");
		case "DBP": case "dbp": case "데이터베이스개발자":
			System.out.print("명령어로 CRUD,");
		case "DBU": case "dbu": case "데이터베이스사용자":
			System.out.print("서비스 활용");
			break;
		default:
			System.out.print("관련된 업무가 존재하지 않습니다.");
			break;
		}
	
		s.close();
		
	}

}
