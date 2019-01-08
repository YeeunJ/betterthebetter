package workbook.StepK;

import java.util.Scanner;

public class K02 {
	private int count;
	
	public K02() {
		count();
		inoutput();
	}
	
	void count() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.printf("등록하실 메뉴의 개수를 입력하세요 : ");
		count = s.nextInt();
	}
	
	void inoutput() {
		MenuPan mp[] = new MenuPan[count];
		for(int i=0; i<count; i++) {
			mp[i] = new MenuPan();
			System.out.printf("%d번", i+1);
			mp[i].input();
		}
		System.out.println("================================================================");
		System.out.println("메뉴번호	메뉴이름	원산지	1인분가격");
		for(int i=0; i<count; i++)
			mp[i].output();
	}
}
