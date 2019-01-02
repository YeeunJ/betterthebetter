package workbook.StepI;

import java.util.Scanner;

public class TheMenu {
	final static int sale[] = {15000,10000,7000,2000};
	private int order;
	private int total = 0;
	public TheMenu () {
		input();
	}
	public void printTotal() {
		System.out.printf("\n총 주문 금액은 %d원입니다.\n", total);
	}
	
	void ShowMenu() {
		System.out.println("1. 피자(15,000원), 2. 스파게티(10,000원), 3. 샐러드(7,000원), 4. 음료수(2,000원)");
	}
	
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//계속 반복
		while(true) {
			ShowMenu();
			System.out.printf("메뉴를 선택해 주세요.(종료 : 5)");
			order = s.nextInt();
			//값이 0이면 끝
			if(order == 5) break;
			else
				//값 계산, 각자 더하고
				total += sale[order-1];
			//total에 더하기
			System.out.printf("현재까지의 주문 금액은 %d원입니다.\n\n", total);
		}
	}
}
