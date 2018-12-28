package workbook.StepI;

import java.util.Scanner;


public class StepIManager {
	public StepIManager() {
		int menu;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 메뉴판 보여주는 메소드 만들기\n");
			printf("2. 빈칸과 함께 특정 문자를 개수만큼 찍는 메소드 만들기\n");
			printf("3. 비만 판정\n");
			printf("4. 메뉴 번호 받아오는 메소드 만들기\n");
			printf("5. 최댓값 리턴하는 메소드 만들기\n");
			printf("6. 임의의 숫자를 만들어 구간을 리턴하는 메소드 만들기\n");
			printf("7. 자판기에서 선택한 음료 가격을 리턴하는 메소드 만들기\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			
			if(menu == 0) break;
			switch(menu) {
			case 1:
				TheMenu tm = new TheMenu();
				tm.printTotal();
				break;
			case 2:
				rightTriangle rt = new rightTriangle();
				rt.printChar();
				break;
			case 3: 
				@SuppressWarnings("unused") 
				FatDecision fd = new FatDecision();
				break;
			case 4:
				MenuNumber mn = new MenuNumber();
				mn.printTotal();
				break;
			case 5:
				MaxNumber max = new MaxNumber();
				max.printMax();
				break;
			case 6:
				JudgeNumber jn = new JudgeNumber();
				jn.printNumber();
				break;
			case 7:
				DrinkMenu dm = new DrinkMenu();
				dm.printSale();
				break;
			default:
				printf("잘 못 입력하셨습니다.\n");
			}
		}
		
	}
	void printf(String s){System.out.print(s);}
}
