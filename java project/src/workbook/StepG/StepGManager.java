package workbook.StepG;

import java.util.Scanner;

public class StepGManager {
	public StepGManager() {
		int menu;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 나이 계산 및 연령대 판정\n");
			printf("2. 물의 온도 구간 판정\n");
			printf("3. 점수 계산\n");
			printf("4. 부동산 중개 수수료 계산기\n");
			printf("5. PC방 이용료 계산기\n");
			printf("6. 쇼핑몰 매출 계산기\n");
			printf("7. 놀이공원 매표소\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			
			if(menu == 0) break;
			switch(menu) {
			case 1:
				judgeAge ja = new judgeAge();
				ja.printAge();
				break;
			case 2:
				judgeDegree jd = new judgeDegree();
				jd.printDegree();
				break;
			case 3:
				calculateScore cs = new calculateScore();
				cs.printScore();
				break;
			case 4:
				realEstate re = new realEstate();
				re.printTotal();
				break;
			case 5:
				PCroom pc = new PCroom();
				pc.printMoney();
				break;
			case 6:
				shoppingMall sm = new shoppingMall();
				sm.printSale();
				break;
			case 7:
				amusementPark ap = new amusementPark();
				ap.printCharge();
				break;
			default:
				printf("잘 못 입력하셨습니다.\n");
			}
		}
		
	}
	void printf(String s){System.out.print(s);}
}
