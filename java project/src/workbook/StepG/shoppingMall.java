package workbook.StepG;

import java.util.Scanner;

public class shoppingMall {
	private int order;
	private int sale = 0;
	private int total_sale;
	private int total_order[] = {0,0,0};
	private int price[] = {10000, 6000, 3000};
	
	public shoppingMall() {
		System.out.println("세 종류의 제품이 있습니다.\n(1. 가죽장갑 1만원, 2. 털장갑 6천원, 3. 비닐장갑 3천원");
		input();
	}
	public void printSale() {
		for(int i = 0; i< 3; i++)
			System.out.printf("%d번 제품을 구매한 갯수는  총 %d개 입니다.\n",i+1, total_order[i]);
		System.out.printf("지금까지의 총 매출금액은 %d원입니다.\n", total_sale);
	}
	
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//계속 반복
		while(true) {
			sale = 0;
			//3번 반복
			for(int i = 0; i < 3; i++) {
				//입력
				System.out.printf("%d번 제품은 몇 개를 구입하실래요?", i+1);
				order = s.nextInt();
				//값 계산, 각자 더하고
				sale += order*price[i];
				total_order[i] += order;
			}
			//값이 0이면 끝
			if(sale == 0) break;
			//total에 더하기
			total_sale += sale;
			System.out.printf("판매금액은 %d원입니다.\n\n", sale);
		}
	}
}
