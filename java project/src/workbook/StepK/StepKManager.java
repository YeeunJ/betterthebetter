package workbook.StepK;

import java.util.Scanner;

public class StepKManager {
	public StepKManager() {
		int menu;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 메뉴판 저장하기 1\n");
			printf("2. 메뉴판 저장하기 2\n");
			printf("3. 좌표 저장하기 1\n");
			printf("4. 좌표 저장하기 2\n");
			printf("5. 사용자 목록 저장하기 1\n");
			printf("6. 사용자 목록 저장하기 2\n");
			printf("7. 학생 점수 결과 저장하기\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			
			if(menu == 0) break;
			switch(menu) {
			case 1:
				K01 k1 = new K01();
				break;
			case 2:
				K02 k2 = new K02();
				break;
			case 3:
				K03 k3 = new K03();
				break;
			case 4:
				K04 k4 = new K04();
				break;
			case 5:
				K05 k5 = new K05();
				break;
			case 6:
				K06 k6 = new K06();
				break;
			case 7:
				K07 k7 = new K07();
				break;
			default:
				printf("잘 못 입력하셨습니다.\n");
			}
		}
		
	}
	void printf(String s){System.out.print(s);}
}
