package workbook.StepK;

import java.util.Scanner;

public class MenuPan {
	private int num, price;
	private String name, origin;
	
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.printf("메뉴의 번호, 메뉴명, 원산지, 가격을 입력하시오.");
		num = s.nextInt();
		name = s.next();
		origin = s.next();
		price = s.nextInt();
	}
	
	void output() {
		System.out.printf("%d	%s	%s	%d\n", num, name, origin, price);
	}
}
