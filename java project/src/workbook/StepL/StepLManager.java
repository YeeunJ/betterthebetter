package workbook.StepL;

import java.util.Scanner;

public class StepLManager {
	public StepLManager() {
		int menu;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 메뉴판 저장하기\n");
			printf("2. 주차장 입출력 관리\n");
			printf("3. 식당 주문 관리\n");
			printf("4. 학생 정보 관리\n");
			printf("=>원하는 메뉴는?(0:exit):");
			menu = s.nextInt();
			
			if(menu == 0) break;
			switch(menu) {
			case 1:
				MenuPan mp = new MenuPan();
				break;
			case 2:
				ParkingLot pl = new ParkingLot();
				break;
			case 3:
				restaurant rt = new restaurant();
				break;
			case 4:
				StudentInfo si = new StudentInfo();
				break;
			default:
				printf("잘 못 입력하셨습니다.\n");
			}
		}
		
	}
	void printf(String s){
		System.out.print(s);
	}
}
