package workbook.StepH;

import java.util.Scanner;

public class onebyone {
	private String input;
	
	public onebyone() {
		input();
	}
	
	public void printText() {
		getText();
	}
	void input() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("===========================================");
		System.out.printf("=> 문자열을 입력하세요 (x: 종료) : ");
		input = s.next();
	}
	void getText() {
		//문자가 x가 아니면 계속 반복
		while(!input.equalsIgnoreCase("X")) {
			//갯수 출력
			String list[] = input.split("");
			System.out.printf("=> 총 문자의 갯수는 %d입니다.\n", list.length);
			//갯수만큼 반복
			for(int i = 0;i< list.length; i++)
				//출력
				System.out.printf("=> %s\n", list[i]);
			System.out.println();
			input();
		}
	}
}
