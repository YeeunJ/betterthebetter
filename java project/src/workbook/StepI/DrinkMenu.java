package workbook.StepI;

import java.util.Scanner;

public class DrinkMenu {
	private int count = 0;
	private int kind;
	private int sale[] = {700, 300, 1000, 500, 600};
	private int total = 0;
	private String more;
	
	public DrinkMenu() {
		input();
	}
	
	public void printSale() {
		System.out.printf("%d개의 음료를 선택 하여 총 %d원입니다.\n", count, total);
	}
	
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//계속 반복
		while(true) {
			total += SelectCan();
			//더 필요한지 묻고 받기
			System.out.printf("더 필요하십니까? (Y/N)");
			more = s.next();
			if(more.equalsIgnoreCase("N")) break;
		}	
	}
	
	int SelectCan() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		//묻고 입력받고
		System.out.println("1.콜라(700원) 2.원두커피(300원) 3.레몬주스(1000원) 4.홍차(500원) 5.코코아(600원)");
		System.out.printf("메뉴를 선택해주세요 : ");
		kind = s.nextInt();
		return this.sale[kind-1];
	}
}
